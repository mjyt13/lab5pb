import java.util.*;
import static java.lang.System.*;
public class zadanie_5_9 {
    public static void main(String[] args) {
        Scanner QQ = new Scanner(System.in);
        int i,j=0;
        out.println("Итак, начнём небольшой опрос по физике");
        out.println("Первый вопрос: определение энтропии в дифференциальном виде");
        out.println("1)dS=δQ/T");
        out.println("2)dS=Q/T");
        out.println("3)dS=δQ/p");
        out.print("Ваш ответ ");
        i= QQ.nextInt();
        switch(i){
            case 1:
                out.println("Верно!");
                j++;
                break;
            case 2:
                out.println("Неверно!");
                break;
            case 3:
                out.println("Неверно!");
                break;
            default:
                out.println("Но такого ответа здесь нет");
                break;
        }
        out.println("Второй вопрос: куда направлен вектор углового ускорения при росте угловой скорости?");
        out.println("1)Перпендикулярно вектору угловой скорости");
        out.println("2)Сонаправленно вектору угловой скорости");
        out.println("3)Противоположно направленно вектору угловой скорости");
        out.print("Ваш ответ ");
        i= QQ.nextInt();
        switch(i){
            case 1:
                out.println("Неверно!");
                break;
            case 2:
                out.println("Верно!");
                j++;
                break;
            case 3:
                out.println("Неверно!");
                break;
            default:
                out.println("Этот ответ не представлен здесь");
                break;
        }
        out.println("Третий вопрос: чему равен момент инерции кольца радиусом 50 см и массой 4 кг относительно оси, проходящей через его центр масс");
        out.println("1)1,1 кг*м^2");
        out.println("2)1 кг*м^2");
        out.println("3)0,7 кг*м^2");
        out.print("Ваш ответ ");
        i= QQ.nextInt();
        switch(i){
            case 1:
                out.println("Неверно!");
                break;
            case 2:
                out.println("Неверно!");
                j++;
                break;
            case 3:
                out.println("Верно!");
                break;
            default:
                out.println("Этот ответ не принимается");
                break;
        }
        out.println("Четвёртый вопрос: чему равно волновое число k?");
        out.println("1)k=x/λ");
        out.println("2)k=2π/λ");
        out.println("3)k=ω/v");
        out.print("Ваш ответ ");
        i= QQ.nextInt();
        switch(i){
            case 1:
                out.println("Неверно!");
                break;
            case 2:
                out.println("Верно!");
                j++;
                break;
            case 3:
                out.println("Верно!");
                j++;
                break;
            default:
                out.println("Невозможно принять ответ");
                break;
        }
        out.println("Пятый вопрос: как записывается первый закон термодинамики в дифференциальном виде?");
        out.println("1)δQ=dU+pdV");
        out.println("2)δQ=dU+Vdp");
        out.println("3)dQ=U+pdV");
        out.print("Ваш ответ ");
        i= QQ.nextInt();
        switch(i){
            case 1:
                out.println("Верно!");
                j++;
                break;
            case 2:
                out.println("Неверно!");
                break;
            case 3:
                out.println("Неверно!");
                break;
            default:
                out.println("Невозможно принять ответ");
                break;
        }
        if(j<2){
            out.println("Всё плохо, очень плохо");
        } else if (j<3) {
            out.println("Довольно плохой результат");
        } else if (j<4) {
            out.println("3 балла - успешный вы человек");
        } else if (j<5) {
            out.println("4 - хорошо. ... Достаточно хорошо.");
        }else{
            out.println("Отличный результат!");
        }
    }
}
