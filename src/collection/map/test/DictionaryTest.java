package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        System.out.println("==enter word stage==");
        while(true) {
            System.out.print("enter english word (quit: q): ");
            String word = scanner.nextLine();
            if(word.equals("q")) {
                break;
            }
            System.out.print("enter korean word:");
            String korean = scanner.nextLine();

            dictionary.put(word, korean);
        }

        System.out.println("==search word stage==");
        while (true) {
            System.out.print("enter word to search (quit: q): ");
            String word = scanner.nextLine();
            if(word.equals("q")) {
                break;
            }
            if(!dictionary.containsKey(word)) {
                System.out.println(word + " is not in dictionary.");
            } else {
                System.out.println(word + " mean: " + dictionary.get(word));
            }
        }

    }
}
