package statisticker;

import java.util.*;

public class Statistics 
{
    public static class ___{
    }
    public static class Stats{
        float average = 0.0f;
        float min = 0.0f;
        float max = 0.0f;
        float sum = 0.0f;
        List<Float> numbers = new ArrayList<Float>();
        Stats(List<Float> number){
            numbers = number;
            calculateMaxMinAvg();
        }
        public void calculateMaxMinAvg(){
            if(numbers.isEmpty()){
             min = Float.NaN;
             max = Float.NaN;
             average = Float.NaN;
            }else{
            min = numbers.get(0);
            max = numbers.get(0);
            sum = numbers.get(0);
             for(int i=1;i<numbers.size();i++){
                   sum += numbers.get(i);
                if(numbers.get(i)>max){
                    max = numbers.get(i);   
                }else if(numbers.get(i)<min){
                    min = numbers.get(i);
                }
             }
             average = sum/numbers.size();
           }
        }
        
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
