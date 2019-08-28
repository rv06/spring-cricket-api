package com.cricket.api.CricketGameApi;

import com.cricket.api.CricketGameApi.jpa.MatchResultJpaRepository;
import com.cricket.api.CricketGameApi.jpa.OverDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MatchController {



    @Autowired
    OverDataJpaRepository overDataJpaRepository;

    @Autowired
    MatchResultJpaRepository matchResultJpaRepository;


    @GetMapping("/all")
    public List<MatchResult> getAllResults() {
        return matchResultJpaRepository.findAll();
    }

    @GetMapping("/allOvers")
    public List<MatchData> getAllOverData() {
        return overDataJpaRepository.findAll();
    }
    @GetMapping("/{matchid}")
    public MatchResult getResultById(@PathVariable int matchid) {
        return matchResultJpaRepository.findById(matchid);
    }

    @GetMapping("/{matchid}/over/{over}")
    public MatchData getResultById(@PathVariable int matchid, @PathVariable int over) {
        return overDataJpaRepository.getDataById(matchid, over);
    }
    @GetMapping("/hello")
    public String toString(){
        return "Hello";
    }

}
