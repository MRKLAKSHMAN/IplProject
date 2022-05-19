import java.io.IOException;
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
        System.out.println(yearandmatches);
    }

    public static void main(String[] args) throws IOException {
       md=MatchDetails.getMatchDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/matches.csv");
       dd=DeliveriesDetails.getDeliveriesDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/deliveries.csv");
       IplDataAnalysis i=new IplDataAnalysis();
       i.numOfMatchesPerYear();


    }
}
