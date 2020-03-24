import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myongjingwan= 15;
        int sangrokwon= 17;
        int saheoigwahakgwan= 22;
        int singonghakgwan= 10;
        int haklimgwan= 12;

        String destination= scanner.next();

        switch(destination) {
            case "명진관":
                System.out.println(myongjingwan+"분이 소요됩니다");
                break;
            case "상록원":
                System.out.println(sangrokwon+"분이 소요됩니다");
                break;
            case "신공학관":
                System.out.println(singonghakgwan+"분이 소요됩니다");
                break;
            case "학림관":
                System.out.println(haklimgwan+"분이 소요됩니다");
                break;
            case "사회과학관":
                System.out.println(saheoigwahakgwan+"분이 소요됩니다");
                break;
            default:
                System.out.println("잘못된 데이터입니다");
                break;
        }


    }
}
