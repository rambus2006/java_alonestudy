import java.util.Scanner;
public class Main2884_{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int H=scan.nextInt();
		int M=scan.nextInt();

		/*���� ã�ƺ�
			�˶��ð� ����
		*/
		if(M>=45) System.out.println(H+" "+(M-45));
		else{
			if(H==0) H=24;
				System.out.println((H-1)+" "+(60+M-45));
		}
	}
}