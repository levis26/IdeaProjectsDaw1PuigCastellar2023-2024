//Implementa els mètodes (funcions) de la classe FunctionGame.
import java.util.*;

class FunctionGame {

    public int function1(int num){
        return num + 1;
    }
    public int function2(int num){
        return num -3;
    }
    public int function3(int num){
        return num * 10;
    }
    public int function4(int num){
        return ((num * 2) - 1);
    }
    public int function5(int num){

           return 6;

    }
    public int function6(int num1, int num2){
        return num1 + num2;
    }
    public int function7(int num1, int num2){
        int result;
        if (num2 % 2 == 0 && num2 < 6){
            result = num1 + 1;
        }else {
            result = num1;
        }
        return result;
    }
    public int function8(int num1, int num2, int num3){
        int result = 0;
        if (num1 <= num2 && num2 <= num3 || num1 <= num3 && num3 <= num2 ) result = num1;
        if (num2 <= num3 && num3 <= num1 || num2 <= num1 && num1 <= num3) result = num2;
        if (num3 <= num2 && num2 <= num1 || num3 <= num1 && num1 <= num2) result = num3;
        return result;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FunctionGame functionGame = new FunctionGame();

        String functionName = scanner.next();

        if("function1".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function1(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function2".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function2(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function3".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function3(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function4".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function4(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function5".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function5(param);
                System.out.println(param + " -> " + returnValue);
            }
        }  else if("function6".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int returnValue = functionGame.function6(param1, param2);
                System.out.println(param1 + "," + param2 + " -> " + returnValue);
            }
        } else if("function7".equals(functionName)){
            for (int i = 7; i-->0;) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int returnValue = functionGame.function7(param1, param2);
                System.out.println(param1 + "," + param2 + " -> " + returnValue);
            }
        } else if("function8".equals(functionName)){
            for (int i = 7; i-->0;) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int param3 = scanner.nextInt();
                int returnValue = functionGame.function8(param1, param2, param3);
                System.out.println(param1 + "," + param2 + "," + param3 + " -> " + returnValue);
            }
        }
    }
}
