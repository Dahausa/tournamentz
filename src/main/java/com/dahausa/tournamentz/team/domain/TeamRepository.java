package com.dahausa.tournamentz.team.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,String>{

	List<Team> findByName(String teamName);

}
