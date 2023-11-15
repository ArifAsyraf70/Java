public class MyIntApp
{
    public static void main(String[] args) {
        
        ArrayList<Integer> myIntList = new ArrayList<>();
        
        
        myIntList.add(3);
        myIntList.add(7);
        myIntList.add(11);        
        System.out.println("Print all elements: " +myIntList.toString());
        
        myIntList.add(1,5);
        System.out.println("Print all elements: " +myIntList.toString());
        myIntList.add(1,8);
        System.out.println("Print all elements: " +myIntList.toString());

        myIntList.set(1, 23);
        System.out.println("Print all elements: " +myIntList.toString());
        
        //System.out.println("Remove " +myIntList.remove(1)+ " from the list");
        myIntList.remove(1);
        System.out.println("Print all elements: " +myIntList.toString());
        
        
        System.out.println();        
        System.out.println("Current size: " +myIntList.size());
        
        for (int x=0; x<myIntList.size(); x++) {
            int n = myIntList.get(x);
            System.out.print(n+ " ");        
        }
        
        System.out.println("###############################"); 
        
        
        
    
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i=5; i<=15; i++)
        numList.add(i + 3);
        System.out.println(numList.get(3) * 2);
        for (int i=1; i <= numList.size(); i++)
        if (numList.get(i) % 2 == 0)
        numList.remove(i);
        System.out.println(numList);
    }
}