/***************************************************************************
 * Programmer: Roslan Sadjirin, UiTM (Raub, Pahang)
 * Date: 2020-10-18
 * Topic 1 - Intro. Data Structures
 ***************************************************************************/

public class MyBubbleSortApp0_Details {
    
    public static void main(String[] args)  {
        
        System.out.println("\nSORTING: BUBBLE SORT ALGORITHMS");
        
        int[] list = {2,9,5,4,8,1}; //Declare, create and initialise static array        
    
        System.out.println("\nBEFORE Bubble Sort:");
        System.out.println("-------------------------------------------------------------");
        System.out.print("\t");
        for (int n:list) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        
        System.out.println("<STEPS>...");
        //BUBBLE SORT Algorithm
        for (int i=0; i<(list.length)-1; i++) {
            System.out.println("Pass " + (i+1) + " --> ");
            for (int index=0; index < list.length - (i+1); index++) {
                if(list[index] > list[index+1]) {
                    int temp = list[index];
                    list[index] = list[index+1];
                    list[index+1] =  temp;
                }
        
                System.out.print("\tStep " + (index+1) + " : ");
                for (int n:list) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }
        }
        System.out.println("<STEPS>...");
        System.out.println();
        
        System.out.println("AFTER Bubble Sort:");
        System.out.println("-------------------------------------------------------------");
        System.out.print("\t");
        for (int n:list) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
            
        
    }
}
