import java.util.Scanner;

public class main {



    static int getDiscountPrice(int productCode, int money) {
        // money*0.x의 결과는 double type이므로
        // int 타입인 함수의 반환형과 맞추기 위해서 (int)로 캐스팅한다
        if(productCode >= 0 && productCode <= 3) {
            return (int)(money * 0.9);
        }else if(productCode >=4 && productCode <= 7) {
            return (int)(money * 0.8);
        }else if(productCode >=8 && productCode <= 10) {
            return (int)(money * 0.7);
        }else {
            return (int)(money * 0.95);
        }
    }

    static int usePoint(int discountedPrice, int point) {
        // discountedPrice*0.5의 결과는 double type이므로
        // int 타입인 함수의 반환형과 맞추기 위해서 (int)로 캐스팅한다
        if(discountedPrice*0.5 < point) {
            return (int)(discountedPrice - discountedPrice*0.5);
        }else{
            return (discountedPrice - point);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("상품코드와 결재금액, 적립금을 순서대로 입력하세요:" );
        int code= scanner.nextInt();
        int money= scanner.nextInt();
        int point= scanner.nextInt();
        int discountedPrice= getDiscountPrice(code, money);
        int finalChargedPrice= usePoint(discountedPrice, point);
        System.out.println("최종 결제금액은 "+ finalChargedPrice+"원입니다.");
    }
}
