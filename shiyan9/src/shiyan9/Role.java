package shiyan9;

public abstract class Role {
	protected RoleContext context;
	protected String stateName; 
	
	public String getStateName() {
		return stateName;
	}
	public abstract void attack();
	public abstract void cure();
	public abstract void clear();
	public abstract void checkLevel();
	public abstract void revise();

}
