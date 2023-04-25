package Java.OOP_Lab;

import java.util.Scanner;
public class OOP_Ex_63 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for (int i = 0 ; i < n ; i++){
            for (int j = n - i -1 ; j >= 1 ; j--){
                System.out.print(" ");
            }
            for (int k = 0 ; k < i * 2 + 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
