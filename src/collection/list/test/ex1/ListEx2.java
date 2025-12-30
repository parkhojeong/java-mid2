package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers, 0 to stop");
        while (true) {
            int i = scanner.nextInt();
            if(i == 0){
                break;
            }
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i < list.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
