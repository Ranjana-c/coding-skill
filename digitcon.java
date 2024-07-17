import java.util.Scanner;

public class DigitConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int result = 0;
    boolean hasDigits = false;

    for (char c : input.toCharArray()) {
      if (Character.isDigit(c)) {
        result = result * 10 + (c - '0');
        hasDigits = true;
      }
    }

    if (hasDigits) {
      System.out.println(result);
    } else {
      System.out.println(0);
    }
  }
}
