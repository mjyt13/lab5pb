import static java.lang.System.*;
import static java.lang.Math.*;

public class Zadanie_5_3 {
    public static void main(String[] args) {
        double x = -3;
        double f;
        while (x <= 3) {
            if (x >= 0) {
                f = pow(E, x) + x;
                out.println(f);
            } else {
                f = sin(x) + 5;
                out.println(f);
            }
            x += 0.5;
        }
    }
}
