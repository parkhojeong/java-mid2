package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
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

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println((double) sum / list.size());
    }
}
