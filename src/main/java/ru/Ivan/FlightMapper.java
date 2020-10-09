package ru.Ivan;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, FlightWritableComparable, FlightWritable> {

    private static final String DELIMITER = ",";

    @Override
    public void main(LongWritable key, Text value, Context context) throws IOException {
        String[] table = value.toString().split(DELIMITER);
        int destAeroportID = Integer.parseInt(table[14]);
        float arrDelay = Float.parseFloat(table[17]);
        float ca

    }
}
