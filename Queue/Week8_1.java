
    Queue tempQ = new Queue();
    int quantity=0;
    
    while(!lorryQueue .isEmpty())
    {
        Lorry lo = (Lorry)lorryQueue.dequeue();
        
        if(lo.getDateReg ().substring(4,8).equalsIgnoreCase("2016"))
        {
            quantity++;
        }
        
        tempQ.enqueue(lo);
    }
    
    while(!tempQ.isEmpty())
    {
        lorryQueue.enqueue(tempQ.dequeue());
    }
    
    System.out.println("NUMBER OF LORRY REGIRSTER IN 2016: "+quantity);
   

