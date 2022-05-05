package statisticker;

import java.util.*;

public class Statistics 
{
    public static class ___{
    }
    public static class Stats{
        float average = 0.0f;
        float min = numbers.get(0);
        float max = numbers.get(0);
        float sum = numbers.get(0);
        List<Float> numbers = new ArrayList<Float>();
        Stats(List<Float> number){
            numbers = number;
        }
       for(int i=1;i<numbers.size();i++){
          sum += numbers.get(i);
//            if(numbers.get(i)>max){
//               max = numbers.get(i);   
//            }else if(numbers.get(i)<min){
//               min = numbers.get(i);
//            }
       }
        average = sum/numbers.size();
    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Stats s = new Stats(numbers);
        return s;
    }
}
interface IAlerter{
}
class EmailAlert implements IAlerter{
    public boolean emailSent = false;
}
class LEDAlert implements IAlerter{
    public boolean ledGlows = false;
}
class StatsChecker{
   StatsChecker(float maxThreshold, IAlerter[] alerters){
   
   }
    public void checkAndAlert(Float[] numbers){
       
    }
}
