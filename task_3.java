import java.util.Scanner;

public class task_3 {
    public static int clock;
    public static void main(String[] args) {
        int seconds = 3600;
        System.out.println("Введите количество секунд :");
        Scanner in = new Scanner(System.in);
        clock = in.nextInt();
        int total = (clock/seconds);
        System.out.println("В часах:" + total);

    }
}
