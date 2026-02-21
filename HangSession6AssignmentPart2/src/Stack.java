/*
    Kongpheng Samuel Hang, hangk@csp.edu
    CSC 422 100 Software Engineering
    Date: 2/23/2026
*/

public class Stack<E> {
    // *** Attributes *** \\\
    // Array of stack items
    private E[] elements;

    // Index of the top element
    private int top;

    // Maximum amount
    private int capacity;

    // *** Constructors *** \\
    public Stack() {
        // Default capacity of 20
        this.capacity = 20;

        // Create the array of stack items
        this.elements = (E[]) new Object[this.capacity];

        // Set the top index to -1 to indicate an empty stack
        this.top = -1;
    }

    public Stack(int capacity) {

        // Set the capacity of the stack
        this.capacity = capacity;

        // Create the array of stack items
        this.elements = (E[]) new Object[this.capacity];

        // Set the top index to -1 to indicate an empty stack
        this.top = -1;
    }

    // *** Methods *** \\
    public E pop() {
        // Check if the stack is empty before popping an item
        if (this.empty()) {
            throw new EmptyStackException();
        }

        // Get the item at the top of the stack
        E item = this.elements[this.top];

        // Set the top element to null to remove
        this.elements[this.top] = null;

        // Decrease the top index by one to point to new top
        this.top--;

        return item;
    }

    public E push(E item) {
        // Check if the stack is full before pushing an item
        if (this.top == this.capacity - 1) {
            throw new FullStackException();
        }

        // Increase the top index by one to point to new top
        this.top++;

        // Add the item to the top of the stack
        this.elements[this.top] = item;

        return item;
    }

    public E peek() {
        // Check if the stack is empty before peeking an item
        if (this.empty()) {
            throw new EmptyStackException();
        }

        // Return the top item, no removal
        return this.elements[this.top];
    }

    public boolean empty() {
        return this.top == -1;
    }
}
