/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.sept26;

/**
 *
 * @author a186520
 */
public class InsuranceInvoice extends Invoice {

    private String companyName;

    public InsuranceInvoice(int invoice_id, String title, int amount, String name) {
        super(title, amount, invoice_id);
        this.companyName = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void process() {

    }

    public void display() {
        System.out.println(companyName);
        super.display();
    }

    public String toString() {
        String details = super.toString();
        return companyName + "," + details;
    }
}
