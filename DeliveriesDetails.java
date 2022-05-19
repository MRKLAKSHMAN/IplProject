import java.util.List;

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

    public static List<DeliveriesDetails> getDeliveriesDetailsList() {
        return DeliveriesDetailsList;
    }

}
