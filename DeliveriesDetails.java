import java.util.List;

public class DeliveriesDetails {

    static List<DeliveriesDetails> DeliveriesDetailsList;

    private final int matchid;
    private final int inning;
    private final String batingteam;
    private final String bowlingteam;
    private final int over;
    private final int ball;
    private final String batsman;
    private final String nonstriker;
    private final String bowler;
    private final int issuperover;
    private final int wideruns;
    private final int byeruns;
    private final int legbyeruns;
    private final int noballruns;
    private final int penalityruns;
    private final int batsmanruns;
    private final int extraruns;
    private final int totalruns;
    private final String playerdismissed;
    private final String dismissalkind;
    private final String fielder;

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

    public int getMatchid() {
        return matchid;
    }

    public int getInning() {
        return inning;
    }

    public String getBatingteam() {
        return batingteam;
    }

    public String getBowlingteam() {
        return bowlingteam;
    }

    public int getOver() {
        return over;
    }

    public int getBall() {
        return ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public String getNonstriker() {
        return nonstriker;
    }

    public String getBowler() {
        return bowler;
    }

    public int getIssuperover() {
        return issuperover;
    }

    public int getWideruns() {
        return wideruns;
    }

    public int getByeruns() {
        return byeruns;
    }

    public int getLegbyeruns() {
        return legbyeruns;
    }

    public int getNoballruns() {
        return noballruns;
    }

    public int getPenalityruns() {
        return penalityruns;
    }

    public int getBatsmanruns() {
        return batsmanruns;
    }

    public int getExtraruns() {
        return extraruns;
    }

    public int getTotalruns() {
        return totalruns;
    }

    public String getPlayerdismissed() {
        return playerdismissed;
    }

    public String getDismissalkind() {
        return dismissalkind;
    }

    public String getFielder() {
        return fielder;
    }
}
