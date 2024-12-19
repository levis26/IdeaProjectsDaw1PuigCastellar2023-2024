import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char playAgain;

        do {
            System.out.println("This program will ask the user to enter a series of numbers.");
            System.out.println("The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.");
            System.out.println("The program will then display the array of numbers and the sum total of those numbers.\n");

            ArrayList<Integer> numbers = new ArrayList<>();
            enterNumbers(numbers, scanner);

            printArrayListWithIndex(numbers);
            System.out.println("There are " + numbers.size() + " items in the ArrayList.");
            System.out.println("The sum total of numbers in the ArrayList is " + sumValues(numbers) + ".");

            System.out.print("Do you wish to play again? (Y/N): ");
            playAgain = scanner.next().toUpperCase().charAt(0);
            while (playAgain != 'Y' && playAgain != 'N') {
                System.out.print("Invalid response. Please enter either a 'Y' or 'N'. Do you wish to play again? (Y/N): ");
                playAgain = scanner.next().toUpperCase().charAt(0);
            }
            // Consume the newline character after reading the playAgain input
            scanner.nextLine();
        } while (playAgain == 'Y');

        System.out.println("Goodbye!");
        scanner.close(); // Close the scanner when done
    }

    public static void enterNumbers(ArrayList<Integer> numbers, Scanner scanner) {
        System.out.println("Please enter a number (or just hit enter to finish): ");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid response. Please enter a whole number.");
            }
            System.out.println("Please enter a number (or just hit enter to finish): ");
        }
    }

    public static int sumValues(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void printArrayListWithIndex(ArrayList<Integer> numbers) {
        System.out.println("Index   Item");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + "       " + numbers.get(i));
        }
    }
}
