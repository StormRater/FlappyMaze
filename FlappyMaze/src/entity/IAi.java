package entity;

public interface IAi {
	
	/**
	 * 
	 * @return true if object chases and/or attacks other objects
	 */
	boolean isAggressive();
	
	/**
	 * This method defines whether an object remains at one point or moves
	 * @return true if object moves
	 */
	boolean isStatic();
	
	

}
