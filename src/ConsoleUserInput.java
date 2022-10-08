import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private final UserOutput output = new ConsoleUserOutput();

    @Override
    public int read() {
        int input = 0;
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        while (!stop) {
            String inputString = scanner.next();
            if (isNumber(inputString)) {
                input = Integer.parseInt(inputString);
                if (input < 1) {
                    output.print();
                } else {
                    stop = true;
                }
            } else {
                output.print();
            }
        }
        return input;
    }

    private boolean isNumber(String inputString) {
        try {
            Integer.parseInt(inputString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
