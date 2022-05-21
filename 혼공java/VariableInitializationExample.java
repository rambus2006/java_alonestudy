package sec01.exam01;

public class VariableInitializationExample {
 	public static void main(String args[]){
		//변수 value선언
		int value;
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value+10;
		
		//변수 result 값을 읽고 콘솔에 출력
		//원래 컴파일 에러 남,당황X
		System.out.println(result);

	}
}