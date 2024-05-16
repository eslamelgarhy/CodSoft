/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.pkginterface;

import java.util.Scanner;

/**
 *
 * @author Eslam
 */
public class ATM{
     private  bankaccount account;

    public ATM(bankaccount account) {
        this.account = account;
    }
    Scanner scanner = new Scanner(System.in);
    public void start() {
         
             int choice;
             do {
                 System.out.println("\nATM Menu:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit\nEnter your choice: ");
                 choice = scanner.nextInt();
                 switch (choice) {
                     case 1:
                         checkBalance();
                         break;
                     case 2:
                         deposit();
                         break;
                     case 3:
                         withdraw();
                         break;
                     case 4:
                         System.out.println("Exiting...");
                         break;
                     default:
                         System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                 }
             } while (choice != 4);
         
    }

    private void checkBalance() {
        System.out.println("Your balance is: " + account.getBalance());
    }

    private void deposit() {
        
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}
