
import java.util.*;
public class exam2
{
public static void main(String arg[]) 
{
    Scanner in = new Scanner(System.in);
    
int num;
LinkedList list = new LinkedList();
Scanner Scan = new Scanner (System.in);
for (int i=0; i<= 5; i++) {
num = scan.nextInt();
list.insertAtBack(num);
}
int value = 13;
Object data = list.getFirst();
while (data!= null) {
System.out.println("Number is :"+value);
value = Integer.parselnt (data.toString()) ;
value = value/2;
if (value < 12)
list.insertAtFront(value);
Object data = list.getNext();
}
}
}

Scanner in = new Scanner(System.in);
Scanner inline = new Scanner(System.in);

LinkedList houseLL = new LinkedList();
for (int x=0; x<50; x++) 
{
int t = inline.nextLine();
int a = inline.nextLine();
int n = in.nextInt();
int p = in.nextDouble();

House house = new House(t,a,n,p);
houseLL.insertAtBack(house);
}



LinkedList semiDLL = new LinkedList();
LinkedList terraceLL = new LinkedList();
LinkedList otherLL = new LinkedList();

LinkedList p = houseLL.getFirst();
while(p != null) 
{
if(p.getType().equalsIgnoreCase("Terrace") 
{
    terraceLL.insertAtBack(p);
}
else if(p.getType().equalsIgnoreCase("semiD")
{
    semiDLL.insertAtBack(p);
}
else
{
    otherDLL.insertAtBack(p);
}

p = houseLL.getNext();
}



//Calculate and display the price after discount for each house in terraceLL.
double newPrice=0;

LinkedList p = terrace.getFirst();

while(p != null) 
{
if(p.getPrice() < 15000)
{
    newPrice= p.getPrice()*0.97;
    System.out.println(p.toString);
    System.out.println("NEW PRICE: "+newPrice);
}
else if(p.getPrice() >= 15000 && p.getPrice() <= 30000)
{
    newPrice= p.getPrice()*0.95;
    System.out.println(p.toString);
    System.out.println("NEW PRICE: "+newPrice);
}
else
{
    newPrice= p.getPrice()*0.90;
    System.out.println(p.toString);
    System.out.println("NEW PRICE: "+newPrice);
}

p = terraceLL.getNext();
}