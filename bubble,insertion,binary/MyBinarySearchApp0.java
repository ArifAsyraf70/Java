/***************************************************************************
 * Programmer: Roslan Sadjirin, UiTM (Raub, Pahang)
 * Date: 2020-10-20
 * Topic 1 - Intro. Data Structures, Binary Search
 ***************************************************************************/
import java.util.*; 

public class MyBinarySearchApp0  {    
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[] list = {2,9,5,4,8,1}; //Declare, create and initialise static array  
        
        System.out.println("\nBEFORE Bubble Sort:");
        System.out.print("\t");
        for (int n:list) {
            System.out.print(n + " ");
        }
        System.out.println();

        bubbleSort(list); //invoke BubbleSort() method and pass list[] to sort its elements
                    
        System.out.println("AFTER Bubble Sort:");
        System.out.print("\t");
        for (int n:list) {
            System.out.print(n + " ");
        } 
        
        System.out.print("\nEnter element to be searched: ");
        int element = in.nextInt();        
        int index = binarySearch(list, element);
        
        if(index != -1) {
            System.out.println("..." + element + " is found at index " + index);
        }
        else {
            System.out.println("..." + element + " can not be found within the list");
        }        
    }
    
    public static int binarySearch(int[] list, int key) {
        int low = 0, high = list.length-1;
        
        int step = 0;
        
        while(high >= low) {
            System.out.println("Step : " + ++step);            
            int mid = (low + high) / 2;
            System.out.println("\tlow index: " + low + ", high index: " + high + ", mid index: " + mid);
            System.out.println("\tKey : " + key);
            printList(list, low, high);
            System.out.println("\tlist[mid] : " + list[mid]);
            System.out.println("\tlist[low] : " + list[low]);
            System.out.println("\tlist[high] : " + list[high]);
            if (key < list[mid]) 
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
    
    //Bubble Sort Method
    public static void bubbleSort(int[] list) {
        for (int i=0; i<(list.length)-1; i++) {
            for (int index=0; index < list.length - (i+1); index++) {
                if(list[index] > list[index+1]) {
                    int temp = list[index];
                    list[index] = list[index+1];
                    list[index+1] =  temp;
                }
            }
        }
    }
    
    public static void printList(int[] list, int low, int high) {
        System.out.print("\tlist: ");
        for (int i=low; i<=high; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
