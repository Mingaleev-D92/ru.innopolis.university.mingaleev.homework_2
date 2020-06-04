import java.util.Scanner;

public class task_1 {
    public static int price;
    public static void main(String[] args) {
        int gasPrice = 43;
        System.out.println("Какое количество литров бензина Вам необходимо? :");
        Scanner in = new Scanner(System.in);
        price = (int) in.nextDouble();
        int total = (int) (price*gasPrice);
        System.out.println("С Вас: " + total+"руб.");

    }
}

