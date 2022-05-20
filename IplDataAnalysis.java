import java.io.IOException;
import java.util.*;

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
        System.out.println("Total number of matches happened per year\n"+yearandmatches+"\n------------------");
    }

    //Number of matches won of all teams over all the years of IPL.
    public void numOfMatchesWonByEveryTeam(){
        HashMap<String,Integer> teamandwins=new HashMap();
        for(MatchDetails o:md){
            String t=o.team1;
            if(t.contains("Rising Pune Supergiant"))
                t="Rising Pune Supergiant";
                teamandwins.put(t,0);
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
        System.out.println("Number of times teams won in all years\n"+teamandwins+"\n------------------");

    }

    //For the year 2016 get the extra runs conceded per team.

    public void extraRunsPerTeam(){
        HashMap<String,Integer> teamsplayedin2016=new HashMap();
        HashSet<Integer> ids=new HashSet();

        //logic to get the match ids and teams that have played in 2016
        for(MatchDetails o:md){
            if(o.season==2016){
                ids.add(o.id);
                String t1=o.team1;
                String t2=o.team2;
                if(t1.contains("Rising Pune Supergiant"))
                    t1="Rising Pune Supergiant";
                if(t2.contains("Rising Pune Supergiant"))
                    t2="Rising Pune Supergiant";
                    teamsplayedin2016.put(t1,0);
                    teamsplayedin2016.put(t2,0);
                }
            }

        //logic to count extra runs conceded by every team played in 2016
        for(Integer i:ids){
            for(DeliveriesDetails q:dd){
                if(q.matchid==i){
                    int extra=q.extraruns;
                    String battingteam=q.batingteam;
                    if(battingteam.contains("Rising Pune Supergiant"))
                        battingteam="Rising Pune Supergiant";
                    int runs=teamsplayedin2016.get(battingteam);
                    teamsplayedin2016.put(battingteam,runs+extra);
                }
            }
        }
        System.out.println("Extra runs conceded by every team in 2016\n"+teamsplayedin2016+"\n------------------");
    }

//    For the year 2015 get the top economical bowlers.
    public void economicBowlers(){
        HashMap<String,Integer> bowRuns=new HashMap<>();
        HashMap<String,Integer> bowBalls=new HashMap<>();
        HashSet<Integer> ids=new HashSet();
        //Fetching the IDs of matches in 2015
        for(MatchDetails o:md){
            if(o.season==2015) {
                ids.add(o.id);
            }
        }
        //Storing bowler names and their given runs and Number of overs they bowled
        for(Integer i:ids){
            for(DeliveriesDetails q:dd){
                String bowlername=q.bowler;
                if(q.matchid==i){
                    int runsgiven=q.totalruns;
                    if(bowRuns.containsKey(bowlername)){
                        int runsval=bowRuns.get(bowlername);
                        int ballsval=bowBalls.get(bowlername);
                        bowRuns.put(bowlername,runsval+runsgiven);
                        bowBalls.put(bowlername,ballsval+1);
                    }
                    else{
                        bowRuns.put(bowlername,0);
                        bowBalls.put(bowlername,0);
                    }
                }
            }
        }
        //Evaluating the most economical bowlers and arranging them in order wise
        TreeMap<Double,String> economical =new TreeMap();
        Set<String> bowlerNames=bowRuns.keySet();
        for(String name:bowlerNames){
            double balls=bowBalls.get(name);
            double totalRuns=bowRuns.get(name);
            double remain=balls%6;
            int overs=(int)balls/6;
            double ballDivisor=overs+(remain/6);
            economical.put(totalRuns/ballDivisor,name);
        }
        System.out.println("Most economical bowlers\n"+economical+"\n------------------");

    }


    public static void main(String[] args) throws IOException {
       md=MatchDetails.getMatchDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/matches.csv");
       dd=DeliveriesDetails.getDeliveriesDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/deliveries.csv");
       IplDataAnalysis i=new IplDataAnalysis();
       i.numOfMatchesPerYear();
       i.numOfMatchesWonByEveryTeam();
       i.extraRunsPerTeam();
       i.economicBowlers();


    }
}
