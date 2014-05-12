package entity;

import java.awt.Point;

public abstract class AbstractEntity implements IEntity {

	Point entityLocation;
	
	
	public AbstractEntity() {
		// TODO Get resolution and place actor center-left on canvas
		this.entityLocation = new Point();
		
	}
	
	public AbstractEntity(int x, int y)
	{
		this.entityLocation = new Point(x,y);
		
	}
	
	abstract void movement();

	

}
