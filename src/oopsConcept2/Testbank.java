package oopsConcept2;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank hs = new HDFCBank();
		hs.credit();
		hs.debit();
	    hs.gold_loan();
	    
	    USBank us = new HDFCBank();
	    us.credit();
	    us.debit();
	    System.out.println(USBank.minimum_balance);
	    System.out.println(USBank.maximum_balance);
	    
}
	

	}

