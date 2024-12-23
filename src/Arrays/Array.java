package Arrays;

import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);
    public static int[] getArray(){
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter element ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
