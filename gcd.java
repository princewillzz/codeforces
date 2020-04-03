import java.io.*;
import java.util.*;
class solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(gcd(arr));
    }
    static int gcd(int[] arr) {
        int ret = 0;
        while(small(arr)!=0) {
            ret = small(arr);
            for(int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] % ret;
            }
        }
        return ret;
    }

    static int small(int arr[]) {
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) 
        {   if(arr[i]==0) continue;
            if(small > arr[i]) small = arr[i];
        }
        if(small != Integer.MAX_VALUE) return small;
        else return 0;
    }


}