/***************************************************************************
 * Programmer: Roslan Sadjirin, UiTM (Raub, Pahang)
 * Date: 2020-10-18
 * Topic 1 - Intro. Data Structures
 ***************************************************************************/

import java.util.*;

public class MyBubbleSortApp1 {
    static int SIZE = 1;
    static int[] list = new int[SIZE]; // declare and create static array
    static Scanner in = new Scanner(System.in);
    static int count = 0;
    
    public static void main(String[] args) {
        System.out.println("\nSORTING: BUBBLE SORT ALGORITHMS");
        System.out.println("\nDEMOSTRATION of BUBBLE SORT ALGRORITHMS using Integers");        
        System.out.println("Enter sequence of integers in random order (separated by space and ends with x)");
        System.out.println("(E.g. 2 9 5 4 8 1 X)");
        
        //Getting input from user
        System.out.print("\nInput <-- ");
        while (true) {            
            String input = in.next().trim();
            if (input.equalsIgnoreCase("X")) { break; }   

            if (count >= list.length) 
                increaseCapacity();
           
            int n = Integer.parseInt(input);     
            list[count++] = n;               
        }
        
        System.out.println("\nList of integers BEFORE BUBBLE SORT");    
        System.out.println("-------------------------------------------------------------");
        System.out.print("\t");  
        for (int i=0; i<list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        
        //Bubble Sort Algorithm
        for (int i=0; i<(list.length)-1; i++) {
            for (int index=0; index < list.length - (i+1); index++) {		
                if(list[index] > list[index+1]) {
		    int temp = list[index];
		    list[index] = list[index+1];
		    list[index+1] =  temp;
		}
            }
        } //end of Bubble Sort Algorithm
        
        System.out.println("List of integers AFTER BUBBLE SORT");  
        System.out.println("-------------------------------------------------------------");
        System.out.print("\t");  
        for (int i=0; i<list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    
    }
    
    //static method to increase the size of array
    public static void increaseCapacity() {
            int[] newData = new int[++SIZE];              
            for (int i=0; i<list.length; i++)
                newData[i] = list[i];                  
            list = newData;        
    }
}