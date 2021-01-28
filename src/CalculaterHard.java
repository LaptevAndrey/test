import java.util.Scanner;

public class CalculaterHard {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        double result = 0.0;

        System.out.println("Введите Число");
        int operand1 = scanner.nextInt();

        while (!(s.equals("s"))) {

            System.out.println("Введите действие");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите число");
            int operand2 = scanner.nextInt();
            System.out.println("Ответ");

            if (operation == '+') {
                result = operand1 + operand2;
                System.out.println(result);
                operand1 = (int) result;
            }
            else if (operation == '-') {
                result = operand1 - operand2;
                System.out.println(result);
                operand1 = (int) result;
            }
            else if (operation == '*') {
                result = operand1 * operand2;
                System.out.println(result);
                operand1 = (int) result;
            }
            else if (operation == '/') {
                result = operand1 / operand2;
                System.out.println(result);
                operand1 = (int) result;
            }
            else
                System.out.println("Неподдерживаемая операция");

            s = scanner.next();

            if (s.equals("c")) {
                System.out.println("Введите число");
                operand1 = scanner.nextInt();
            }

        }
    }
}
