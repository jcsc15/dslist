package com.exerciciointensivaojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exerciciointensivaojavaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
