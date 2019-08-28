package com.cricket.api.CricketGameApi;

import javax.persistence.*;

@Entity
@Table(name = "MatchData")
@NamedQuery(name="find_all_over_data", query="select p from MatchData p")
public class MatchData {
    @Id
    @Column(name = "matchid")
    private int matchid;
    @Column(name = "overs")
    private int overs;
    @Column(name = "Team")
    private String Team;
    @Column(name = "score")
    private String Score;

    public MatchData() {
        super();
    }

    public int getMatchid() {
        return matchid;
    }

    public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    @Override
    public String toString() {
        return String.format("\nMatchResult [Id=%s, Overs=%s, Team=%s, Score=%s ]", matchid, overs, Team
                , Score);
    }


}
