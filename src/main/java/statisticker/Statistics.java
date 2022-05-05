package statisticker;

import java.util.*;

public class Statistics 
{
    public static class Stats{
        List<Float> numbers = new ArrayList<Float>();
        Stats(List<Float> number){
            numbers = number;
        }
        float average = 0.0f;
        float min = 0.0f;
        float max = 0.0f;
    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Stats s = new Stats(List<Float> numbers);
        return s;
    }
}
