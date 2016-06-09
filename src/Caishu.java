
public class Caishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		
		System.out.println("请输入您想的数字：");
		int count =0;
		while(true){
			count++;
			System.out.println("请输入数字");
			int s = sc.nextInt();
			if(num==s){
				System.out.println("恭喜您猜对了！");
				break;
			}else if(num<s){
				System.out.println("您猜大了！请重猜！");
			}else if(num>s){
				System.out.println("您猜小了！请重猜！");
			}
		}

	}

}
