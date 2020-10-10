package ru.Ivan;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class FlightPartitioner extends Partitioner<FlightWritableComparable, Text> {
    @Override
    public int getPartition(FlightWritableComparable key, Text text, int i) {
        return key.getID() % i;
    }
}
