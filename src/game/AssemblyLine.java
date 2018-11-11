package game;

import java.awt.Graphics2D;

import com.zalinius.architecture.GameObject;

public abstract class AssemblyLine implements GameObject {

	private Input input;
	
	public AssemblyLine(Input input) {
		this.input = input;
	}
	
	public void inputItem(Item item) {
		input.addToQueue(item);
	}
	
	public void update(double delta) {
		input.update(delta);
	}
	
	@Override
	public void render(Graphics2D g) {
		input.render(g);
	}

}
