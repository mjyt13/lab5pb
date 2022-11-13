import java.util.Scanner;
import static java.lang.System.*;
public class zadanie_5_8 {
    public static void main(String[] args) {
        Scanner N8 = new Scanner(System.in);
        out.println("введите количество знаков(не более 8), которое хотите вывести при вычислении корня из двух");
        int SI = N8.nextInt();
        double z = Math.sqrt(2);
        switch (SI){
            case 0:
                out.printf("z=%.0f",z);
                break;
            case 1:
                out.printf("z=%.1f",z);
                break;
            case 2:
                out.printf("z=%.2f",z);
                break;
            case 3:
                out.printf("z=%.3f",z);
                break;
            case 4:
                out.printf("z=%.4f",z);
                break;
            case 5:
                out.printf("z=%.5f",z);
                break;
            case 6:
                out.printf("z=%.6f",z);
                break;
            case 7:
                out.printf("z=%.7f",z);
                break;
            case 8:
                out.printf("z=%.8f",z);
                break;
            default:
                out.println("невозможно вывести такое количество знаков после запятой");
        }
    }
}
