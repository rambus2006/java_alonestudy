/*public class VariableScopeExample{
	public static void main(String args[]){

		//직접해보는 손코딩
		//변수의 사용범위
		int v1=15;
		if(v1>10){
			int v2;
			v2=v1-10;
		}
		int v3=v1+v2+5;	//v2변수를 사용할 수 없기 때문에 컴파일 에러 발생
				//변수를 해석할 수 없다.
	}
}*/
public class VariableScopeExample{
	public static void main(String args[]){

		//직접해보는 손코딩
		//변수의 사용범위
		int v1=15;
		int v2=0;
		int v3=0;

		if(v1>10){
			
			v2=v1-10;
		}
		 v3=v1+v2+5;
		System.out.println(v3);	
	}
}
