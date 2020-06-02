
public enum Priority {
	LOW(1, "НИЗКИЙ"),
	MEDIUM(2, "СРЕДНИЙ"),
	HIGH(3, "ВЫСОКИЙ");
	
	private int num;
	private String name;
	
	private Priority(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public int getNum() {
		return num;
	}

}
