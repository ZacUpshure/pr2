package de.bht.pr2.lab01;

public class WrongCourseOfStudiesException extends Exception {
    // this exception is thrown if the course of studies is not valid
    // for example if it is not one of the following:
    // Medieninformatik, Technische Informatik, Druck- und Medientechnik, Screen Based Media
    // as a message the exception should contain the false course of studies

    // new Exception
    public WrongCourseOfStudiesException(String message) {
        super(message);
    }
    
}
