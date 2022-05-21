public class VariableExchangeExample{
	public static void main(String args[]){
		
		//직접해보는 손코딩
		//변수값교환
		int x=3;
		int y=5;
		System.out.println("x:"+x+",y:"+y);

		int temp = x;
		x=y;
		y=temp;
		System.out.println("x:"+x+"y:"+y);
	}
}