
import java.util.*;
public class MyArrListTut2 {
public static void main(String[] args) {
//Question 1 - example
ArrayList<Integer> numberList = new ArrayList<>();
//Question 2
System.out.println(numberList.size());
System.out.println(numberList.isEmpty());
//Question 3
numberList.add(4);
numberList.add(3);
numberList.add(2);
System.out.println("SIZE: "+numberList.size());

//Question 4
for(int i=0;i<numberList.size();i++)
{
    int x =numberList.get(i);
    System.out.print(x+" ");
}
System.out.println("");
//Question 5
numberList.add(0,7);
numberList.add(1,5);
//Question 6
for(int i=0;i<numberList.size();i++)
{
    int x =numberList.get(i);
    System.out.print(x+" ");
}
System.out.println("");
//Question 7

//Question 8
numberList.add(1);
//Question 9
numberList.add(5,8);
numberList.add(5,9);
//Question 10
for(int i=0;i<numberList.size();i++)
{
    int x =numberList.get(i);
    System.out.print(x+" ");
}
System.out.println("");
//Question 11
numberList.add(4,7);
System.out.println("IndexOf(element):"+numberList.indexOf(7));
System.out.println("lastIndexOf(element):"+numberList.lastIndexOf(7));
//Question 12
System.out.println(numberList.toString());
//Question 13
numberList.remove(4);
System.out.println("lastIndexOf(element):"+numberList.lastIndexOf(7));
//Question 14
numberList.set(1,11);
System.out.println(numberList.toString());
//Question 15
System.out.println(numberList.size());
System.out.println(numberList.isEmpty());

//Question 16
bubbleSort(numberList);
for(int x=0;x<numberList.size();x++)
{
    int n=numberList.get(x);
    System.out.print(n+"");
}
System.out.println("");
//Question 17
System.out.print("PRIME NUMBER:");
for(int i=0;i<numberList.size();i++)
{
    int count=0;
    for(int p=1;p<=numberList.get(i);p++)
    {
        if(numberList.get(i)%p==0)
        {
            count++;
        }
    }
    if (count==2)
    {
        System.out.print(numberList.get(i)+" ");
    }
}
System.out.println("");

//Question 18
System.out.print("EVEN NUMBER:");
for(int i=0;i<numberList.size();i++)
{
    if(numberList.get(i)%2==0)
    {
        System.out.print(numberList.get(i)+" ");
    }
}
System.out.println("");
//Question 19
System.out.print("ODD NUMBER:");
for(int i=0;i<numberList.size();i++)
{
    if(numberList.get(i)%2==1)
    {
        System.out.print(numberList.get(i)+" ");
    }
}
System.out.println("");
//Question 20
System.out.print("DIVISIBLE BY 3:");
for(int i=0;i<numberList.size();i++)
{
    if(numberList.get(i)%3==0)
    {
        System.out.print(numberList.get(i)+" ");
    }
}
System.out.println("");

}



public static void bubbleSort(ArrayList numberList)
{ 
    for (int i=0;i<numberList.size()-1;i++)
    {
        for (int y=0;y<numberList.size()-(i+1);y++)
        {
            int a=(int)numberList.get(y);
            int b=(int)numberList.get(y+1);
            if(a>b)  //menaik
            {
                numberList.set(y,b);
                numberList.set(y+1,a);
            }
        }
    }
}

}

