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
       int customerAge;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Infinitea_class_obj objCustomer1 = new Infinitea_class_obj();
        objCustomer1.customerID=100;
        objCustomer1.customerAge=21;
        objCustomer1.customerID=103;
        objCustomer1.customerName="SAMSON";
        
        System.out.println("Customer Identification Number:");
    }
    
}
