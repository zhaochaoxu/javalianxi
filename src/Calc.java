
public class Calc {
	
	public int sum(int a, int b){
		int m = a - b;
		return m;
	}
	
	// ***�����ֵ
	public int Max(int[] nums){
		if(nums.length > 0){
			int max = nums[0];
			for(int temp : nums){
				if(max<temp){
					max=temp;
				}
			}
			return max;
		}else{
			System.out.println("���鳤��Ϊ��");
			return -1;
		}
	}
	
	//***����Сֵ
	/*public int min(int[] num){
		if(num.length>0){
			int min = num[0];
			for(int temp:num){
				if(min>temp){
					min=temp;
				}
			}
			return min;
		}else{
			System.out.println("���鳤��Ϊ�㣺");
			return -1;
		}
	}*/
		
	//���ܺ�
	public int sum(int[]num){
		if(num.length>0){
			int he = 0;
			for(int temp: num){
				he = he +temp;
				}
			return he;
		}else{
			System.out.println("���鳤��Ϊ��");
			return -1;
		}
	}	
  }
