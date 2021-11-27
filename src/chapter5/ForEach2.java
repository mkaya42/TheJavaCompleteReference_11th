package chapter5;

public class ForEach2 {

    //Use a break for a for each style loop
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println("Value of X " + x);
            sum += x;
            if (x == 5)
                break;
        }
        System.out.println("Summation of first 5 elements " + sum);
    }
}
