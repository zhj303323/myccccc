package shiyan9;

public class Fairy extends Role{
	public Fairy(Role role) {
		this.context = role.context;
		this.stateName="精灵";
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
		System.out.println(stateName + "无法使用净化术技能。");
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
