package chapter5;

public class TypeInferenceInFor {
    public static void main(String[] args) {
        //Use the type inference in a for loop
        for (var x = 2.5; x < 100.0; x = x * 2) {
            System.out.print(x + " ");
        }
        System.out.println();
        //Use the type inference with the iteration variable
        int nums[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Values in nums array");
        for (var x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
