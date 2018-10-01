package assignment.sept26;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a186520
 */
public class InvoiceHandler {
public static void main(String[] args)  {
	InsuranceInvoice a;
	InsuranceInvoice b;
	InsuranceInvoice c;
	a = new InsuranceInvoice(98197, "Invoice A", 100, "Liberty"); 
	b = new InsuranceInvoice(777678, "Invoice B", 1000, "SBSA");
	c = new InsuranceInvoice(66543, "Invoice C", 1000, "FNB");
	
	if(b.equals(a)){
	    System.out.println("invoice a is equal to b");
	}
	else{
	    System.out.println("invoice a is not equal to b");
	}
	
	if(c.equals(b)){
	    System.out.println("invoice b is equal to c");
	}
	else{
	    System.out.println("invoice b is not equal to c");
	}
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	a.display();
	b.display();
	c.display();
	
	try {
	    a.setAmount(-100);
	} catch (Exception ex) {
	    System.out.println(ex.getMessage());
	}
	finally{
	    System.out.println("after set amount for a");
	}
	
	try {
	    b.setAmount(100);
	} catch (Exception ex) {
	    System.out.println(ex.getMessage());
	}
	finally{
	    System.out.println("after set amount for b");
	}
	
	try {
	    c.setAmount(10000001);
	} catch (Exception ex) {
	    ex.printStackTrace();
	    System.out.println(ex.getMessage());
	}
	
	System.out.println("Done!");
    }    
}
