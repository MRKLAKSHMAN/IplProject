import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class MatchDetails {

   static List<MatchDetails> matchDetailsList;
    //Declaring all the fields of csv file as data members
    final int id;
    final int season;
    final String city;
    final String date;
    final String team1;
    final String team2;
    final String tosswinner;
    final String tossdecision;
    final String result;
    final int dlapplied;
    final String winner;
    final String winbyruns;
    final String winbywickets;
    final String playerofmatch;
    final String venue;
    final String umpire1;
    final String umpire2;
    final String umpire3;

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
