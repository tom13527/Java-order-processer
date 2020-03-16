/**
    This will hold the lab 3 class which will test overloading constructors

    @author Tom Good
*/
public class Lab3 {

    // set variables
    String name;
    int size;

    /**
        Constructor that will set the variable values
    */
    public Lab3() {

        name = "Joe";
        size = 12;
    }

    /**
        Constructor that will override size value

        @param size
    */
    public Lab3 (int size) {
        this();
        this.size = size;
    }

    /**
        Constructor that will override name

        @param name
    */
    public Lab3 (String name) {
        this();
        this.name = name;
    }

    public String toString () {
        return "Name: " + name + "\nSize: " + size;
    }
}