package de.bht.pr2.lab01;

public class NotPaidTuitionFeeException extends Exception {
    // this exception is thrown if the tuition fee is not paid
    // for example if it is less than 200
    // as a message the exception should contain the amount of the tuition fee

    // new Exception
    public NotPaidTuitionFeeException(String message) {
        super(message);
    }
    
}
