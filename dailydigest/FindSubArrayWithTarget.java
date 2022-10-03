import java.util.*;
public class Check {
    public static void main(String[] args) {
     int start = -1;
     int end = -1;
     int[] a  = {10, 15, -5, 15, -10, 5};
     int target = 5;
     HashMap<Integer, Integer> map = new HashMap<>();
     int sum = 0;
     for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if(sum-target == 0){
                start = 0;
                end = i;
                break;
            }else if(map.containsKey(sum-target)){
                start = map.get(sum-target)+1;
                end = i;
                break;
            }else{
                map.put(sum, i);
            }
        }
        System.out.println("START : "+start+" "+"END :"+end);
    }
}

