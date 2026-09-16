import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split(" ");

        int sum = 0;

        for (String s : arr) {
            sum += Integer.parseInt(s);
        }

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
