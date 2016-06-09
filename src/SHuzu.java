
public class SHuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] score = new int[5];
		//请输入成绩
		System.out.println("请输入成绩");
		for(int i = 0; i <score.length; i++){
			score[i] = sc.nextInt();
		}
		System.out.println("您输入的成绩为：");*/
		
		/*int[] num = {12,65,52,};
		
		for (int i=0; i<num.length; i++){
			num[i]++;
			System.out.println(num[i]);
		}
		System.out.println("====================");*/
		/*int[] num = {12,65,52,66,44,88};
		int max =num[0];
		for(int sum : num){
			if(max<sum){
				max=sum;
			}
		}
		System.out.println(max);*/
		
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] score =new int[5];
		//依次输入五个人的成绩
		System.out.println("依次输入五个人的成绩：");
		for (int i=0; i<score.length; i++){
			score[i]=sc.nextInt();	
			System.out.println("第" + (i+1) + "个人的成绩" + score[i]);
		}
		//System.out.println("第" + (i+1) + "个人的成绩" + score[i]);*/
		
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] str = new String[4];
		str[0] = "赵朝旭";
		str[1] = "牛丽娟";
		str[2] = "陈丽婷";
		//请输入字符串
		System.out.println("请输入名字");
		String n = sc.next();
		boolean flag=false;
		for(int i=0; i<str.length; i++){
			//进行数组判断是否为null
			if(str[i]==null){
				//若是为null 进行赋值
				str[i]=n;
				flag=true;
				break;
			}
		}
		
		if(flag){
			System.out.println("插入成功");
		}else{
			System.out.println("通讯录已满");
		}
		
		System.out.println("===========");
		for(String temp : str){
			if(temp==null){
				break;
			}
			System.out.println(temp);
			}
		
		
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		//请输入班级人数
		System.out.println("请输入班级人数:");
		int ren = sc.nextInt();
		//定义数组
		int[] ary = new int[ren];
		int sum = 0;
		//double
		for(int i=0; i<ren; i++){
			//输入人数成绩
			System.out.println("请输入成绩:");
			int score = sc.nextInt();
			ary[i] = score;
		}	
		for(int temp : ary){
			//求总成绩
			sum = sum + temp;
		}
		//求平均成绩
		double vge = sum/ren;
		System.out.println(vge);*/
	}

}
