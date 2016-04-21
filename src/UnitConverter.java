public class UnitConverter {
	public double convert(double amount, Length fromUnit, Length toUnit) {
		return (amount * fromUnit.getValue()) / toUnit.getValue();
	}
	
	public Length[] getLength() {
		return Length.values();
	}
	
	/*Test App
	 * public static void main(String[] args) {
		UnitConverter uc = new UnitConverter();
		System.out.println(uc.convert( 3.0, Length.MILES, Length.METER));
	}*/
}
