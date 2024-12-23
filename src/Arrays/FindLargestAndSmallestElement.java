package Arrays;
import java.util.*;
import java.lang.*;
public class FindLargestAndSmallestElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int largestNumber = getLargestNumber(array);
        System.out.println("Largest Number "+largestNumber);
        int smallNumber = smallNumber(array);
        System.out.println("Smallest Number "+smallNumber);
    }
    public static int getLargestNumber(int[] array){
        int largeNum=array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i]>largeNum){
                largeNum = array[i];
            }
        }
        return largeNum;
    }

    public static int smallNumber(int[] array){
        int smallNum=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<smallNum){
                smallNum=array[i];
            }
        }
        return smallNum;
    }
}
