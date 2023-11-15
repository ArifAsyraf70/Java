/**
 * Hak Milik Muhd Azri Mokhzani Sdn. Bhd.
 * Isi Data kat dalam Inventory File, Generated Name, Food_Menu ngan Branch nak dalam 50 line data
 **/

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.math.*;

class Main{
    public static void main(String[] args) throws IOException {
        Restoran res = new Restoran();
        res.InitiateKey(); //NIE JANGAN SENTUH!!!!!
        res.setMenu(); /**Pilih dekat sini sama ada nak setStaff, setOrders, setOrdersDetails, setSalary, setBranch, SetMenu, SetInventory**/
    }
}

class Restoran{
    public ArrayList<array> staff = new ArrayList<>();
    public ArrayList<array> order = new ArrayList<>();
    public ArrayList<array> menu = new ArrayList<>();
    public ArrayList<array> order_details = new ArrayList<>();
    public ArrayList<array> branch = new ArrayList<>();
    public ArrayList<array> salary = new ArrayList<>();
    public ArrayList<array> inventory = new ArrayList<>();

    /**Boleh Ubah Nationality, Banks ngan Orders_info kalau nak ubah**/

    private String[] Staff_Nationality = {"Malaysian","Kadazan","Indian","Indonesian","Chinese","Acheh","Pakistanian"};
    String[] Months = {"January","February","March","April","May","Jun","July","August","September","October","November","Disember"};
    String[] Orders_Info = {"Kuantiti Banyak","Kuantiti Sikit","Tambah Sambal","Tak nak Sambal","Kurang Masin","Bungkus","Ala Carte","Tambah Set Air"};
    String[] Banks = {"Maybank","Bank Islam","Bank Rakyat","Hong Leong Bank","CIMB Bank","Affin Bank","RHB Bank"};

    private Random rand = new Random();
    private String Staff_Expiry_Visa;
    private int count,branch_limit = 3,day,month,limit = 3,Staff_ID =12,Order_ID = 100,Menu_ID = 5,OrderDetails_ID = 10,Branch_ID,Salary_ID,Inventory_ID;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void InitiateKey() throws IOException {
        BufferedReader BR_STAFF = new BufferedReader(new FileReader("Name.txt"));
        BufferedReader BR_MENU = new BufferedReader(new FileReader("Food_Menu.txt"));
        BufferedReader BR_BRANCH = new BufferedReader(new FileReader("Branch.txt"));
        BufferedReader BR_INVENTORY = new BufferedReader(new FileReader("Inventory.txt"));

        String s = BR_STAFF.readLine();
        String m = BR_MENU.readLine();
        String b = BR_BRANCH.readLine();
        String inv = BR_INVENTORY.readLine();

        while(s != null){
            staff.add(new array(s,Staff_ID));

            Staff_ID++;
            s = BR_STAFF.readLine();
        }

        for (int i = 0; i < limit; i++) {
            Order_ID++;
            order.add(new array(Orders_Info[rand.nextInt(Orders_Info.length)],Order_ID));
        }

        while(m != null){
            String info = m;
            float price = rand.nextInt(15) + 7;
            menu.add(new array(info,Menu_ID,price));

            Menu_ID++;
            m = BR_MENU.readLine();
        }

        for (int i = 0; i < limit; i++) {
            order_details.add(new array(OrderDetails_ID,rand.nextInt(5) + 1));
            OrderDetails_ID++;
        }

        while(b != null){
            Branch_ID++;
            array staff_array = (array) staff.get(count);
            branch.add(new array(b,Branch_ID,staff_array.getNum()));
            count++;
            b = BR_BRANCH.readLine();
        }

        for (int i = 0; i < staff.size(); i++) {
            Salary_ID++;
            int amount = 350*(rand.nextInt(5) + 1);
            String bank_acc = String.valueOf(200000000 - rand.nextInt(123456)) + " " + Banks[rand.nextInt(Banks.length)];

            salary.add(new array(bank_acc,Salary_ID,amount));
        }

        while(inv != null){
            StringTokenizer ST_INVENTORY = new StringTokenizer(inv,";");
            Inventory_ID++;

            String Inventory_Info = ST_INVENTORY.nextToken();
            int Current_Stock = 20*(rand.nextInt(70) + 10);

            inventory.add(new array(Inventory_Info,Inventory_ID,Current_Stock));
            inv = BR_INVENTORY.readLine();
        }
    }

