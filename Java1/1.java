import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 두 개를 입력하세요: ");
        int first= scanner.nextInt();
        int second= scanner.nextInt();

        System.out.println("덧셈: "+ (first + second));
        System.out.println("뺄셈: "+ (first - second));
        System.out.println("곱셈: "+ (first * second));
        System.out.println("나눗셈 "+ (first / second));
    }
}
