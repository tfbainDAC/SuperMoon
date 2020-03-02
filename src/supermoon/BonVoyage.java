/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermoon;

/**
 *
 * @author t.bain
 */
public class BonVoyage extends Card {
    private String _travelTo;
    
    public BonVoyage()   // constructor to initialise fields
    {
	    super("Bon Voyage");	
            _travelTo = "";
    }
    @Override
	public void printCard()  // this must be coded as printCard in Card is abstract
	{
		// code to print out card would go here
		System.out.println("Here is your lovely moonpig travel card");
		System.out.println("This card is to " + getName() 
                        + ".  Who is travelling to  " + _travelTo );
	}
    
    
}
