import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class zadanie_5_4 {
    public static void main(String[] args) {
        Scanner P4 = new Scanner(System.in);
        out.println("введите x");
        out.print("x=");
        double x = P4.nextDouble();
        double y;
        if (x < -2) {
            y = E + PI * x;
            out.print(y);
        } else if (x > -2 & x < 2) {
            y = cos(sin(x));
            out.print(y);
        } else if (x > 2) {
            y = exp(cos(sin(cos(x))));
            out.print(y);
        } else if (x == -2 || x == 2) {
            y = E;
            out.print(y);
        }
    }
}
