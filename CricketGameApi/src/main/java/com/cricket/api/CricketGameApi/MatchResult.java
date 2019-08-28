package com.cricket.api.CricketGameApi;

import javax.persistence.*;

@Entity
@Table(name = "MatchResult")
@NamedQuery(name="find_all_results", query="select p from MatchResult p")
public class MatchResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int Id;
    @Column(name = "TeamBattingFirst")
    private String teamBattingFirst;
    @Column(name = "ScoreFirstInnings")
    private String scoreFirstInnings;
    @Column(name = "TeamBattingSecond")
    private String teamBattingSecond;
    @Column(name = "ScoreSecondInnings")
    private String scoreSecondInnings;
    @Column(name = "Result")
    private String result;

    public MatchResult() {
        super();
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTeamBattingFirst() {
        return teamBattingFirst;
    }

    public void setTeamBattingFirst(String teamBattingFirst) {
        this.teamBattingFirst = teamBattingFirst;
    }

    public String getScoreFirstInnings() {
        return scoreFirstInnings;
    }

    public void setScoreFirstInnings(String scoreFirstInnings) {
        this.scoreFirstInnings = scoreFirstInnings;
    }

    public String getTeamBattingSecond() {
        return teamBattingSecond;
    }

    public void setTeamBattingSecond(String teamBattingSecond) {
        this.teamBattingSecond = teamBattingSecond;
    }

    public String getScoreSecondInnings() {
        return scoreSecondInnings;
    }

    public void setScoreSecondInnings(String scoreSecondInnings) {
        this.scoreSecondInnings = scoreSecondInnings;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }




    @Override
    public String toString() {
        return String.format("\nMatchResult [Id=%s, TeamBattingFirst=%s, ScoreFirstInnings=%s, TeamBattingSecond=%s, ScoreSecondInnings=%s, Result=%s ]", Id, teamBattingFirst, scoreFirstInnings
                , teamBattingSecond, scoreSecondInnings, result);
    }
}
