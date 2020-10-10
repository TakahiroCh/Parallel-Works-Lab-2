package ru.Ivan;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightNameMapper extends Mapper<LongWritable, Text, FlightWritableComparable, Text> {

    private static final String DELIMITER = ",";
    private static final int FORNAME = 0;
    private static final int DESTAEROPORTID = 0;
    private static final int NAME = 1;

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() > 0) {
            String[] table = value.toString().split(DELIMITER);
            int destAeroportID = Integer.parseInt(table[DESTAEROPORTID]);
            FlightWritableComparable currentKey = new FlightWritableComparable(destAeroportID, FORNAME);
            context.write(currentKey, new Text(table[NAME]));
        }
    }
}
