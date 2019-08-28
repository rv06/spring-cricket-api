package com.cricket.api.CricketGameApi.data;

import com.cricket.api.CricketGameApi.MatchResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MatchResultRepository extends JpaRepository<MatchResult, Integer> {

    public static final String findAllResults = "SELECT * FROM MatchResult";
    @Query(value = findAllResults, nativeQuery = true)
    public List<MatchResult> findMatchDetails();

}
