package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] myUsers = {myUser1, myUser2, myUser3};
        System.out.println(Arrays.toString(myUsers));

        Arrays.sort(myUsers);
        System.out.println(Arrays.toString(myUsers));

        Arrays.sort(myUsers, new IdComparator());
        System.out.println(Arrays.toString(myUsers));

        Arrays.sort(myUsers, new IdComparator().reversed());
        System.out.println(Arrays.toString(myUsers));
    }
}
