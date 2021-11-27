package chapter5;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        //Find midpoint between i and j
        while (++i < --j) ; //no body in this loop

        System.out.println("The mid point is " + i);
    }
}
