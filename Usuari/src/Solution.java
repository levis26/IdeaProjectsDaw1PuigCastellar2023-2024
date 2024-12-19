import java.util.Locale;
import java.util.Scanner;
class User {
    int id;
    String username;
    String displayName;
    String email;

    User(int id, String username, String displayName, String email) {
        this.id = id;
        this.username = username;
        this.displayName = displayName;
        this.email = email;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        User user1 = new User(1001,"acasas", "Armando Casas", "acasas@mail.com");
        User user2 = new User(1002,"equito", "Esteban Quito", "equito@mail.com");
        User user3 = new User(1003,"centes", "Cindy Entes", "centes@mail.com");

        String format = "%6d | %-8s | %-16s | %-18s %n";
        System.out.format(format, user1.id, user1.username, user1.displayName, user1.email);
        System.out.format(format, user2.id, user2.username, user2.displayName, user2.email);
        System.out.format(format, user3.id, user3.username, user3.displayName, user3.email);
    }
}