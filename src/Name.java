public class Name {
	
	private String name;
	private int level;
	
	public Name(int level, String name) {
		this.name = name;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int newLevel) {
		level = newLevel;
	}
}
