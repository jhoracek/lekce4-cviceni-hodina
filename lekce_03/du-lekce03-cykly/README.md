# Domácí úkol &mdash; cykly

Na procvičení cyklů jsme vám připravili šablonu kódu pro čtení čísel ze vstupu a&nbsp;jejich zpracování.

Vaším úkolem je dopsat těla (kód) těch metod, která chybí.

Pro zjednodušení načítání čísla ze vstupu jsme vám připravili metodu `safeReadInt()`, protože načítáním čísel se budeme zabývat až v&nbsp;[páté lekci](https://github.com/ENGETO-Java-Akademie-2021/content/tree/main/lekce_05).

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int INVALID_INPUT = -1;

    /**
     * Read one integer. If given input cannot be converted to integer,
     * prints error and return -1;
     * @return Integer read or -1 if invalid input entered
     */
    public static int safeReadInt() {
        int result = INVALID_INPUT;
        String inputText = scanner.nextLine();
        try {
            result = Integer.parseInt(inputText);
        } catch (NumberFormatException ex) {
            System.err.println("Zadal jsi text, který nelze převést na celé číslo: "+inputText);
        }
        return result;
    }

    /**
     * Example of use of {@link Main#safeReadInt()}
     *
     * Read one integer from input and print it to output
     * @return integer from input
     */
    public static void readOneIntFromInputAndPrintIt() {
        System.out.println("Zadej číslo: ");
        int input = safeReadInt();
        System.out.println("Zadal jsi: "+input);
    }

    /**
     * Read integers from input and print them until negative
     * input.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {
        // *** Zde zapište svůj kód ***
    }

    /**
     * Sum all input numbers (negative number terminates reading) and return result.
     * @return Sum of input numbers.
     */
    public static int sumAllInputUntilNegative() {
        // *** Zde zapište svůj kód ***
    }

    /**
     * Store all input numbers in ArrayList (negative number terminates reading)
     * @return ArrayList of read values (terminating negative value is included)
     */
    public static ArrayList storeAllInputInArrayListUntilNegative() {
        // *** Zde zapište svůj kód ***
    }

    /**
     * Print all integers from given list.
     * @param list List of integers to print.
     */
    public static void printAllIntegersFromList(ArrayList<Integer> list) {
        // *** Zde zapište svůj kód ***
    }

    public static Integer sumAllIntegersFromList(ArrayList<Integer> list) {
        // *** Zde zapište svůj kód ***
    }

    public static void main(String[] args) {
        // Example
        System.out.println("--- Example - read and print one number ---");
        readOneIntFromInputAndPrintIt();
        // ---
        System.out.println("--- Task 1 - read and print until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
        System.out.println("--- Task 2 - sum all until negative ---");
        System.out.println("Celkový součet je: " + sumAllInputUntilNegative());;
        // ---
        System.out.println("--- Task 3 - read to list until negative ---");
        ArrayList<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all from list ---");
        System.out.println("Celkový součet je: " + sumAllIntegersFromList(list));
    }
}
```