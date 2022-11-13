import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class zadanie_5_5 {
    public static void main(String[] args) {
        Scanner N5 = new Scanner(System.in);
        double x = N5.nextDouble();
        double y = N5.nextDouble();
        int i = 0;
        if (x >= -3 & x < -2) {
            double y1 = 1.0, y2 = sqrt(4 - pow(x + 1, 2)) + 1;
            if (y >= y1 & y <= y2) {
                i++;
            }
        } else if (x >= 2 & x < -1) {
            double y1 = 1.0, y2 = sqrt(4 - pow(x + 1, 2)) + 1, y3 = 2 * x + 1, y4 = (4 / 5) * x - (7 / 5);
            if ((y >= y1 & y <= y2) || (y <= y3 & y >= y4)) {
                i++;
            }
        } else if (x >= 1 & x < 0) {
            double y1 = 1.0, y2 = -sqrt(4 - pow(x + 1, 2)) + 1, y3 = 2 * x + 5, y4 = (4 / 5) * x - (7 / 5);
            if ((y >= y1 & y <= y3) || (y <= y2 & y >= y4)) {
                i++;
            }
        } else if (x >= 0 & x < 1) {
            double y1 = 1.0, y2 = -sqrt(4 - pow(x + 1, 2)) + 1, y3 = -(1 / 2) * x + 5, y4 = (4 / 5) * x - (7 / 5);
            if ((y >= y1 & y <= y3) || (y <= y2 & y >= y4)) {
                i++;
            }
        } else if (x >= 1 & x < 2) {
            double y1 = -(1 / 2) * x + 5, y2 = (4 / 5) * x - (7 / 5);
            if (y >= y2 & y <= y1) {
                i++;
            }
        } else if (x >= 2 & x < 3) {
            double y1 = -3 * x + 10, y2 = (4 / 5) * x - (7 / 5), y3 = x - 3, y4 = -sqrt(4 - pow(x - 4, 2)) - 1;
            if (y >= y2 & y <= y1) {
                i++;
            }
            if (y <= y3 & y >= y4) {
                i += 2;
            }
        } else if (x >= 3 & x < 4) {
            double y1 = x - 3, y2 = -sqrt(4 - pow(x - 4, 2)) - 1;
            if (y <= y1 & y >= y2) {
                i += 2;
            }
        } else if (x >= 4 & x < 5) {
            double y1 = sqrt(4 - pow(x - 4, 2)) - 1, y2 = -x + 1;
            if (y >= y2 & y <= y1) {
                i += 2;
            }
        } else if (x >= 5 & x < 6) {
            double y1 = sqrt(4 - pow(x - 4, 2)) - 1, y2 = (1 / 2) * x - (13 / 2);
            if (y >= y2 & y <= y1) {
                i += 2;
            }
        } else if (x >= 6 & x < 7) {
            double y1 = -2 * x + 11, y2 = (1 / 2) * x - (13 / 2);
            if (y >= y2 & y <= y1) {
                i += 2;
            }
        }
        if (i == 0) {
            out.println("точка не попала ни в одну из фигур");
        } else if (i == 1) {
            out.println("точка попала в 1 фигуру");
        } else if (i == 2) {
            out.println("точка попала в 2 фигуру");
        }
    }
}
