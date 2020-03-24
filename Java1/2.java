import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("두 사람의 나이를 입력하세요: ");
        int first= scanner.nextInt();
        int second= scanner.nextInt();

        if(Math.abs(first - second) % 12 == 0) {
            System.out.println("띠 동갑입니다!");
        }else {
            System.out.println("띠 동갑이 아닙니다!");
        }
    }
}
