package day7;

public class House {

	String color;
	String address;
	Integer numberOfPersons;
	
	public House(String clr, String adr, Integer numberOfP) {
		color = clr;
		address = adr;
		numberOfPersons = numberOfP;
	}
	
	public void repaintHouse(String newColor) {
		color = newColor;
	}
	
}
