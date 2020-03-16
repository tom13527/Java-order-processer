/**
    This will be the test drive class for lab 3, which will display the constructors

    @author Tom Good
*/
public class Lab3TestDrive {

    /**
        This will be the main method for lab 3, which will call the toString
        method

        @param ars command line arguements
    */
    public static void main(String[] args) {

        // create new Lab3 objects
        Lab3 lab = new Lab3();

        Lab3 lab2 = new Lab3(24);

        Lab3 lab3 = new Lab3("James");


        // Display lab 3 objects
        System.out.println(lab);

        System.out.println(lab2);

        System.out.println(lab3);
    }
}