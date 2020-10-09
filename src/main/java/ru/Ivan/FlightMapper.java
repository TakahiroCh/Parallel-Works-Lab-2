package ru.Ivan;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, FlightWritableComparable, FlightWritable> {

    private constant final String delimeter
    @Override
    public void main(LongWritable key, Text value, Context context) throws IOException {

    }
}
