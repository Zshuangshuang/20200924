package java0924;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-24
 * Time:15:20
 **/
public class TestDemo {
    public static int fab(int i){
        if (i < 0){
            return -1;
        }
        if (i == 1 || i==2){
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int j = 3; j <= i; j++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ret = fab(num);
        System.out.println(ret);
    }
    public static int findOnce(int[] arr){
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }
    public static void swap(int[] array){
        int i = 0;
        int j = array.length-1;
        while(i < j){
            while (i<j && array[j] %2 == 0){
                j--;
            }
            while (i<j && array[i] %2 != 0){
                i++;
            }
            int tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,5,6,9,8,4};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,5,6,9,8,4};
        swap(array);
        System.out.println(Arrays.toString(array));

    }
}
