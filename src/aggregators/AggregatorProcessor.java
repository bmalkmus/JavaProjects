package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<Agg extends Aggregator> {
    Agg agg;
    String file;

    public AggregatorProcessor(Agg agg, String file) {
        super();
        this.agg = agg;
        this.file = file;
    }

    public double runAggregator(int num) throws IOException {
        int index = num - 1;
        StockFileReader fileReader = new StockFileReader(file);
        List <String> lines = fileReader.readFileData();
        for (String line : lines){
            String [] split = line.split(",");
            Double splitNum = Double.parseDouble(split[index]);
            agg.add(splitNum);
            
        }
         double result = agg.calculate();
        return result;
    }
}
