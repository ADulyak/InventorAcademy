import java.util.Scanner;
// this class represent insertion algorithm
public class InsertionSortAlgImpl {
    // implementation of insertion algorithm
    private static int[] insertionAlg(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int k = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > k) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = k;
        }
        return numbers;
    }

    // getting user input from console. Each number must be separated by space
    private static int[] input(Scanner sc) {
        System.out.println("Enter numbers separated by space");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] array = new int[numbers.length];
        int i = 0;
        for (String s : numbers) {
            try {
                array[i] = Integer.parseInt(s);
                i++;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Wrong input. Enter only numbers \n" + e);
            }
        }

        return insertionAlg(array);
    }

    //print sorted numbers
    private static void printNumbers(Scanner sc) {
        StringBuilder sb = new StringBuilder();
        for (int i : InsertionSortAlgImpl.input(sc)) {
            sb.append(i).append(" ");
        }
        System.out.println("Sorted numbers:");
        System.out.print(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertionSortAlgImpl.printNumbers(sc);
    }
}