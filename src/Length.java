/**
 @author Roiboon Chaiyachit
**/
public enum Length {
	
	METER("Meter", 1.00),
	MILES("Miles", 1609.344),
	CENTIMETER("Centimeter", 0.01),
	FOOT("Foot", 0.30480),
	KILOMETER("Kilometer", 1000.0),
	WA("Wa", 2.0),
	LIGHT_YEAR("Light-year", 9460730472580800.0),
	MICRON("Micron",1.0E-6);
	
	private String name;
	private double value;
	
	/**Initial value of Lenght
	 * @param name of unit
	 * @param value(in meter) of unit
	 * */
	private Length(String name, double value) {
		this.name = name;
		this.value = value;
	}

	/**get the unit's name
	*@return name of unit
	*/
	public String getName() {
		return this.name;
	}

	/**get the unit's value
	*@return value of unit in meter
	*/
	public double getValue() {
		return this.value;
	}
	
	/**
	* @see java.lang.Object#toString()
	*/
	public String toString() {
		return this.name;
	}

}
