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
}
