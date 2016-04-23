public enum Choice{
	LEFT("left"), RIGHT("right");
	
	private String side;
	
	private Choice(String side) {
		this.side = side;
	}
	
	public String getSide() {
		return this.side;
	}
	
}
