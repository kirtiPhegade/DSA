package Arrays;
import java.util.*;
public class SecondLargestAndSmallestNumber {
    public static void main(String[] args){

        int[] array = Array.getArray();
        System.out.println(Arrays.toString(array));
        array = Array.sortArray(array);
        System.out.println(Arrays.toString(array));
        int secondLargeNum = getSecondLargeNumber(array);
        int secondSmallNum = getSecondSmallNumber(array);
        System.out.println("Second Large Number:= "+secondLargeNum+"\nSecond Small Number:= "+secondSmallNum);
    }

    private static int getSecondSmallNumber(int[] array) {
        return array[1];
    }

    private static int getSecondLargeNumber(int[] array) {
        return array[array.length-1-1];
    }


}
