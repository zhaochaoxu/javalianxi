
public class DengLu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true){
		//������¼ϵͳ
			System.out.println("    ��ӭ��¼����ϵͳ       ");
			System.out.println("=================");
			System.out.println("     1.ע��                      ");
			System.out.println("     2.��¼                      ");
			System.out.println("     3.�˳�                      ");
			//��ѡ��ѡ��
			System.out.println("��ѡ����");
			int num = sc.nextInt();

			if(num==1){
				System.out.println("ע��");
			}else if(num==2){
				System.out.println("���������ĵ�¼����");
				String name = sc.next();
				System.out.println("�������������룺");
				String psw  = sc.next();
				if("�Գ���".equals(name) && "zxc123".equals(psw)){
				System.out.println("��½�ɹ�");
				break;
				}else{
				System.out.println("�û������������");
				}
			}else if(num==3){
			System.out.println("�˳�");
			break;
			}else{
				System.out.println("�������");
			}
				
		}
		System.out.println("�������н���");
	}

}
