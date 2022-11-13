import java.util.Scanner;
import static java.lang.System.*;
public class Zadanie_5_2 {
    public static void main(String[] args) {
        Scanner IZ = new Scanner(System.in);
        out.println("Введите числа k и l (натуральные числа)");
        out.print("k=");
        int k = IZ.nextInt();
        out.print("l=");
        int l = IZ.nextInt();
        out.println("Введите 3 трёхзначных числа");
        int d = IZ.nextInt();
        int e = IZ.nextInt();
        int f = IZ.nextInt();
        int a = d/100;
        int b = (d/10)%10;
        int c = d%10;
        if(a+b+c>l && d>k){
            out.println(d);
        }
        a = e/100;
        b = (e/10)%10;
        c= e%10;
        if(a+b+c>l && d>k){
            out.println(e);
        }
        a = f/100;
        b = (f/10)%10;
        c= f%10;
        if(a+b+c>l && d>k){
            out.println(f);
        }
    }
}
