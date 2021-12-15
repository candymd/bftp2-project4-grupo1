package org.factoriaf5.bftp2project4grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface GameRepository extends JpaRepository<Game, Long> { }
