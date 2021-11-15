import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Введите первое число:");
        int a = num.nextInt();
        System.out.println("Введите второе число:");
        int b = num.nextInt();
        System.out.println("Введите третье число:");
        int c = num.nextInt();
        System.out.println("Введите четвертое число:");
        int d = num.nextInt();
        int smallest;
        if (a <= b && a <= c && a <= d) {
            smallest = a;
        } else if ( b <= a && b <= c && b <= d) {
            smallest = b;
        } else if (c <= a && c <= b && c <= d) {
            smallest = c;
        } else {
            smallest = d;
        }
        System.out.println("Наименьшее число =" + smallest);


    }
}
