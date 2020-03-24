import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요:" );
        int arraySize= scanner.nextInt();

        if(arraySize < 10) {
            System.out.println("배열의 크기는 10보다 커야합니다");
            return;
        }

        int[] myArray= new int[arraySize];
        int sum= 0;
        for(int i=0; i < arraySize; i++) {
            myArray[i]= (i%2==0?1:2);
            sum+= myArray[i];
        }
        System.out.println(sum);
    }
}
