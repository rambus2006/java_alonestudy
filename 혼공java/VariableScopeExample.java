/*public class VariableScopeExample{
	public static void main(String args[]){

		//�����غ��� ���ڵ�
		//������ ������
		int v1=15;
		if(v1>10){
			int v2;
			v2=v1-10;
		}
		int v3=v1+v2+5;	//v2������ ����� �� ���� ������ ������ ���� �߻�
				//������ �ؼ��� �� ����.
	}
}*/
public class VariableScopeExample{
	public static void main(String args[]){

		//�����غ��� ���ڵ�
		//������ ������
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
