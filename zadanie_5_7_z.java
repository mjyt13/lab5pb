import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class zadanie_5_7_z {
    public static void main(String[] args) {
        Scanner Z7 = new Scanner(System.in);
        out.println("введите x из отрезка [-4;4]");
        double x = Z7.nextDouble();
        if (x > 4 || x < -4) {
            out.println("введенный x не принадлежит отрезку [-4;4]");
        } else if (x >= -4 & x < 0) {
            double z = (1+abs(cos(4*pow(x,4)+6*pow(x,6))))/(E+x*x-2*x);
            out.println("z="+z);
        } else if (x>=0 & x<1) {
            if(x==0){
                out.println("функция не определена из-за нуля в знаменателе");
            }else if((1/(2*x))+((2*x-sin(3*x))/(1-cos(pow(tan(x*x),4))))<0){
                out.println("функция не определена из-за отрицаительного выражения под корнем");
            }else{
                double z = pow((1/(2*x))+((2*x-sin(3*x))/(1-cos(pow(tan(x*x),4)))),(1/4));
                out.println("z="+z);
            }
        }else if(x>=1){
            if(x-2==0){
                out.println("функция не определена из-за нуля в знаменателе");
            }else if(x-2<0){
                out.println("функция не определена из-за отрицательного выражения под знаком корня");
            }else{
                double z = 2*abs(0.5+((cos(pow(x,pow(E,PI)))-2)/(sqrt(x-2))));
                out.println("z="+z);
            }
        }
    }
}
