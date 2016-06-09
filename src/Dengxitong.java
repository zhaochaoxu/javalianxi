
public class Dengxitong {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] name = new String[1];
		String[] psw = new String[name.length];
		
		while(true){
			System.out.println("====欢迎登录管理系统====");
			System.out.println("      1.注册                        ");
			System.out.println("      2.登录                        ");
			System.out.println("      3.退出                        ");
			System.out.println("===================");
			System.out.println("请输入您的选项");
			int num = sc.nextInt();
			
			if(num==1){
				System.out.println("请输入您的用户名");
				String user =sc.next();
				System.out.println("请输入密码");
				String userpsw = sc.next();
				for(int i = 0; i<name.length;i++){
					
					if(name[i]!=null&&user.equals(name[i])){
						System.out.println("用户名已占用！请重新输入！");
						break;
					}
					
					if(name[i]==null){
						name[i]=user;
						psw[i]=userpsw;
						System.out.println("恭喜注册成功");
						break;
					}
				}
				
			}else if(num==2){
				System.out.println("请输入您的用户名");
				String lodname = sc.next();
				System.out.println("请输入您的用密码");
				String lodpsw= sc.next();
				for(int i = 0; i<name.length;i++){
					if(name[i]==null){
						System.out.println("用户名或密码错误");
						break;
					}
					if(name[i].equals(lodname)&&psw[i].equals(lodpsw)){
						System.out.println("【登陆成功】");
						break;
					}
				}
				
			}else if(num==3){
				System.out.println("退出成功！");
				break;
			}else {
				System.out.println("输入错误请重新输入！");
			}
			
		}
		System.out.println("程序运行结束，正常关闭！");

	}

}
