
public class DengLu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true){
		//制作登录系统
			System.out.println("    欢迎登录管理系统       ");
			System.out.println("=================");
			System.out.println("     1.注册                      ");
			System.out.println("     2.登录                      ");
			System.out.println("     3.退出                      ");
			//请选择选项
			System.out.println("请选择编号");
			int num = sc.nextInt();

			if(num==1){
				System.out.println("注册");
			}else if(num==2){
				System.out.println("请输入您的登录名：");
				String name = sc.next();
				System.out.println("请输入您的密码：");
				String psw  = sc.next();
				if("赵朝旭".equals(name) && "zxc123".equals(psw)){
				System.out.println("登陆成功");
				break;
				}else{
				System.out.println("用户名或密码错误");
				}
			}else if(num==3){
			System.out.println("退出");
			break;
			}else{
				System.out.println("输入错误");
			}
				
		}
		System.out.println("程序运行结束");
	}

}
