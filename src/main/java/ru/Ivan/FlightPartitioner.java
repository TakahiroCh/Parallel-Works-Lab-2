package ru.Ivan;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class FlightPartitioner extends Partitioner<FlightWritableComparable, Text> {
    @Override
    public int getPartition(FlightWritableComparable flightWritableComparable, Text text, int i) {
        return (key.getID.hashCode() & Integer.MAX_VALUE) % i;
    }
}
