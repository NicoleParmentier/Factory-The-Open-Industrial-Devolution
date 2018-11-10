package game;

import java.awt.Graphics2D;
import java.util.ArrayList;

import com.zalinius.architecture.IGameObject;

public abstract class Node implements IGameObject {
	
	protected Item currentItem;
	protected ArrayList<Edge> outgoingEdges;
	
	public Node()	
	{
		this.outgoingEdges = new ArrayList<>();
	}
	
	public boolean inputItem(Item item)
	{
		if (!isFull())
		{
			currentItem = item;
			return true;
		}
		else
		{
			outputItem(item);
			return false;
		}
	}
	
	protected void outputItem(Item item)
	{
		Edge correctEdge = selectOutgoingEdge();
		correctEdge.inputItem(item);
		currentItem = null;	
	}
	
	public boolean isFull() {
		return currentItem != null;
	}
	
	protected abstract Edge selectOutgoingEdge();
	
	public void addOutgoingEdge(Edge newEdge)
	{
		outgoingEdges.add(newEdge);
	}
	
	@Override
	public void update(double delta) {

	}

	@Override
	public void render(Graphics2D g) {	
		
	}
}