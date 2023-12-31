
//Question 1

Queue tempQ = new Queue();
Queue wordQ = new Queue();
Queue excelQ = new Queue();
Queue pptQ = new Queue();

while(!PrinterQ  .isEmpty())
{
    Printer p = (Printer) PrinterQ.dequeue();
    
    if(p.getDocType().equalsIgnoreCase("word")
    {
        wordQ.enqueue(p);
    }
    else if(p.getDocType().equalsIgnoreCase("excel")
    {
        excelQ.enqueue(p);
    }
    else
    {
        pptQ.enqueue(p);
    }
    
    tempQ.enqueue(p);
}

while(!tempQ.isEmpty())
    {
        printerQ.enqueue(tempQ.dequeue());
    }
    
    
//Question 2
int count=0;
int total=0;

while(!wordQ.isEmpty())
{
    Printer p = (Printer) wordQ.dequeue();
    
    count=count + p.getNumPages();
    total=total + p.getTimeTaken();
    
    tempQ.enqueue(p);   
}

while(!tempQ.isEmpty())
{
    wordQ.enqueue(tempQ.dequeue());
}

int averageTimeWord = total/count;