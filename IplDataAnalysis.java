import java.io.IOException;
import java.util.List;

public class IplDataAnalysis {
    public static void main(String[] args) throws IOException {
        List<MatchDetails> md=MatchDetails.getMatchDetailsList("/home/lakshman/IdeaProjects/IPLProject/Resources/matches.csv");
        System.out.println(md);

    }
}
