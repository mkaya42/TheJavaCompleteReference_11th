package chapter3;

public class ScopeErr
{
    public static void main(String[] args) {
        int bar =1;
        {   //creates a new scope
            //int bar =1; //Compilation error - bar is already defined.
        }
    }
}
