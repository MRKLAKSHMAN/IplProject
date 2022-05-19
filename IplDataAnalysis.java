import java.io.IOException;
import java.util.List;

public class IplDataAnalysis {
    public static void main(String[] args) throws IOException {
        List<MatchDetails> md=MatchDetails.getMatchDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/matches.csv");
        List<DeliveriesDetails> dd=DeliveriesDetails.getDeliveriesDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/deliveries.csv");


    }
}
