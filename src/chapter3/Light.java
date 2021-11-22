package chapter3;

public class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate speed of light in miles per second
        lightspeed = 186000;

        //specify number of days here
        days = 1000;

        //convert to seconds
        seconds = days * 24 * 60 * 60;

        //compute distance
        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles");

    }
}
