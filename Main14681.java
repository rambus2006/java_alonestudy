import java.util.Scanner;
public class Main14681 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		if(x>0&&y>0) System.out.print("1");
		else if(x<0&&y>0) System.out.print("2");
		else if(x<0&&y<0) System.out.print("3");
		else System.out.print("4");
	}
}
/*���2
	if(x>0){
		if(y>0) System.out.print(1);
		else System.out.print(4);
	}
	else{
		if(y>0) System.out.print(2);
		else System.out.print(3);
	}
*/