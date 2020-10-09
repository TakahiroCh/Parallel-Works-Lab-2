package ru.Ivan;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FlightMapper extends Mapper<LongWritable, Text, FlightWritableComparable, FlightWritable> {

    @Override
    public void main(LongWritable key, Text value, FlightWritableComparable output,)
}
