import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Zadanie_5_1 {
    public static void main(String[] args) {
        Scanner RZ = new Scanner(System.in);
        out.println("иванникав хуила ебаная");
        out.print("a= ");
        double a = RZ.nextDouble();
        out.print("b= ");
        double b = RZ.nextDouble();
        out.print("c= ");
        double c = RZ.nextDouble();
        if(a<=0 || b<=0 || c<=0){
            out.print("стороны треугольника не могут выражаться неположительными числам");
        } else if (sqrt(a*a+b*b)==c || sqrt(a*a+c*c)==b || sqrt(b*b+c*c)==a) {
            out.print("треугольник прямоугльный");
        }else{
            double p = (a+b+c)*0.5;
            double S = sqrt(p*(p-a)*(p-b)*(p-c));
            double A = (180/PI)*asin((2*S)/(b*c));
            double B = (180/PI)*asin((2*S)/(a*c));
            double C = (180/PI)*asin((2*S)/(a*b));
            out.printf("углы: A= "+A+"; B="+B+"; C="+C);
        }
    }
}
