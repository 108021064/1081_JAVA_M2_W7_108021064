import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*int sum = 0;
        for (int i=1;i<=100;i++){
            sum = sum+i;
        }
        System.out.println(sum);*/
        int sum = 0;
        int a = scn.nextInt();
        for (int i = 0;i<=a ; i=i+3){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
