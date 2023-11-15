public class MyNodeAppT4 
{    
    public static void main(String[] args) 
    {    
    
    Node <Integer> head, tail, current;
    Node <Integer> node = null;    

        
    //QUESTION: Q1
    head = tail = current = null;
    
    //QUESTION Q2
    node = new Node<>(3);
        head = tail = node;
    
    //QUESTION Q3
    node =new Node<>(5);
    tail.next=node;
    tail=node;
    
    //QUESTION Q4
    node =new Node<>(8);
    node.next=head;
    head=node;
    
    //QUESTION Q5
    node=new Node<>(9);
    node.next=head.next;
    head.next=node;
    
    //QUESTION Q6
    node= new Node<>(1);
    node.next=head.next;
    head.next=node;
    
    //QUESTION Q7
    node= new Node<>(4);
    node.next=head;
    head=node;
    
    //QUESTION Q8            //4 8 7 1 9 3 5
    node=new Node<>(7);
    node.next=head.next.next;
    head.next.next=node;
    
    //QUESTION Q9 (Remove the 2nd element)  //4 7 1 9 3 5
    head.next=head.next.next;
    
    //Question Q10   //7 1 9 3 5
    head=head.next;
    
    //QUESTION Q11   //7 1 9 3
    current=head;
    while(current !=null)
    {
        if(current.next.next ==null)
        {
            current.next=null;
            current=tail;
            break;
        }
        current=current.next;    
    }
    
    
    //QUESTION Q12
    current = head;
        while(current != null) {
            System.out.print(current.element); 
            if(current.next != null) 
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" ");
    
    
    
    
    
    } //end of main()
} //end of application class
