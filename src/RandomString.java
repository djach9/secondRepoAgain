import java.util.Scanner;

public class RandomString {

    static String generateToken(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz" +"!@#$%^&*()";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 0;
        boolean done = false;
        while (!done) {
            try {
                do {
                    System.out.println("What token length do you need?\n" + "Select and enter 5,10 or 15");
                    Scanner sc = new Scanner(System.in);
                    n = sc.nextInt();
                } while ((n != 5 && (n != 10)) && n != 15);
                done = true;
            } catch (Exception e) {
                System.out.println("You must write a number");
            }
        }
        System.out.println(RandomString.generateToken(n));
    }
}
