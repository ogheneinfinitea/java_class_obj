/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinitea_class_obj;

/**
 *
 * @author Rejoice Ihuoma
 */
public class Infinitea_class_obj {

   
        //declarig instance of a variable
       int customerID;
       String customerName;
       String customerAddress;
       int customerBVN;
       int customerAge;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Infinitea_class_obj objCustomer1 = new Infinitea_class_obj();
        objCustomer1.customerBVN=100;
        objCustomer1.customerAge=21;
        objCustomer1.customerID=103;
        objCustomer1.customerName="SAMSON";
        objCustomer1.customerAddress="Aptech Asaba";
        
        System.out.println("Customer Identification Number: " + objCustomer1.customerBVN);
         System.out.println("Customer Age: " + objCustomer1.customerAge );
          System.out.println("Customer Name:" + objCustomer1.customerName);
           System.out.println("Customer ID :" + objCustomer1.customerID);
            System.out.println("Customer Address :" + objCustomer1.customerAddress);
    }
    
}
