/*
    Kongpheng Samuel Hang, hangk@csp.edu
    CSC 422 100 Software Engineering
    Date: 2/23/2026
*/

public class EmptyStackException extends RuntimeException {
    // *** Constructors *** \\
    public EmptyStackException() {
        super("Stack is currently empty.");
    }

    public EmptyStackException(String message) {
        super(message);
    }
}
