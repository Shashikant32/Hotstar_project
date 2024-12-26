public class Match {
    private String matchId;
    private String team1;
    private String team2;
    private int duration; // Duration of the match in minutes

    public Match(String matchId, String team1, String team2, int duration) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
        this.duration = duration;
    }

    public String getMatchId() {
        return matchId;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getDuration() {
        return duration;
    }
}
