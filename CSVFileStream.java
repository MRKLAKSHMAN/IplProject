import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class CSVFileStream {

    List<MatchDetails>  matchDetailsList;
    public static void main(String[] args) throws IOException{
        CSVFileStream cf=new CSVFileStream();
        Path path=Path.of("Resources","matches.csv");
        //Below code throws IOException and returns a stream of string
        //skip(1) will skip the first line because its a header
        //map individual string to respective object
        cf.matchDetailsList=Files.lines(path).skip(1).map(line -> {return getMatchDetails(line);}).collect(Collectors.toList());
        System.out.println(cf.matchDetailsList);
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
