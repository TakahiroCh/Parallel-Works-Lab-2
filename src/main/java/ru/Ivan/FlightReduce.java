package ru.Ivan;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class FlightReduce extends Reducer<FlightWritableComparable, Text, Text, Text> {

    private static final int TOCOUNT = 0;
    private static final float ZERO = 0.0F;

    @Override
    protected void reduce(FlightWritableComparable key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text nameInfo = new Text(iter.next());
        int count = TOCOUNT;
        float min = ZERO;
        float max = ZERO;
        float average = ZERO;
        while(iter.hasNext()) {
            float currentValue = Float.parseFloat(iter.next().toString());
            if (count == TOCOUNT) {
                min = currentValue;
            }
            if (currentValue < min) {
                min = currentValue;
            } else if (currentValue > max) {
                max = currentValue;
            }
            average += currentValue;
            count++;
        }
        average /= count;
        

    }

}
