public class SampleQ
{
    public static void main (String[] args)
    {
            Queue room1 = new Queue();
            Queue room2 = new Queue();
            Queue room3 = new Queue();
        
            while(!patientList.isEmpty())
            {
                Object  obj = myQ.dequeue();
                Clinic   cli = (Clinic) obj;
            
                if(cli.getCriticalType() == 1)
                room1.enqueue(cli);
                else
                if(cli.getCriticalType() == 2)
                room2.enqueue(cli);
                else
                room3.enqueue(cli);
            }
            
            //program segment to display all patients with flu from patientList
            while(!patientList.isEmpty())
            {
                Object  obj = myQ.dequeue();
                Clinic   cli = (Clinic) obj;
                
                if(cli.getSicknessType().equalIgnoreCase("flu"))
                {
                    System.out.println("ID: "+cli.getID());
                    System.out.println("SICKNESS TYPE: "+cli.getSicknessType());
                    System.out.println("CRITICAL TYPE: "+cli.getCriticalType());
                }
                
            }
        }
}