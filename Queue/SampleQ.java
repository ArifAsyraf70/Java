public class SampleQ
{
    public static void main (String[] args)
    {
        Queue q1 = new Queue();

            q1.enqueue(21);
            q1.enqueue(32);
            q1.dequeue();
            q1.enqueue(48);

    }
    Queue highCc = new Queue();
        Queue lowCc = new Queue();
        
        while(!myQ.isEmpty())
        {
            Object  obj = myQ.dequeue();
            CarModel  crm = (CarModel) obj;
            
            if(crm.getCubicCapacity() <=1300)
            lowCc.enqueue(crm);
            else
            highCc.enqueue(crm);
        }



}
