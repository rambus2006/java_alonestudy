import java.util.Scanner;
public class Main2884__{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int H=scan.nextInt();        //�ð����� �Է� �� ����
		int M=scan.nextInt();        //�� ���� �Է� �� ����

       		  //���� 45���� ũ�� �ð��� ���ΰ� �п��� 45�� ���� ����Ѵ�.
		if(M>=45) System.out.println(H+" "+(M-45));    
       		 //���� 45���� �۴ٸ�
		else{
           			 //���� �ð��� 0�ð��̸� 24�ð����� ����
			if(H==0) H=24;
                			//24�ð����� 1�ð��� �� �� �п� 60�� ���� �� 45���� ����.
				System.out.println((H-1)+" "+(60+M-45));
		}
	}
}
		/*
		//����̰� ������ �˸��ð��� �־����� ��
		//�ð� �Է�
		float H=scan.nextFloat();
		//���Է�
		float M=scan.nextFloat();
		float tot;

		//�ð��� 45�� ������ ��
		if(H/60<=45){		//�ð��� ������ ����
			tot=H+M;
			tot=(tot-45);
		}
		else{
			tot=H+M;
			tot=(tot-45);
		} 
		System.out.print(tot);
		*/
		
