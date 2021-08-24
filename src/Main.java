import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String input;
        String romanRes;
        String[] components;
        int first, second, intRes;
        boolean isRoman;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            input = reader.readLine();
            components = input.split(" ");
            if (components.length == 3) {
                if (!Calculator.isCorrect(components[0]) || !Calculator.isCorrect(components[2])) {
                    first = Converter.romanToArabic(components[0]);
                    second = Converter.romanToArabic(components[2]);
                    isRoman = true;

                }
                else {
                    first = Integer.parseInt(components[0]);
                    second = Integer.parseInt(components[2]);
                    isRoman = false;
                }
                intRes = Calculator.calculate(first, second, components[1]);
                if (isRoman) {
                    romanRes = Converter.arabicToRoman(intRes);
                    System.out.println(romanRes);
                }
                else System.out.println(intRes);
            }
            else throw new IllegalArgumentException();
        }
    }
}
