import java.util.ArrayList;

public class Level {

	private int level;
	private ArrayList<Name> namesInLevel = new ArrayList<Name>();

	public Level(int level) {
		this.level = level;
	}

	public void addName(Name newName) {
		if (newName.getLevel() == level) {
			namesInLevel.add(newName);
		}
	}
	
	public ArrayList<Name> getName() {
		return namesInLevel;
	}
}
