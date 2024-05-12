package oopsConcept2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Honda h1 = new Honda();
      h1.start();
      h1.stop();
      h1.threadsafety();
      h1.refuel();
      h1.engine();
      
      System.out.println("*********");
      
      Car c = new Car();
      c.start();
      c.stop();
      c.refuel();
      
      Car c1= new Honda(); //top casting
      c1.refuel();
	}

}
