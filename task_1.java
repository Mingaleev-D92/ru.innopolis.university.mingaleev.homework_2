import java.util.Scanner;

public class task_1 {
    public static int price;
    public static void main(String[] args) {
        float gasPrice = 43;
        System.out.println("Какое количество литров бензина Вам необходимо? :");
        Scanner in = new Scanner(System.in);
        price = in.nextInt();
        float total = (price*gasPrice);
        System.out.println("С Вас: " + total+"руб.");

    }
}

