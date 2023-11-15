package com.exerciciointensivaojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exerciciointensivaojavaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
