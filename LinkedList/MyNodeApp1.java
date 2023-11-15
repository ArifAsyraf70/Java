public class MyNodeApp1
{
    public static void main(String[] args)
    {
        
    
        Node<String> head, tail, current;
        head = tail = current = null; //the list is empty
        
        //add T to the list, head and tail.        
        Node<String> node = new Node<>("T");
        head = tail = node;
        
        //add R to the list, and place it as the first element of the list
        node = new Node<>("R");
        node.next = head;
        head = node;
        
        //add C to the list, and place it as the 2nd element of the list
        node = new Node<>("C");
        node.next = head.next;
        head.next = node;
        
        //add U, and place it at the end of the list3
        node = new Node<>("U");    
        tail.next = node;
        tail = node;
                
        //add U, and place it as the 2nd element of the list
        node = new Node<>("U");
        node.next = head.next;
        head.next = node;
        
        //add T to the list, and place it as the head       
        node = new Node<>("T");
        node.next = head;
        head = node;        
        
        //add T to the list, and place it as the head       
        node = new Node<>("S");
        node.next = head;
        head = node;
        
        node = new Node<>("R");    
         tail.next = node;
         tail = node;
        
        node = new Node<>("E");    
        tail.next = node;
        tail = node;
        
        node = new Node<>("S");    
        tail.next = node;
        tail = node;
        
        //traverse the element of the list
        current = head;
        while(current != null) {
            System.out.print(current.element); 
            if(current.next != null) 
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" ");
        
        //Remove 1st element from the list
        //S -> T -> R -> U -> C -> T -> U -> R -> E -> S
        head = head.next; //T -> R -> U -> C -> T -> U -> R -> E -> S
        
        //Remove last element from the list;
        //T -> R -> U -> C -> T -> U -> R -> E -> S
        
        
        current = head;
        while(current != null)
        {
            if(current.next.next == null) 
            {
                current.next = null;
                tail=current;
                
                break;
            }
            current = current.next;
        }
        System.out.println(" ");
    
    
    
        //T -> R -> U -> C -> T -> U -> R -> E
        System.out.println(" ");
        System.out.println("Head: " + head.element);
                System.out.println("Tail: " + tail.element);
        System.out.println("2nd Element: " + head.next.element);
        System.out.println("3rd Element: " + head.next.next.element);
        System.out.println("4th Element: " + head.next.next.next.element);
    
        //traverse the element of the list
        current = head;
        while(current != null) {
            System.out.print(current.element); 
            if(current.next != null) 
                System.out.print(" -> ");
            current = current.next;
        }
    
    }
}