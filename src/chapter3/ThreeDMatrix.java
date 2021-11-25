package chapter3;

public class ThreeDMatrix {
    public static void main(String[] args) {

        /*The followings both are true declarations*/
        int[] a = new int[4];
        int b[] = new int[4];
        int [] d,e,f,g;
        int m[],s[],y[];



        int threeD[][][] = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
