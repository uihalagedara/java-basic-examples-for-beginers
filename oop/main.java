package oop;

public class main {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle("Nissan", "white", "gtr", "nissan");
		System.out.println(vehicle2.getName());
		vehicle1.setName("Vitz");
		System.out.println(vehicle1.getName());

	}

}
