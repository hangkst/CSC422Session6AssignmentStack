/*
    Kongpheng Samuel Hang, hangk@csp.edu
    CSC 422 100 Software Engineering
    Date: 2/23/2026
*/

public class FullStackException extends RuntimeException {
    // *** Constructors *** \\
    public FullStackException() {
        super("Stack is currently full.");
    }

    public FullStackException(String message) {
        super(message);
    }
}
