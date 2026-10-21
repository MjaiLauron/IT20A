
package PRELIM;

public class singlyLinkedlist {
        
        class Node {
            int data;
            Node next;
            
            Node(int data) {
                this.data = data;
                this.next = null;
            }
            
        }
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;   
        }
        Node current = head;
        
        while(current.next != null) {
            current = current.next;
        }
        current.next =newNode;
        
    }
    void display(){
        Node current = head;
        
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        }
    
    void displaynodes() {
        Node current = head;
        while(current != null) {
            System.out.print("Data: " + current.data);
            System.out.print(" | Current pointers: " + current);
            System.out.print(" | Next: ");
            
        if (current.next != null) {
            System.out.println(current.next);
        } else {
                System.out.println("null");
        }
        current = current.next;
        
        }
    }
        public static void main (String[] args){
            singlyLinkedlist list = new singlyLinkedlist();
            
            list.add(10);
            list.add(20);
            list.add(30);
            
            list.display();
            
            list.displaynodes();
            
             
        }
    }
