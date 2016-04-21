
public enum Length {
	
	METER("meter",1.00),
	MILES("mile",1609.344),
	CENTIMETER("centimeter",0.01),
	FOOT("foot",0.30480),
	KILOMETER("kilometer",1000.0),
	WA("wa",2.0);
	
	private String name;
	private double value;
	
	private Length(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public double getValue() {
		return this.value;
	}
	
	public String toString() {
		return this.name;
	}

}
