package day11;

public class CmdLineTest {
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("����� �μ��� �̸�, ���� �Է��ؾ� �մϴ�!");
			return;
		}

		String name=args[0];
		int age=Integer.parseInt(args[1]);

		System.out.println("�̸�:"+name+", ����:"+age);

		/*
		  ����� �μ�
		  - Ŀ�ǵ� ������ ���� �Է� �ޱ�
		  - ����� Ŭ�����̸� �ڿ� ���鹮�ڷ� �����Ͽ� ���� ���� ���ڿ��� ���α׷���
		    ������ �� �ִ�.
		    ��)d:>java CmdLineTest ȫ�浿 20
		    
		  - Ŀ�ǵ� ������ ���� �Էµ� �� ���ڿ��� String �迭�� ��ܼ� main�޼����� 
		  	�Ű�����(args)�� ���޵�
		 */
	}
}
