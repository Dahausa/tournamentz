package com.dahausa.tournamentz.team.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team,String>{

	List<Team> findByName(String teamName);

}
