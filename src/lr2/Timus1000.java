package lr2;

import java.util.Scanner;

public class Timus1000 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    String[] parts = input.split(" ");
    int first = Integer.parseInt(parts[0]);
    int second = Integer.parseInt(parts[1]);
    System.out.println(first + second);
    }
}
