public class Calculator {

    public static boolean isCorrect(String num) {
        try {
            int number = Integer.parseInt(num);
            return number >= 1 && number <= 10;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static int calculate(int first, int second, String operation) {
        return switch (operation) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> throw new IllegalArgumentException();
        };
    }
}
