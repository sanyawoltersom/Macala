package com.mancala.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mancala.backend.datamodels.MancalaGame;

public interface GameRepository extends MongoRepository<MancalaGame, String> {

}
