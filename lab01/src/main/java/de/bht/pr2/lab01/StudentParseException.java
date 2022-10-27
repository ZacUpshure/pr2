package de.bht.pr2.lab01;

public class StudentParseException extends Exception { 
    // this exception is thrown if the student data is not valid
    // for example if there are too many commas.
    // as a message the exception should contain the line of the student data



    // new exception
    public StudentParseException(String message) {
        super(message);
    }

    // method to get the message
    public String getMessage() {
        return super.getMessage(); // call the method of the superclass
    }

    // method to print stack trace
    public void printStackTrace() {
        super.printStackTrace(); // call the method of the superclass
    }
    
}
