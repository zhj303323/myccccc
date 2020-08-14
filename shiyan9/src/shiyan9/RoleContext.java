package shiyan9;

public class RoleContext {
	private int level;
	private Role role;
	private String name;
	public RoleContext(String name) {
		this.name = name;
		this.role = new Magician(this);
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
		role.checkLevel();
	}
	public Role getState() {
		return role;
	}
	public void setState(Role role) {
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void attack() {
		role.attack();
	}
	
	public void cure() {
		role.cure();
	}
	
	public void clear() {
		role.clear();
	}
	
	public void revise() {



		role.revise();
	}

}
