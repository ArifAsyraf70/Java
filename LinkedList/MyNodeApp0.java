public class MyNodeApp0
{
    public static void main(String[] args) 
    {
        Node<String> head, tail, current;
        head = tail = current = null;
        
        Node<String> node = null; //declare node object
        
        node = new Node("A");
        
        head = tail = node;
              
        tail.next = new Node("T");
        tail = tail.next;
        
        node = new Node("D");
        node.next = head;        
        head = node; 
        
        tail.next = new Node("A");
        tail = tail.next;
        
        
        System.out.println("The sequence of data in LinkedList: ");
        current = head;
        while(current != null){
            System.out.print(current.element+ " ");
            current = current.next;
        }
        
        
        
    
    
    }  
    
}