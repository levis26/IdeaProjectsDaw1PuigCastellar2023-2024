import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paraula = sc.next();

        char[] carateres = paraula.toCharArray();

        for (int i = carateres.length -1 ; i >=0;i--){
            System.out.print(carateres[i]);
        }

    }
}