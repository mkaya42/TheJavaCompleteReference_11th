package chapter5;

public class FindPrime {
    public static void main(String[] args) {
        int num = 14;
        boolean isPrime;

        if (num < 2) {
            isPrime = false;
        }
        else { isPrime = true;}

        for (int i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
