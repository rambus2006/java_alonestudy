public class VariableExchangeExample{
	public static void main(String args[]){
		
		//�����غ��� ���ڵ�
		//��������ȯ
		int x=3;
		int y=5;
		System.out.println("x:"+x+",y:"+y);

		int temp = x;
		x=y;
		y=temp;
		System.out.println("x:"+x+"y:"+y);
	}
}