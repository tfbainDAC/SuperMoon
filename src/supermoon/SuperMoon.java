/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermoon;

import java.util.Scanner;

/**
 *
 * @author t.bain
 */
public class SuperMoon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  This code is used to set up one card, normally we would use a list
	//  This sets up a birthday card and uses constructor to populate data
	//----------------  example using birthday constructor
        Scanner scan = new Scanner(System.in);
        Scanner scanL = new Scanner(System.in);

        String strName; 
        int intAge;

        System.out.println("What is the name of the recipient of this card>> ");
        strName = scanL.nextLine();
        System.out.println("How old is the recipient >> ");
        intAge = scan.nextInt();

        Birthday bCard = new Birthday(strName, intAge);

        //  later on we might want to retrieve the name of the person on the card
        // to display on the GUI screen  to do that we need a get method in Cards

        strName = bCard.getName();
        intAge = bCard.getAge();
        System.out.println("Printing card now for " + strName + " who is " + intAge + "old ...");
        bCard.printCard();
        bCard.printEnvelope();
        System.out.println(bCard.toString() + " ..... using override toString() method");
    }
    
}
