import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int currentStair=1;
        while(currentStair <= 108) {
            if(currentStair % 50 == 0) {
                System.out.println(currentStair + "번째 계단이다!");
            }
            currentStair++;
        }
        System.out.println("다왔다!");

    }
}
