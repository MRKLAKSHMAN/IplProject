import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class IplDataAnalysis {
    static List<MatchDetails> md;
    static List<DeliveriesDetails> dd;

    //Number of matches played per year of all the years in IPL.
    public void numOfMatchesPerYear(){
        TreeMap<Integer,Integer> yearandmatches=new TreeMap();
        for(MatchDetails o:md){
            if(yearandmatches.containsKey(o.season)){
                int val=yearandmatches.get(o.season);
                yearandmatches.put(o.season,val+1);
            }
            else{
                yearandmatches.put(o.season,1);
            }
        }
        System.out.println("Total number of matches happened per year\n"+yearandmatches);
    }

    //Number of matches won of all teams over all the years of IPL.
    public void numOfMatchesWonByEveryTeam(){
        HashMap<String,Integer> teamandwins=new HashMap();
        for(MatchDetails o:md){
            String t=o.team1;
            if(t.contains("Rising Pune Supergiant"))
                t="Rising Pune Supergiant";
            if(!(teamandwins.containsKey(t))){
                teamandwins.put(t,0);
            }
        }
        for(MatchDetails o:md){
            String t=o.winner;
            if(t.contains("Rising Pune Supergiant"))
                t="Rising Pune Supergiant";
            if(teamandwins.containsKey(t)){
                int val=teamandwins.get(t);
                teamandwins.put(t,val+1);
            }
        }
        System.out.println("Number of times teams won in all years\n"+teamandwins);

    }

    public static void main(String[] args) throws IOException {
       md=MatchDetails.getMatchDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/matches.csv");
       dd=DeliveriesDetails.getDeliveriesDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/deliveries.csv");
       IplDataAnalysis i=new IplDataAnalysis();
       i.numOfMatchesPerYear();
       i.numOfMatchesWonByEveryTeam();


    }
}
