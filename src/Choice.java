/**
 * @author Roiboon chaiyachit
 */

public enum Choice{
	
	LEFT("left"),
	RIGHT("right");
	
	private String side;
	
	/**
	 * initial Choice's value
	 * @param side(left or right)
	 * */
	private Choice(String side) {
		this.side = side;
	}
	
	/**get the side
	*@return side of choice
	*/
	public String getSide() {
		return this.side;
	}
	
}
