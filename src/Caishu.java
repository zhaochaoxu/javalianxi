
public class Caishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		
		System.out.println("��������������֣�");
		int count =0;
		while(true){
			count++;
			System.out.println("����������");
			int s = sc.nextInt();
			if(num==s){
				System.out.println("��ϲ���¶��ˣ�");
				break;
			}else if(num<s){
				System.out.println("���´��ˣ����ز£�");
			}else if(num>s){
				System.out.println("����С�ˣ����ز£�");
			}
		}

	}

}
