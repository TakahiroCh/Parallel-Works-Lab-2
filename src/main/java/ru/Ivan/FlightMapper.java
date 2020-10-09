package ru.Ivan;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, FlightWritableComparable, FlightWritable> {

    private static final String DELIMITER = ",";
    private static final int DESTAEROPORTID = 14;
    private static final int ARRDELAY = 17;
    private static final int CANCELLED = 19;
    private static final int AIRTIME = 20;

    @Override
    public void main(LongWritable key, Text value, Context context) throws IOException {
        String[] table = value.toString().split(DELIMITER);
        int destAeroportID = Integer.parseInt(table[DESTAEROPORTID]);
        float arrDelay = Float.parseFloat(table[ARRDELAY]);
        float cancelled = Float.parseFloat(table[CANCELLED]);
        float airTime = Float.parseFloat(table[AIRTIME]);
        

    }
}
