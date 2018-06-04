package day7;

public class House {

	private String color = "";
	private String address;
	private Integer numberOfPersons;

	public House() {
		destroyHouse();
	}

	public House(String color, String address, Integer numberOfP) {
		setColor(color);
		this.address = address;
		this.numberOfPersons = numberOfP;
	}

	public void repaintHouse(String color) {
		setColor(color);
	}

	void repaintHouseBlack() {
		setColor("Black");
	}

	private void setColor(String color) {
		this.color = color.toLowerCase();
	}

	private boolean destroyHouse() {
		return false;
	}

	public String getColor() {
		return this.color.toUpperCase();
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setAddress(String newAddress) {
		if (newAddress.length() < 3) {
		} else {
			address = newAddress;
		}
	}

	@Override
	public String toString() {
		return "House [color=" + color + ", address=" + address + ", numberOfPersons=" + numberOfPersons + "]";
	}

}
