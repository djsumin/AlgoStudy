import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            showRes(n);
            System.out.println();
        }
        
    }

    static void showRes(int n){
        for(int i=0;i<n/5;i++){
            System.out.print("++++ ");
        }
        if(n%5 != 0){
            for(int i=0;i<n%5;i++){
                System.out.print("|");
            }
        }
        
    }
}
