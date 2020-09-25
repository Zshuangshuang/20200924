package java0924;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:方法的递归
 * User:ZouSS
 * Date:2020-09-24
 * Time:15:40
 **/
public class TestDemo2 {
    public static int fac(int n){
        if (n == 1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ret = fac(num);
        System.out.println(ret);
    }
}
