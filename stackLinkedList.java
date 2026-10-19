
package MIDTERM;

public class stackLinkedList {
    private class Node{
        
        int data;
        Node next;
                        
        Node(int data){
            this.data = data;
            this.next = null;
        }         
    }
    private Node top;
    
    public stackLinkedList(){
        top = null;
    }
    
    public static void main (String[] args){
        stackLinkedList stack = new stackLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println();        
        stack.display();
        
        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Top element: " + stack.peek());  
        stack.display();
    }
    public void push (int data){
        Node newNode = new Node (data);
        newNode.next = top;
        top = newNode;
    }
    public int pop(){
        if (top == null){
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    public int peek(){
        if (top == null){
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }
    public void display(){
        Node current = top;
        
        System.out.print("Stack: ");
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
}    
}