
public class main {

    public static void main(String[] args) {

        int[] a= new int[50];
        int sum= 0;
        for(int i=0; i  < 50; i++) {
            a[i]=1 + 2*i;
            sum += a[i];
        }
        System.out.println("배열 합: "+ sum);
    }
}

