package shiyan9;

public class Client
{
		public static void main(String args[])
		{
			RoleContext r=new RoleContext("莎士比亚");
            r.attack();
			System.out.println("打怪做任务ing……");
			r.setLevel(30);//触发状态改变的方法
			r.attack();
			r.cure();
			System.out.println("继续打怪做任务ing……");
			r.setLevel(60);
			r.attack();
			r.cure();
			r.clear();
			System.out.println("天使逆转为精灵……");//可选完成
			r.revise();//逆转方法根据当前职业级别降一级，等级不变
			r.attack();
			r.cure();
		}

	
}