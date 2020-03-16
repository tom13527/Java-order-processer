import java.util.*;
/**
    This class will pick a number between 1-1000, find the square root of
    some numbers, round some numbers, and finds pi times 21. It will
    output all information.

    @author Tom Good
*/
public class Math {

    /**
        This method will perform all math calculations and display them to
        the terminal

        @param args command line arguements
    */
    public static void main(String[] args) {

        // random number between 1 - 1000
        System.out.println(java.lang.Math.random() * 1000);

        // create variables
        double four = 4;

        double twelve = 12;

        // find square root
        System.out.println(java.lang.Math.sqrt(four));

        System.out.println(java.lang.Math.sqrt(twelve));

        // create variables
        float roundInt = 0.23f; // added f to convert to float, found on StackOverflow

        double roundTenth = 0.77;

        // round nearest int
        System.out.println(java.lang.Math.round(roundInt));

        // round nearest tenth
        System.out.println(java.lang.Math.round(roundTenth));

        // create variable
        double twentyOne = 21;

        // find PI times variable
        System.out.println(java.lang.Math.PI * twentyOne);
    }
}