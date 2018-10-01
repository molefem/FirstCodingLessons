package September28thAss2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a186520
 */
public interface IEmployee {

    static final int MANAGER = 10;

    /**
     *
     */
    static final int DEVELOPER = 20;
    static final int EXEC = 30;

    public void displayEmployee();

    public void activateEmployee();

    public void deactivateEmployee();

}
