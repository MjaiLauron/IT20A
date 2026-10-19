
package MIDTERM;

public class stackArray {
    private int[] stack;
    private int top;
    private int capacity;
    
    stackArray(int capacity){
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    public static void main (String []args){
        stackArray stack = new stackArray(4);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();
        
        stack.display();
        
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        System.out.println();
        
        System.out.println("Removed: " + stack.pop());
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        System.out.println();
        
        stack.display();
    }
    public void push(int value){
        if (top == capacity - 1){
            System.out.println("Stack Overflow!");
        } else {
            stack [++top] = value;
        }
    }
    public int pop(){
        if (top == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack [top --];
    }
    public int peek(){
        if (top == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack [top];
    }
    public void display(){
        if (top == -1){
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i>= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
}