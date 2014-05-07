package entity;

public abstract class NonPlayerConrolledEntity extends AbstractEntity implements IAi {

	public NonPlayerConrolledEntity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAggressive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canDamage() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
