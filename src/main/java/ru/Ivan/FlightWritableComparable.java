package ru.Ivan;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritableComparable implements WritableComparable {

    private int destAirportID;
    private float arrDelay;
    private float cancelled;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }
}
