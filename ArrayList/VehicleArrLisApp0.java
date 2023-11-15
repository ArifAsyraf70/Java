import java.util.*;
public class VehicleArrLisApp0 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        //Input
        while (true) {
            System.out.println("Enter the following information: ");
            System.out.print("\tModel               : ");
            String model = in.nextLine().trim();
            System.out.print("\tPlate No.           : ");
            String plateNo = in.nextLine().trim();
            System.out.print("\tManufactured Year   : ");
            int mYear = Integer.parseInt(in.nextLine().trim());
            
            Vehicle vehicle = new Vehicle(model, plateNo, mYear);
            vehicleList.add(vehicle);    
            
            System.out.print("\nAdd new data (Y/N)? ");
            char cont = in.nextLine().toUpperCase().charAt(0);
            if (cont == 'N')
                break;
        }
        
        //Output
        System.out.println("\nList of Vehicle \n(Model/Plate No./Year of Manuf./State)");
        for (int i=0; i<vehicleList.size(); i++) {
            Vehicle vehicle = vehicleList.get(i);
            System.out.println(vehicle.toString());
        }
        
    }
}
