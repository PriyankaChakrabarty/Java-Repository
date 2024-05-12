package oopsConcept2;

public class HDFCBank implements USBank {

	@Override
	public void payment() {
		System.out.println("Payment method");

	}

	@Override
	public void debit() {
		System.out.println("debit method");

	}

	@Override
	public void credit() {
		System.out.println("credit method");

	}

	public void gold_loan() {
		System.out.println("gold loan method");
	}

}
