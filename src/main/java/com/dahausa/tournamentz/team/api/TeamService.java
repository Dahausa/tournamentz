package com.dahausa.tournamentz.team.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dahausa.tournamentz.team.domain.Team;
import com.dahausa.tournamentz.team.domain.TeamRepository;

@RestController
@RequestMapping("api")
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository;
	
    @RequestMapping("/team/name/{name}")
    public List<Team> getTeam(@PathVariable("name") String name) {
        return teamRepository.findByName(name);
    }
    
    @RequestMapping("/team")
    public List<Team> getTeams() {
    	return teamRepository.findAll();
    }
    
    @PostMapping("/team")
    public ResponseEntity<String> addTeam(@RequestBody Team team){
        teamRepository.save(team);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @DeleteMapping("/colleagues/{name}")
    public ResponseEntity<String> deleteTeam(@PathVariable  String name){
        List<Team> searchResult = teamRepository.findByName(name);
        
        if(searchResult.isEmpty() == false) {
            teamRepository.delete(name);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
