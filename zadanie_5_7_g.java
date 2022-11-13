import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class zadanie_5_7_g {
    public static void main(String[] args) {
        Scanner G7 = new Scanner(System.in);
        out.println("введите x из отрезка [-4;4]");
        double x = G7.nextDouble();
        if (x > 4 || x < -4) {
            out.println("введенный x не принадлежит отрезку [-4;4]");
        } else if (x >= -4 & x <= 0) {
            if ((3 * x * x - 5) < 0) {
                out.println("функция не определена из-за отрицательного числа под знаком корня");
            } else if (x == -1) {
                out.println("функция не определена из-за нуля в знаменателе");
            } else {
                double g = (pow(3 * x * x - 5, 1 / 6)) / (abs(1 - x * x));
                out.println("g=" + g);
            }
        } else if (x > 0 & x <= 4) {
            double g = (1 + cos(x)) / (1 + exp(2 * x));
            out.println("g=" + g);
        }
    }
}
