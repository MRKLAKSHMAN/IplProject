public class MatchDetails {
    //This is a POJO class
    //Teclaring all the fields of csv file as data members
    private final int id;
    private final int season;
    private final String city;
    private final String date;
    private final String team1;
    private final String team2;
    private final String tosswinner;
    private final String tossdecision;
    private final String result;
    private final int dlapplied;
    private final String winner;
    private final String winbyruns;
    private final String winbywickets;
    private final String playerofmatch;
    private final String venue;
    private final String umpire1;
    private final String umpire2;
    private final String umpire3;

    //Initializing all the fields using constructor
    public MatchDetails(int id, int season, String city, String date, String team1, String team2, String tosswinner, String tossdecision, String result, int dlapplied, String winner, String winbyruns, String winbywickets, String playerofmatch, String venue, String umpire1, String umpire2, String umpire3) {
        this.id = id;
        this.season = season;
        this.city = city;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.tosswinner = tosswinner;
        this.tossdecision = tossdecision;
        this.result = result;
        this.dlapplied = dlapplied;
        this.winner = winner;
        this.winbyruns = winbyruns;
        this.winbywickets = winbywickets;
        this.playerofmatch = playerofmatch;
        this.venue = venue;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
        this.umpire3 = umpire3;
    }

    //Declaring getter methods to enable the variables to be accessed in other classes

    public int getId() {
        return id;
    }

    public int getSeason() {
        return season;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getTosswinner() {
        return tosswinner;
    }

    public String getTossdecision() {
        return tossdecision;
    }

    public String getResult() {
        return result;
    }

    public int getDlapplied() {
        return dlapplied;
    }

    public String getWinner() {
        return winner;
    }

    public String getWinbyruns() {
        return winbyruns;
    }

    public String getWinbywickets() {
        return winbywickets;
    }

    public String getPlayerofmatch() {
        return playerofmatch;
    }

    public String getVenue() {
        return venue;
    }

    public String getUmpire1() {
        return umpire1;
    }

    public String getUmpire2() {
        return umpire2;
    }

    public String getUmpire3() {
        return umpire3;
    }

    //Overriding toString() for understandable output
    @Override
    public String toString() {
        return "MatchDetails{" +
                "id=" + id +
                ", season=" + season +
                ", city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", tosswinner='" + tosswinner + '\'' +
                ", tossdecision='" + tossdecision + '\'' +
                ", result='" + result + '\'' +
                ", dlapplied=" + dlapplied +
                ", winner='" + winner + '\'' +
                ", winbyruns='" + winbyruns + '\'' +
                ", winbywickets='" + winbywickets + '\'' +
                ", playerofmatch='" + playerofmatch + '\'' +
                ", venue='" + venue + '\'' +
                ", umpire1='" + umpire1 + '\'' +
                ", umpire2='" + umpire2 + '\'' +
                ", umpire3='" + umpire3 + '\'' +
                '}';
    }
}
