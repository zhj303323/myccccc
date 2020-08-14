package shiyan9;

public class Angel extends Role{
	public Angel(Role role) {
		this.context = role.context;
		this.stateName="天使";
	}

	@Override
	public void attack() {
		System.out.println(stateName + " : " + context.getName() + ",发动流星火雨。");
	}

	@Override
	public void cure() {
		System.out.println(stateName + " : " + context.getName() + ",发动治愈术。");
	}

	@Override
	public void clear() {
		System.out.println(stateName + " : " + context.getName() + ",发动净化术。");
	}
	
	@Override
	public void checkLevel() {
		int level = context.getLevel();
		if(level >=60) {
			context.setState(new Angel(this));
		}
	}

	@Override
	public void revise() {
		context.setState(new Magician(this));
	}

}
