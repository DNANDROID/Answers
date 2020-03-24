import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float pi= 3.14f;
        System.out.print("반지름을 입력하세요: ");
        int radius= scanner.nextInt();
        System.out.println("정원의 둘레는: "+ 2 * pi * radius);
        System.out.println("정원의 넓이는: "+ pi * radius * radius);
    }
}
