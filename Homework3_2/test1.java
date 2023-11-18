package Homework3_2;

import java.util.Scanner;

public class test1 {
    static Scanner sc = new Scanner(System.in);

    public static int main(String[] args) {
        System.out.println("请输入你需要爬的楼梯阶数n：");
        int n = sc.nextInt();
        int way = 0;
        int a = 1;
        int b = 2;
        if (n == 1) {
            return 1;
        }
        if (n == 2){
            return 2;
        }
        for (int i = 3; i <= n ; i++) {
            way = a + b;
            a = b;
            b = way;
        }


        System.out.println("方法有：" + way + "种");
     return 0;
    }


}
