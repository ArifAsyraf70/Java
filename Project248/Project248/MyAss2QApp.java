import java.util.*;
import java.io.*;
import java.lang.*;
public class MyAss2QApp {
    public static void main(String[] args) throws Exception 
    {
        try
        {
            BufferedReader br = new BufferedReader (new FileReader ("cakeOrder.txt"));
            PrintWriter pickOut = new PrintWriter (new FileWriter ("pickup.txt"));
            PrintWriter delOut = new PrintWriter (new FileWriter ("delivery.txt"));
            Queue cakeQ=new Queue();
            Queue tempQ=new Queue();
            
            //a)b)c)read the data from cakeOrder.txt and insert into cakeQ
            String s=null;
            s=br.readLine();
            while(s!=null)
            {
                StringTokenizer st = new StringTokenizer(s,"*");//to separate the data using the token "*"
                
                //place the separate data into each variables
                String custID=st.nextToken(); 
                String cakeType=st.nextToken();
                int qty=Integer.parseInt(st.nextToken());
                
                Cake cakeOrder= new Cake(custID,cakeType,qty);//store in object
                cakeQ.enqueue(cakeOrder);//store in queue 
                s=br.readLine();//read the next line of text from cakeOrder.txt
            }
            
            //d)display the data in the cakeQ
                        
            while(!cakeQ.isEmpty())
            {
                Cake c =cakeQ.dequeue();
                
                System.out.println(c.toString());//display the data in the current object
                
                tempQ.enqueue(c);
            }
            
            while(!tempQ.isEmpty())
            {
                cakeQ.enqueue(tempQ.dequeue());
            }
            
            //e)The first character of custID is based on the delivery type. If the first character is 'P', 
            //that means the customer choose to pick up the cake, and if the first character is 'D', that means 
            //the customer chooses to have delivery service. E.g. custID are P002, D112, etc. Write the data 
            //for delivery into delivery.txt output file and the data for customer that chooses self pick up into pickup.txt. 
            
            while(!cakeQ.isEmpty())
            {
                Cake c =cakeQ.dequeue();
                
                if(c.getID().substring(0,1).equalsIgnoreCase("P"))//to see if customer choose to self pick up
                {
                    pickOut.println(c.toString());
                }
                else//to see if customer choose for delivery
                {
                    delOut.println(c.toString());
                }
                
                tempQ.enqueue(c);
            }
            
            while(!tempQ.isEmpty())
            {
                cakeQ.enqueue(tempQ.dequeue());
            }
                                   
            //f)Display the total quantity order for each cake type and display the cake name of the highest total order
            
            int D=0,R=0,BC=0,BF=0; //the declaration of quantity order for each cake
            while(!cakeQ.isEmpty())
            {
                Cake c=cakeQ.dequeue();
                
                if(c.getCakeType().equalsIgnoreCase("D24 Chocolate Cake"))//count of D24 Chocolate Cake
                {
                    D=D + c.getQty();
                }
                
                else if(c.getCakeType().equalsIgnoreCase("Red Velvet"))//count of Red Velvet cake
                {
                    R=R + c.getQty();
                }
                
                else if(c.getCakeType().equalsIgnoreCase("Burnt Cheese Cake"))//count of Burnt Cheese Cake
                {
                    BC=BC + c.getQty();
                }
                
                else//count of Black Forest cake
                {
                    BF=BF + c.getQty();
                }
                
                tempQ.enqueue(c);
            }
            
            
            while(!tempQ.isEmpty())
            {
                cakeQ.enqueue(tempQ.dequeue());
            }
            
            System.out.println("\nTotal quantity of D24 Chocolate Cake : "+D);//display the total quantity of D24 Chocolate Cake
            System.out.println("Total quantity of Red Velvet Cake : "+R);//display the total quantity of Red Velvet Cake
            System.out.println("Total quantity of Burnt Cheese Cake : "+BC);//display the total quantity of Burnt Cheese Cake
            System.out.println("Total quantity of Black Forest : "+BF);//display the total quantity of Black Forest
            
            int highest=0;//declaration the highest quantity
            String highName=null;//declaration the name of cake that has the highest quantity
            
            if(highest < D)//if the highest quantity of the cake is less than D24 Chocolate Cake quantity
            { 
                highest=D;//the highest quantity is D24 Chocolate Cake
                highName="D24 Chocolate Cake";//the name of cake that has the highest quantity is D24 Chocolate Cake
            }
            
            if(highest < R)//if the highest quantity of the cake is less than Red Velvet Cake quantity
            {
                highest=R;//the highest quantity is Red Velvet Cake
                highName="Red Velvet";//the name of cake that has the highest quantity is Red Velvet Cake
            }
            
            if(highest < BC)//if the highest quantity of the cake is less than Burnt Cheese Cake quantity
            {
                highest=BC;//the highest quantity is Burnt Cheese Cake 
                highName="Burnt Cheese Cake";//the name of cake that has the highest quantity is Burnt Cheese Cake 
            }
            
            if(highest < BF)//if the highest quantity of the cake is less than Black Forest quantity
            {
                highest=BF;//the highest quantity is Black Forest 
                highName="Black Forest";//the name of cake that has the highest quantity is Black Forest
            }
            
            System.out.println("\nHighest total order is "+highest+" for "+highName);//display the highest total order and the cake name
            
            //g)Display the receipt that displays the custID, cakeType, price(using detPrice() method), qty, 
            //payment for each order. To calculate the payment for each order you need to multiply quantity 
            //with the cake price and extra charge of RM 5.00 for delivery service. Lastly, display the total 
            //payment for all the orders. 
            
            int loop = 1; //declaration to see the sequece of customer
            double totalPayment = 0;
            double totalCharge = 0;
            while(!cakeQ.isEmpty())
            {
                Cake c = cakeQ.dequeue();
                
                System.out.println("++++++++++++++++++++++++++++++++++");//just draw the line
                System.out.println("Customer no "+loop);//display the sequence of customer
                System.out.println("++++++++++++++++++++++++++++++++++");//just draw the line
                System.out.println("Customer ID:"+c.getID());//display the customer id
                System.out.println("Cake Name:"+c.getCakeType());//display the cake name
                System.out.println("Price: RM "+String.format("%.2f",c.detPrice()));//display the cake price
                System.out.println("Quantity:"+c.getQty());//display the quantity
                
                double charge = 0.00;
                if(c.getID().substring(0,1).equalsIgnoreCase("D"))//if the first character of customer ID is "D"
                {
                    charge = 5.00;//the charge will be count as RM5.00
                    System.out.println("Delivery/Self Pick-Up: Delivery");//shows that the choose is delivery service
                }
                
                else
                {
                    System.out.println("Delivery/Self Pick-Up: Self Pick-Up");//shows that the customer choose is self pick-up
                }
                
                double Payment = c.getQty() * c.detPrice();//calculate the payment of the each cake
                System.out.println("Payment: RM "+String.format("%.2f",Payment)+"\n");//display payment
                
                totalPayment = totalPayment + Payment;//calculate the total payment
                totalCharge = totalCharge + charge;//calculate the total charge
                loop++;//the increment of customer sequence
                tempQ.enqueue(c);
            }
            
            System.out.println("\nTotal payment: RM "+String.format("%.2f",totalPayment+totalCharge));//shows the total of payment of the customers
            
                
            br.close();
            pickOut.close();
            delOut.close();
        }
        catch(Exception e) {System.err.println(e.getMessage());}
    
    } /***End of main() Method***/   
}/***End of Application Class***/