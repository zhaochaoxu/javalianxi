
public class Dengxitong {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] name = new String[1];
		String[] psw = new String[name.length];
		
		while(true){
			System.out.println("====��ӭ��¼����ϵͳ====");
			System.out.println("      1.ע��                        ");
			System.out.println("      2.��¼                        ");
			System.out.println("      3.�˳�                        ");
			System.out.println("===================");
			System.out.println("����������ѡ��");
			int num = sc.nextInt();
			
			if(num==1){
				System.out.println("�����������û���");
				String user =sc.next();
				System.out.println("����������");
				String userpsw = sc.next();
				for(int i = 0; i<name.length;i++){
					
					if(name[i]!=null&&user.equals(name[i])){
						System.out.println("�û�����ռ�ã����������룡");
						break;
					}
					
					if(name[i]==null){
						name[i]=user;
						psw[i]=userpsw;
						System.out.println("��ϲע��ɹ�");
						break;
					}
				}
				
			}else if(num==2){
				System.out.println("�����������û���");
				String lodname = sc.next();
				System.out.println("����������������");
				String lodpsw= sc.next();
				for(int i = 0; i<name.length;i++){
					if(name[i]==null){
						System.out.println("�û������������");
						break;
					}
					if(name[i].equals(lodname)&&psw[i].equals(lodpsw)){
						System.out.println("����½�ɹ���");
						break;
					}
				}
				
			}else if(num==3){
				System.out.println("�˳��ɹ���");
				break;
			}else {
				System.out.println("����������������룡");
			}
			
		}
		System.out.println("�������н����������رգ�");

	}

}
