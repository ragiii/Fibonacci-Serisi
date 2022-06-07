import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı Girin :");

        int inp = input.nextInt();
        int x = 0;
        int y = 1;
        int toplam;
        System.out.println(inp + " Elemanlı Fibonacci Serisi :\n" );

        for(int i = 1; i <= inp; i++){
            
            toplam = x + y ;
            x = y;
            y = toplam;
            System.out.println(toplam);

        }

    }
    
}
