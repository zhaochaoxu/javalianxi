
public class GeShui {
	public static void main(String[] arge){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//���������Ĺ���
		System.out.println("���������Ĺ���:");
		int num = sc.nextInt();
		//�жϹ��ʵ�����
		num = num - 3500;
		int result = 0;
		if(num<1500){
			result = 0;
		}else if(num<4500){
			result = (int)(num*0.1 - 105);
		}else if(num<9000){
			result = (int)(num*0.2 -555);
		}else if(num<35000){
			result = (int)(num*0.25 - 1005);
		}else if(num<55000){
			result = (int)(num*0.3 - 2755);
		}else if(num<80000){
			result = (int)(num*0.35 - 5505);
		}else if(num>80000){
			result = (int)(num*0.45 -13505);
		}
		System.out.println(result);	
	}

}
