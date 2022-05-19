import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class MatchDetails {

   static List<MatchDetails> matchDetailsList;
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


    public static List<MatchDetails> getMatchDetailsList(String p) throws IOException {
        Path path=Path.of(p);
        //Below code throws IOException and returns a stream of string
        //skip(1) will skip the first line because its a header
        //map individual string to respective object
        matchDetailsList= Files.lines(path).skip(1).map(line -> {return getMatchDetails(line);}).collect(Collectors.toList());
        return matchDetailsList;
    }

    //Converting line into Object and returning
    private static MatchDetails getMatchDetails(String line){
        String[] fields=new String[18];
        String[] acfields=line.split(",");
        for(int i=0;i<acfields.length;i++){
            fields[i]=acfields[i];
        }
        return new MatchDetails(Integer.parseInt(fields[0]),Integer.parseInt(fields[1]),fields[2],fields[3],fields[4],fields[5],fields[6],fields[7],fields[8],Integer.parseInt(fields[9]),
                fields[10],fields[11],fields[12],fields[13],fields[14],fields[15],fields[16],fields[17]);
    }
}
