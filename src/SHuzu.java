
public class SHuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] score = new int[5];
		//������ɼ�
		System.out.println("������ɼ�");
		for(int i = 0; i <score.length; i++){
			score[i] = sc.nextInt();
		}
		System.out.println("������ĳɼ�Ϊ��");*/
		
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
		//������������˵ĳɼ�
		System.out.println("������������˵ĳɼ���");
		for (int i=0; i<score.length; i++){
			score[i]=sc.nextInt();	
			System.out.println("��" + (i+1) + "���˵ĳɼ�" + score[i]);
		}
		//System.out.println("��" + (i+1) + "���˵ĳɼ�" + score[i]);*/
		
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] str = new String[4];
		str[0] = "�Գ���";
		str[1] = "ţ����";
		str[2] = "������";
		//�������ַ���
		System.out.println("����������");
		String n = sc.next();
		boolean flag=false;
		for(int i=0; i<str.length; i++){
			//���������ж��Ƿ�Ϊnull
			if(str[i]==null){
				//����Ϊnull ���и�ֵ
				str[i]=n;
				flag=true;
				break;
			}
		}
		
		if(flag){
			System.out.println("����ɹ�");
		}else{
			System.out.println("ͨѶ¼����");
		}
		
		System.out.println("===========");
		for(String temp : str){
			if(temp==null){
				break;
			}
			System.out.println(temp);
			}
		
		
		
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		//������༶����
		System.out.println("������༶����:");
		int ren = sc.nextInt();
		//��������
		int[] ary = new int[ren];
		int sum = 0;
		//double
		for(int i=0; i<ren; i++){
			//���������ɼ�
			System.out.println("������ɼ�:");
			int score = sc.nextInt();
			ary[i] = score;
		}	
		for(int temp : ary){
			//���ܳɼ�
			sum = sum + temp;
		}
		//��ƽ���ɼ�
		double vge = sum/ren;
		System.out.println(vge);*/
	}

}
