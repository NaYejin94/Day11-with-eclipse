package day11;

public class CmdLineTest {
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("명령줄 인수로 이름, 나이 입력해야 합니다!");
			return;
		}

		String name=args[0];
		int age=Integer.parseInt(args[1]);

		System.out.println("이름:"+name+", 나이:"+age);

		/*
		  명령줄 인수
		  - 커맨드 라인을 통해 입력 받기
		  - 실행시 클래스이름 뒤에 공백문자로 구분하여 여러 개의 문자열을 프로그램에
		    전달할 수 있다.
		    예)d:>java CmdLineTest 홍길동 20
		    
		  - 커맨드 라인을 통해 입력된 두 문자열은 String 배열에 담겨서 main메서드의 
		  	매개변수(args)에 전달됨
		 */
	}
}
