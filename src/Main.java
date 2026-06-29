import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0){
           number = number * -1;
        }
        int sum = 0;
        for  (; number > 0; number /= 10) {
            sum += number % 10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
        scanner.close();
    }
}