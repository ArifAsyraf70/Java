 /***************************************************************************
 * Programmer: Roslan Sadjirin, UiTM (Raub, Pahang)
 * Date: 2020-11-2
 * Topic 1 - Intro. Data Structures
 ***************************************************************************/

public class MyInsertionSortApp0_Details {
    public static void main(String[] args) {
              
        System.out.println("\nSORTING: INSERTION SORT ALGORITHMS");
        
        int[] list = {2,9,5,4,8,1}; //Declare, create and initialise static array 
        String str = "{ ";
    
        System.out.println("\nBEFORE Insertion Sort:");
        System.out.println("-------------------------------------------------------------");
        System.out.print("\t");
        for (int n:list) {
            System.out.print(n + " ");
            str = str + n + " ";
        }
        str += "}";
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        
        System.out.println("<STEPS>...");
        //INSERTION SORT Algorithm
        for (int step=1; step<list.length; step++) {
            System.out.println("\nStep " + (step) + " --> ");
            int currentElement = list[step];  
            System.out.println("\tPick " + currentElement + " at index [" + step + "] from");
            System.out.println("\t\tlist " + str);  
            int index=0;
            for (index=step-1;  index >= 0 && list[index] >= currentElement; index--) {                
                list[index+1] = list[index];
            }              
            for (int n:list) {
                //System.out.print(n + " ");
                
            }
            //System.out.println("}");
            System.out.println("\tand move elements to the right starts from " + list[index+1] + " until it becomes ");
            list[index+1] = currentElement;
            str = "{ ";
            System.out.print("\t\tlist { ");           
            for (int n:list) {
                System.out.print(n + " ");  
                str = str + n + " ";
            }
            System.out.println("}");
            str = str + "}";
        }
        System.out.println("<STEPS>...");
        System.out.println();
        
        System.out.println("AFTER Insertion Sort:");
        System.out.println("-------------------------------------------------------------");
        System.out.print("\t");
        for (int n:list) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
            
        
    }//end of main()method

    
}//end of application class
