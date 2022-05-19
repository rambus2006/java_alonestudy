public class Second_three{
	public static void main(String args[]){
		//제어문자를 사용한 출력
		System.out.printf("Be happy\n");
		System.out.printf("12345678901234567890\n");
		System.out.printf("My\tfriend\n");		
			//"My를 출력하고 탭 위치로 이동(\t) 후에 "friend"를 출력하고 줄을 바꿈
		System.out.printf("Goot\bd\tchance\n");
			//t를 d로 바꾸고 탭 위치로 이동(\t)후에 "chance"를 출력하고 줄을 바꿈(\n)
		System.out.printf("Cow\rW\n");
			//맨앞으로 이동(\r)해 C를 W로 바꾸고 벨소리(\a)를 내고 줄을 바꿈(\n)
		System.out.print("alert('알림창')");	//java에서 alert알림창

		//\n : 개행, 줄을 바꾼다.
		//\t : 탭(tab),출력 위치를 다음 탭 위치로 옮긴다.
		//\r : 캐리지 리턴(carriage return),출력위치를 줄의 맨 앞으로 옮긴다.
		//\b : 백스페이스(back space), 출력위치를 한칸 왼쪽으로 옮긴다.			
		//\a : 알럿(alert),벨(bell)소리를 낸다.
	}
}