    public void setStaff(){
        for (int i = 0; i < limit; i++) {
            String count = Staff_Nationality[rand.nextInt(Staff_Nationality.length)];
            day = 0;
            month = 0;

            if((count.equals("Malaysian")) || (count.equals("Indian")) || (count.equals("Chinese"))){
                Staff_Expiry_Visa = null;
            } else {
                day = rand.nextInt(30) + 1;
                month = rand.nextInt(12) + 1;

                if((day< 10) && (month < 10)){
                    String M = "0" + month;
                    String D = "0" + day;
                    Staff_Expiry_Visa = "\"" + "2021" + "-" + M + "-" + D + "\"";
                } else if(month < 10){
                    String M = "0" + month;
                    Staff_Expiry_Visa = "\"" +2021 + "-" + M + "-" + day+ "\"";
                } else if(day< 10){
                    String D = "0" + day;
                    Staff_Expiry_Visa = "\"" +2021 + "-" + month + "-" + D+ "\"";
                } else {
                    Staff_Expiry_Visa = "\"" +2021 + "-" + month + "-" + day+ "\"";
                }
            }

            array staff_array = (array) staff.get(i);
            System.out.println("Insert Staff Values (" + staff_array.getNum() + ",\"" + staff_array.getValue() + "\",\"" + count + "\"," + Staff_Expiry_Visa + ");");
        }
    }

    public void setOrder(){
        for (int i = 0; i < limit; i++) {
            int day = rand.nextInt(30) + 1;
            int month = rand.nextInt(12) + 1;
            String date;
            if((day< 10) && (month < 10)){
                String M = "0" + month;
                String D = "0" + day;
                date = "\"" + "2021" + "-" + M + "-" + D + "\"";
            } else if(month < 10){
                String M = "0" + month;
                date = "\"" +2021 + "-" + M + "-" + day+ "\"";
            } else if(day< 10){
                String D = "0" + day;
                date = "\"" +2021 + "-" + month + "-" + D+ "\"";
            } else {
                date = "\"" +2021 + "-" + month + "-" + day+ "\"";
            }

            array order_array = (array) order.get(i);
            array staff_array = (array) staff.get(rand.nextInt(limit));
            System.out.println("Insert Orders Values (" + order_array.getNum() + "," + date + ",\"" + order_array.getValue() + "\"," + staff_array.getNum() + ");");
        }
    }

    public void setMenu(){
        for (int i = 0; i < limit; i++) {
            array menu_array = (array) menu.get(i);
            System.out.println("Insert Menu Values (" + menu_array.getNum() + ",\"" + menu_array.getValue() + "\"," + df.format(menu_array.getPrice()) + ");");
        }
    }

    public void setOrderDetails(){
        for (int i = 0; i < limit; i++) {
            array orderdetails_array = (array) order_details.get(i);
            array order_Array = (array) order.get(rand.nextInt(order.size()));
            array menu_array = (array) menu.get(rand.nextInt(limit));
            System.out.println("Insert Order_details Values (" + orderdetails_array.getNum() + "," + order_Array.getNum() + "," + menu_array.getNum() + "," + orderdetails_array.getNum1() + ");");
        }
    }

    public void setBranch(){
        for (int i = 0; i < branch_limit; i++) {
            array branch_array = (array) branch.get(i);
            System.out.println("Insert Branch Values (" + branch_array.getNum() + ",\"" + branch_array.getValue() + "\"," + branch_array.getNum1() + ");");
        }
    }

    public void setSalary(){
        for (int i = 0; i < limit; i++) {
            array salary_array = (array) salary.get(i);
            array staff_array = (array) staff.get(i);
            String month = Months[rand.nextInt(Months.length)];
            System.out.println("Insert Salary Values (" + salary_array.getNum() + ",\"" + month + "\"," + staff_array.getNum() + ",\"" + salary_array.getValue() + "\"," + salary_array.getNum1() + ".00);");
        }
    }

    public void setInvetory(){
        for (int i = 0; i < limit; i++) {
            array staff_array = (array) staff.get(rand.nextInt(staff.size()));
            array Inventory_array = (array) inventory.get(i);
            String stocks = Inventory_array.getNum1() + " kilogram";
            System.out.println("Insert Inventory Values (" + Inventory_array.getNum() + ",\"" + Inventory_array.getValue() + "\",\"" + stocks + "\"," + staff_array.getNum() + ");");
        }
    }
}


class array{
    private String value;
    private int num,num1;
    private float price;

    public array(){
        value = null;
        num = 0;
    }

    public array(int num,int num1){
        this.num = num;
        this.num1 = num1;
    }

    public array(String value,int num){
        this.value = value;
        this.num = num;
    }

    public array(String value,int num,float price){
        this.value = value;
        this.num = num;
        this.price = price;
    }

    public array(String value,int num,int num1){
        this.value = value;
        this.num = num;
        this.num1 = num1;
    }

    public void setNum1(int num1) {this.num1 = num1;}
    public void setPrice(float price) {this.price = price;}
    public void setNum(int num) {this.num = num;}
    public void setValue(String value){ this.value = value;}

    public int getNum1() {return num1;}
    public double getPrice() {return price;}
    public int getNum() {return num;}
    public String getValue() {return value;}
}
