import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class DeliveriesDetails {

    static List<DeliveriesDetails> DeliveriesDetailsList;

    final int matchid;
    final int inning;
    final String batingteam;
    final String bowlingteam;
    final int over;
    final int ball;
    final String batsman;
    final String nonstriker;
    final String bowler;
    final int issuperover;
    final int wideruns;
    final int byeruns;
    final int legbyeruns;
    final int noballruns;
    final int penalityruns;
    final int batsmanruns;
    final int extraruns;
    final int totalruns;
    final String playerdismissed;
    final String dismissalkind;
    final String fielder;

    public DeliveriesDetails(int matchid, int inning, String batingteam, String bowlingteam, int over, int ball, String batsman, String nonstriker, String bowler, int issuperover, int wideruns, int byeruns, int legbyeruns, int noballruns, int penalityruns, int batsmanruns, int extraruns, int totalruns, String playerdismissed, String dismissalkind, String fielder) {
        this.matchid = matchid;
        this.inning = inning;
        this.batingteam = batingteam;
        this.bowlingteam = bowlingteam;
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.nonstriker = nonstriker;
        this.bowler = bowler;
        this.issuperover = issuperover;
        this.wideruns = wideruns;
        this.byeruns = byeruns;
        this.legbyeruns = legbyeruns;
        this.noballruns = noballruns;
        this.penalityruns = penalityruns;
        this.batsmanruns = batsmanruns;
        this.extraruns = extraruns;
        this.totalruns = totalruns;
        this.playerdismissed = playerdismissed;
        this.dismissalkind = dismissalkind;
        this.fielder = fielder;
    }

    @Override
    public String toString() {
        return "DeliveriesDetails{" +
                "matchid=" + matchid +
                ", inning=" + inning +
                ", batingteam='" + batingteam + '\'' +
                ", bowlingteam='" + bowlingteam + '\'' +
                ", over=" + over +
                ", ball=" + ball +
                ", batsman='" + batsman + '\'' +
                ", nonstriker='" + nonstriker + '\'' +
                ", bowler='" + bowler + '\'' +
                ", issuperover=" + issuperover +
                ", wideruns=" + wideruns +
                ", byeruns=" + byeruns +
                ", legbyeruns=" + legbyeruns +
                ", noballruns=" + noballruns +
                ", penalityruns=" + penalityruns +
                ", batsmanruns=" + batsmanruns +
                ", extraruns=" + extraruns +
                ", totalruns=" + totalruns +
                ", playerdismissed='" + playerdismissed + '\'' +
                ", dismissalkind='" + dismissalkind + '\'' +
                ", fielder='" + fielder + '\'' +
                '}';
    }

    public static List<DeliveriesDetails> getDeliveriesDetailsList(String s) throws IOException {
        Path locationOfFile=Path.of(s);
        //Below code throws IOException and returns a stream of string
        //skip(1) will skip the first line because its a header
        //map individual string to respective object
        DeliveriesDetailsList= Files.lines(locationOfFile).skip(1).map(row -> {return getDeliveriesDetails(row);}).collect(Collectors.toList());
        return DeliveriesDetailsList;
    }

    private static DeliveriesDetails getDeliveriesDetails(String row){
        String[] data=new String[21];
        String[] actualdata=row.split(",");
        for(int i=0;i<actualdata.length;i++){
            data[i]=actualdata[i];
        }
        return new DeliveriesDetails(Integer.parseInt(data[0]),Integer.parseInt(data[1]),data[2],data[3],Integer.parseInt(data[4]),Integer.parseInt(data[5]),data[6],data[7],data[8],Integer.parseInt(data[9]),
                Integer.parseInt(data[10]),Integer.parseInt(data[11]),Integer.parseInt(data[12]),Integer.parseInt(data[13]),Integer.parseInt(data[14]),Integer.parseInt(data[15]),Integer.parseInt(data[16]),Integer.parseInt(data[17]),data[18],data[19],data[20]);
    }

}
