package ru.Ivan;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightNameMapper extends Mapper<LongWritable, Text, FlightWritableComparable, Text> {


    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException {

    }
}
