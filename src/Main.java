import java.util.Scanner;
public class Main {
    public static boolean Palindrom(int number) {
        int orig = number;
        int res = 0;
        for (int i = 0; number > 0; ) {
            int figure = number % 10;
            i = i * 10 + figure;
            number = number / 10;
            res = i;
        }
        return orig == res;
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Введите число: ");
      int a = in.nextInt();
        if(Palindrom(a)) System.out.println(a + " является палиндромом");
        else System.out.println(a + " не является палиндромом");
    }
}