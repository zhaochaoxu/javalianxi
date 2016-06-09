import javax.swing.plaf.synth.SynthSeparatorUI;

public class Hello {
	public static void main(String[] args){
		
		/*System.out.println("======欢迎登陆======");
		System.out.println("    1:注册");
		System.out.println("    2:登录");
		System.out.println("    3:退出 ");
		System.out.println("==================");*/
		
		/*String name ="赵朝旭";
		char sex = '男';
		int age = 26;
		int score = 99;
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
		System.out.println(score);*/
		
		/*int num = 8457;
		int a = 8457%10;
		int b = 8457/10%10;
		int c = 8457/100%10;
		int d = 8457/1000;
		System.out.println("您输入的数字是：" + num );
		System.out.println("   个位数字是：" + a   );
		System.out.println("   十位数字是：" + b   );
		System.out.println("   百位数字是：" + c   );
		System.out.println("   千位数字是：" + d   );*/
		
		/*double a = 22;
		float  b = 32;
		  int  c = (int) (a + b);
		short  d = (short)b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		/*int a =10;
		int b =20;
		boolean c= (a>b);
		boolean d = 10 > 2 ;
		System.out.println(c);
		System.out.println(d);*/
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("请输入您的数字：");
		int i = sc.nextInt();
		System.out.println("请输入您的名字：");
		String name = sc.next();
		
		System.out.println(name);
		System.out.println(i);*/
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("请输入您的数字");
		int i = sc.nextInt();
		if( i % 2 == 0){
			System.out.println("您输入的数字是偶数 :" + true);
		}else{
			System.out.println("您输入的数字是奇数 :" + false);
		}*/
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a = 3;
		int b = 6;
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);*/
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		//输入圆的半径
		System.out.println("请输入圆的半径：");
		double i =sc.nextDouble();
		//求圆的面积
		double sum =  (3.14*i*i);
		//输出圆的面积
		System.out.println("圆的面积为：" + sum);*/
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("请输入您的数字");
		int i = sc.nextInt();
		boolean b = i%2==0;
		String m = b ? "您输入的数字是偶数" : "您输入的数字是奇数";
		System.out.println(m);*/	
		
		
		/*String str = "sdf";
		String str1= "123";
		
		boolean b = (str.equals(str1));
		if(b){
			System.out.println(true);
	
		}else{
			System.out.println(false);
		}*/
		
		/*//请输入用户名
		System.out.println("请输入您的名字");
		String name =sc.next();
		//请输入密码
		System.out.println("请输入您的密码");
		String psw = sc.next();
		boolean b = (name.equals("牛丽娟")&&(psw.equals("zxc123")) || name.equals("赵朝旭")&&(psw.equals("zxc123"))||name.equals("陈丽婷")&&(psw.equals("zxc123")));
		if(b){
			System.out.println("登陆成功");
		}else{
			System.out.println("用户名或密码错误");
		}*/
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 请输入您的金额
		System.out.println("请输入您的金额：");
		double sum = sc.nextDouble();
		 if(sum > 100){
			 sum = sum - 100 ;		 
		 }
		 System.out.println(sum);
	}

}
