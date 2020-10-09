package ru.Ivan;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritableComparable implements WritableComparable {

    private int destAirportID;
    private float arrDelay;
    private float cancelled;
    private float airTime;

    public FlightWritableComparable() {}

    public FlightWritableComparable(int destAirportID, float arrDelay, float cancelled, float airTime) {
        this.destAirportID = destAirportID;
        this.arrDelay = arrDelay;
        this.cancelled = cancelled;
        this.airTime = airTime;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.destAirportID);
        dataOutput.writeFloat(this.arrDelay);
        dataOutput.writeFloat(this.cancelled);
        dataOutput.writeFloat(this.airTime);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.destAirportID = dataInput.readInt();
        this.arrDelay = dataInput.readFloat();
        this.cancelled = dataInput.readFloat();
        this.airTime = dataInput.readFloat();
    }
}
