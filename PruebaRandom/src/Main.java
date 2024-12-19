import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        /*int numberRandom1 = rand.nextInt(4)+1;
        int numberRandom2 = rand.nextInt(4)+1;
        int numberRandom3 = rand.nextInt(4)+1;
        int numberRandom4 = rand.nextInt(4)+1;
        int numberRandom5 = rand.nextInt(4)+1;*/

        int numberRandom1 = (int) Math.floor(Math.random() * 4) + 1;
        int numberRandom2 = (int) Math.floor(Math.random() * 4) + 1;
        int numberRandom3 = (int) Math.floor(Math.random() * 4) + 1;
        int numberRandom4 = (int) Math.floor(Math.random() * 4) + 1;
        int numberRandom5 = (int) Math.floor(Math.random() * 4) + 1;

        int numberRandom6 = (int) Math.floor(Math.random() * 4);
        int numberRandom7 = (int) Math.floor(Math.random() * 4);
        int numberRandom8 = (int) Math.floor(Math.random() * 4);
        int numberRandom9 = (int) Math.floor(Math.random() * 4);
        int numberRandom10 = (int) Math.floor(Math.random() * 4);

        double numberRandoma = Math.floor(Math.random() * 4);
        double numberRandomb = Math.floor(Math.random() * 4);
        double numberRandomc = Math.floor(Math.random() * 4);
        double numberRandomd = Math.floor(Math.random() * 4);
        double numberRandome = Math.floor(Math.random() * 4);

        double numberRandom11 = Math.random() * 4;
        double numberRandom12 = Math.random() * 4;
        double numberRandom13 = Math.random() * 4;
        double numberRandom14 = Math.random() * 4;
        double numberRandom15 = Math.random() * 4;

        double numberRandom16 = Math.random();
        double numberRandom17 = Math.random();
        double numberRandom18 = Math.random();
        double numberRandom19 = Math.random();
        double numberRandom20 = Math.random();

        System.out.print(numberRandom1);
        System.out.print(numberRandom2);
        System.out.print(numberRandom3);
        System.out.print(numberRandom4);
        System.out.print(numberRandom5);
        System.out.println();
        System.out.print(numberRandom6);
        System.out.print(numberRandom7);
        System.out.print(numberRandom8);
        System.out.print(numberRandom9);
        System.out.print(numberRandom10);
        System.out.println();
        System.out.print(numberRandoma+" "+ numberRandomb +" "+ numberRandomc + " " + numberRandomd + " " + numberRandome);
        System.out.println();
        System.out.print(numberRandom11+" "+ numberRandom12 +" "+ numberRandom13 + " " + numberRandom14 + " " + numberRandom15);
        System.out.println();
        System.out.print(numberRandom16+" "+ numberRandom17 +" "+ numberRandom18 + " " + numberRandom19 + " " + numberRandom20);



    }
}