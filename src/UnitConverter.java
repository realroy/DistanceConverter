/*@author roiboon chaiyachit
 * */
public class UnitConverter {
	/* @param amount 	a magnitude of length
	 * @param fromUnit 	original unit
	 * @param toUnit 	another unit				  
	 * @return 			Covert the length unit to another unit*/
	public double convert(double amount, Length fromUnit, Length toUnit) {
		return (amount * fromUnit.getValue()) / toUnit.getValue();
	}
	
	/*@return			unit value in meter
	 * */
	public Length[] getLength() {
		return Length.values();
	}
	
	/*Test App
	 * public static void main(String[] args) {
		UnitConverter uc = new UnitConverter();
		System.out.println(uc.convert( 3.0, Length.MILES, Length.METER));
	}*/
}
