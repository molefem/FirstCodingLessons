/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.sept26;

import java.time.LocalDate;

/**
 *
 * @author a186520
 */
public abstract class Invoice implements IInvoice{
    private String title;
    private int amount;
    private LocalDate date; 
    private int invoice_id;
    
    public Invoice(String title, int amount, int invoice_id){
	this.title = title; 
	this.amount = amount; 
	this.invoice_id = invoice_id;
	this.date = LocalDate.now();
    }
    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public int getAmount() {
	return amount;
    }

    public String toString(){
	return title + "," + invoice_id + "," + amount + "," + date.toString();
    }
    public void setAmount(int amount) throws Exception{
	if ( amount < 1  || amount > 100000) {
	    throw new Exception("Amount out of range");
	}
	this.amount = amount;
    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public int getInvoice_id() {
	return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
	this.invoice_id = invoice_id;
    }
    
    
    public void display(){
	System.out.println(invoice_id + "," + title + ", " + date + "," + amount);
    }
    
    public boolean equals (Invoice inv){
	if (this.amount == inv.getAmount()){
	    return true;
	}
	
	return false; 
    }    
}
