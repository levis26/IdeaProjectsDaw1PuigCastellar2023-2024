import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("This program will ask the user to enter a series of numbers.");
        System.out.println("The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.");

        while (true) {
            System.out.print("Please enter a number (or just hit enter to finish): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty())
                break;

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("Index\tItem");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + "\t\t" + numbers.get(i));
        }

        System.out.println("There are " + numbers.size() + " items in the ArrayList.");

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum total of numbers in the ArrayList is " + sum + ".");

        ArrayList<Integer> duplicates = dups(numbers);
        System.out.println("The following numbers were duplicated in the ArrayList: " + duplicates + ".");

        scanner.close();
    }

    public static ArrayList<Integer> dups(ArrayList<Integer> numbers) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> seen = new ArrayList<>();

        for (int number : numbers) {
            if (seen.contains(number) && !duplicates.contains(number)) {
                duplicates.add(number);
            } else {
                seen.add(number);
            }
        }

        return duplicates;
    }
}
