package ru.Ivan;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritableComparable implements WritableComparable {

    private int aeroportID;
    private int indenity;

    public FlightWritableComparable() {}

    public FlightWritableComparable(int aeroportID, int indenity) {
        this.aeroportID = aeroportID;
        this.indenity = indenity;
    }

    public int getID() {
        return this.aeroportID;
    }

    public int compareID(Object o) {
        FlightWritableComparable second = (FlightWritableComparable) o;
        if (this.aeroportID > second.aeroportID) {
            return 1;
        } else if (this.aeroportID < second.aeroportID) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(Object o) {
        FlightWritableComparable second = (FlightWritableComparable) o;
        if (this.aeroportID > second.aeroportID) {
            return 1;
        } else if (this.aeroportID < second.aeroportID) {
            return -1;
        } else if (this.indenity > second.indenity) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(aeroportID);
        dataOutput.writeInt(indenity);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.aeroportID = dataInput.readInt();
        this.indenity = dataInput.readInt();
    }
}
