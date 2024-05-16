/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm.pkginterface;

/**
 *
 * @author Eslam
 */
public class ATMINTERFACE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bankaccount userAccount = new bankaccount(); // Initial balance $1000
        ATM atm = new ATM(userAccount);
        atm.start();
    }
    
}
