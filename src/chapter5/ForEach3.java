package chapter5;

public class ForEach3 {
    public static void main(String[] args) {

        int nums[][] = new int[3][5];
        int sum = 0;
        //Give nums some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        //Use for each for to display some o the values

        for (int[] i : nums) {
            for (int j : i) {
                sum += j;
            }
        }
        System.out.println("Sum of the nums values " + sum);


    }
}
