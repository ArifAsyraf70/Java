/**
 *
 * Group members name and matric number:
 * 1) MUHAMMAD ARIF ASYRAF BIN MOHD AMRAN (2020625916)
 * 2) MUHAMMMAD HAIKAL MUHAIMIN BIN KAMARUL ZAMAN (2020880808)
 * 3) MUHAMMAD ZULFAQAR BIN MD YUSOF (2020463874)
 * 4) MUHAMMAD FARIS AKMAL BIN MUSA (2020821446)
 * Class : CS1103E
 */
import java.lang.*;
public class Cake
{
   private String custID; //D001, P003
   private String cakeType; //D24 Chocolate Cake,Red Velvet,Burnt Cheese Cake,Black Forest
   private int qty;
   private double price;
   
   public Cake(String ID,String cakeType, int qty)
   {    this.custID=ID;
        this.cakeType=cakeType;
        this.qty=qty;
   }
   
   public void setID(String ID){this.custID=ID;}
   public void setCakeType(String cakeType){this.cakeType=cakeType;}
   public void setQty(int qty){this.qty=qty;}
   
   //2.a)Write the retriever method for custID, cakeType and qty
   public String getID() {return custID;}
   public String getCakeType(){return cakeType;}
   public int getQty(){return qty;}
  
   //2.b)Write the detPrice() method that will return the price of cake based on cakeType.Refer 2_GroupProject.docx
   public double detPrice()
   {
       if(cakeType.equalsIgnoreCase("d24 chocolate cake")){return 120.00;}
       else if(cakeType.equalsIgnoreCase("red velvet")){return 80.00;}
       else if(cakeType.equalsIgnoreCase("burnt cheese cake")){return 100.00;}
       else if(cakeType.equalsIgnoreCase("black forest")){return 80.00;}
       else {return 0.00;}
   }
   //2.c)Write the toString method that will return the output look like as below:
   //Customer ID:XXXX    Cake Type:XXXXXXX            Price: RM XX.XX         Quantity:XX
   
   public String toString()
   {
       return "Customer ID: "+getID()+"\tCake Type: "+getCakeType()+"\tPrice: RM "+detPrice()+"\tQuantity: "+getQty();
   }
}
