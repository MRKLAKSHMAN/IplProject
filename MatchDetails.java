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
        Path locationOfFile=Path.of(p);
        //Below code throws IOException and returns a stream of string
        //skip(1) will skip the first line because its a header
        //map individual string to respective object
        matchDetailsList= Files.lines(locationOfFile).skip(1).map(row -> {return getMatchDetails(row);}).collect(Collectors.toList());
        return matchDetailsList;
    }

    //Converting line into Object and returning
    private static MatchDetails getMatchDetails(String row){
        String[] data=new String[18];
        String[] actualdata=row.split(",");
        for(int i=0;i<actualdata.length;i++){
            data[i]=actualdata[i];
        }
        return new MatchDetails(Integer.parseInt(data[0]),Integer.parseInt(data[1]),data[2],data[3],data[4],data[5],data[6],data[7],data[8],Integer.parseInt(data[9]),
                data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17]);
    }
}
