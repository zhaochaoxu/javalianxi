import javax.swing.plaf.synth.SynthSeparatorUI;

public class Hello {
	public static void main(String[] args){
		
		/*System.out.println("======��ӭ��½======");
		System.out.println("    1:ע��");
		System.out.println("    2:��¼");
		System.out.println("    3:�˳� ");
		System.out.println("==================");*/
		
		/*String name ="�Գ���";
		char sex = '��';
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
		System.out.println("������������ǣ�" + num );
		System.out.println("   ��λ�����ǣ�" + a   );
		System.out.println("   ʮλ�����ǣ�" + b   );
		System.out.println("   ��λ�����ǣ�" + c   );
		System.out.println("   ǧλ�����ǣ�" + d   );*/
		
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
		System.out.println("�������������֣�");
		int i = sc.nextInt();
		System.out.println("�������������֣�");
		String name = sc.next();
		
		System.out.println(name);
		System.out.println(i);*/
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("��������������");
		int i = sc.nextInt();
		if( i % 2 == 0){
			System.out.println("�������������ż�� :" + true);
		}else{
			System.out.println("����������������� :" + false);
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
		//����Բ�İ뾶
		System.out.println("������Բ�İ뾶��");
		double i =sc.nextDouble();
		//��Բ�����
		double sum =  (3.14*i*i);
		//���Բ�����
		System.out.println("Բ�����Ϊ��" + sum);*/
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("��������������");
		int i = sc.nextInt();
		boolean b = i%2==0;
		String m = b ? "�������������ż��" : "�����������������";
		System.out.println(m);*/	
		
		
		/*String str = "sdf";
		String str1= "123";
		
		boolean b = (str.equals(str1));
		if(b){
			System.out.println(true);
	
		}else{
			System.out.println(false);
		}*/
		
		/*//�������û���
		System.out.println("��������������");
		String name =sc.next();
		//����������
		System.out.println("��������������");
		String psw = sc.next();
		boolean b = (name.equals("ţ����")&&(psw.equals("zxc123")) || name.equals("�Գ���")&&(psw.equals("zxc123"))||name.equals("������")&&(psw.equals("zxc123")));
		if(b){
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("�û������������");
		}*/
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// ���������Ľ��
		System.out.println("���������Ľ�");
		double sum = sc.nextDouble();
		 if(sum > 100){
			 sum = sum - 100 ;		 
		 }
		 System.out.println(sum);
	}

}
