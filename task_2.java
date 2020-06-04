import java.util.Scanner;

public class task_2 {
    public static int salary;
    public static void main(String[] args) {
        double ndfl = 0.13;
        System.out.println("Введите Вашу зарплату:");
        Scanner in = new Scanner(System.in);
        salary = (int) in.nextDouble();
        double total = (double) (salary*ndfl);
        double total1 = salary - total;
        System.out.println("Зарплата на руки (c учетов 13%(НДФЛ)): " + total1+"руб.");

    }

}
