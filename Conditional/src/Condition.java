//import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// ���ǹ�
		// if, switch
		
		// if(���ǽ�: ������� true, false) {
		//	���๮ : ���ǽ��� true�� ��	
		//}else {
		// ���๮ : ���ǽ��� false�� ��
		//}
		
//		int age = 10;
//		
//		if(age >= 20) {
//			System.out.println("�����Դϴ�");
//		}else {
//			System.out.println("�̼����Դϴ�");
//		}
		
//		int x = 5;
//		if (!(x >= 1 && x <= 10)) {
//			System.out.println("���� �ȿ� �����ϴ� ���Դϴ�");
//		}else {
//			System.out.println("���� �ȿ� �������� �ʴ� ���Դϴ�");
//		}
		
//		if(���ǽ�) {
//			���๮1;
//		}else if(���ǽ�) {
//			���๮2;
//		}else if(���ǽ�) {
//			���๮3;
//		}else {
//			���๮4(���� ���ǽ��� ��� �������� ������ ����);
//		}
		
//		int select = 1;
//		if (select == 1) {
//			System.out.println("1���� �����߽��ϴ�");
//		}else if (select == 2) {
//			System.out.println("2���� �����߽��ϴ�");
//		}else if( select == 3) {
//			System.out.println("3���� �����߽��ϴ�");
//		}else {
//			System.out.println("�߸� �����ϼ̽��ϴ�");
//		}
		
		
//		if(���ǽ�) {
//			if(���ǽ�) {
//				
//			}else {
//				
//			}
//		}else {
//			
//		}
		
//		int x = 6; //2�� 3�� �����
//		if (x%2 == 0) {
//			if (x%3 == 0) {
//				System.out.println(x + "�� 2�� 3�� ������Դϴ�");
//			}
//		}
//			
//		if ((x%2 == 0) && (x%3 == 0)) {
//			System.out.println(x + "�� 2�� 3�� ������Դϴ�");
//		}
//		
//		if (2*3 == x) {
//			System.out.println(x + "�� 2�� 3�� ������Դϴ�");
//		}
		
		// switch(�񱳰�) { �����(==), case�� ������ �Ǽ��� ���Ұ�
		// case ��1 : ���๮;
		// break;
		
		// case ��2 : ���๮;
		// break;
		
		// case ��3 : ���๮;
		// break;
		
		// default : ���๮; �ش��ϴ� ���� ���� �� ����
		// }
		
//		int sel = 1;
//		String str = "1";
//		char c = '1';
		
//		switch(sel) {
//		case 1 : System.out.println("1�� ����");
//		break;
//		
//		case 2 : System.out.println("2�� ����");
//		break;
//		
//		case 3 : System.out.println("3�� ����");
//		break;
//		
//		default : System.out.println("�߸� ����");
//		}
		
//		int score = 60;
//		if (score >= 60) {
//			System.out.println("�հ�");
//		}else {
//			System.out.println("���հ�");
//		}
//		
//		���� ������ �̿�
//		String result = (score >= 60)? "�հ�" : "���հ�";
//		System.out.println(result);
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("���ڸ� �Է��ϼ��� : ");
//		int num1 = scan.nextInt(); //Ŀ���� ���
//	
//		// scan.next(); ù��° ���� ������
//		scan.nextLine();
//	
//		
//		System.out.println("��� �����ڸ� �Է��ϼ��� : ");
//		String str = scan.nextLine(); // ����ġ�� ������
//		
//		System.out.println("���ڸ� �Է��ϼ��� : ");
//		int num2 = scan.nextInt(); //Ŀ���� ���
//		
//		switch(str) {
//		case "+" : System.out.println(num1 + num2);
//		break;
//		
//		case "-" : System.out.println(num1 - num2);
//		break;
//		
//		case "*" : System.out.println(num1 * num2);
//		break;
//		
//		case "/" : System.out.println(num1 / num2);
//		break;
//		}
		
		// ������ �����
		// Math.random() : 0.0 <= r < 1
		
		//System.out.println(Math.random());
		// 1 ~ 10 = (int)(Math.random()*(������ �ִ밪 - ������ �ּҰ�) + 1) + ������ �ּҰ�
		
		//System.out.println((int)(Math.random()*10)+1);
		
		//1(����) 2(����) 3(��)
//		int num1 = (int)(Math.random()*3) + 1;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("���� ���� �� �Է�");
//		String str = scan.nextLine();
//		int me = scan.nextInt();
				
		// ���� �Է�
//		switch(str) {
//		case "����" : {
//			String result = (num1 == 1)? "COM : ���� => ���º�" : ((num1 == 2)? "COM : ���� => �й�" : "COM : �� => �¸�!");
//			System.out.println(result);
//		} scan.close(); break;
//		
//		case "����" : {
//			String result = (num1 == 1)? "COM : ���� => �¸�!" : ((num1 == 2)? "COM : ���� => ���º�" : "COM : �� => �й�");
//			System.out.println(result);
//		} scan.close(); break;
//		
//		case "��" : {
//			String result = (num1 == 1)? "COM : ���� => �й�" : ((num1 == 2)? "COM : ���� => �¸�!" : "COM : �� => ���º�");
//			System.out.println(result);
//		} scan.close(); break;
//		
//		default : System.out.println("�߸� �Է�");
//		}
		
		// ���� �Է�
//		int result = me - num1;
//		
//		if(result == -1 || result == 2) {
//			System.out.println("�¸�");
//		}else if(result == 1 || result == -2) {
//			System.out.println("�й�");
//		}else {System.out.println("���º�");}
		
		// �ݺ���
		// for, while, do-while
		
		
//		for(�ʱⰪ; ���ǽ�; ������) {
//			�ݺ��� ���๮;
//		}
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		
//		for(int i=1; i <= 10; i+=2) {
//			System.out.println(i);
//		}
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		for(int i=1,j=10; i<=10; i++,j--) {
//			System.out.println("i = " + i + ", j = " + j);
//		}
		
//		int s = 1;
//		for(int i=1; i<=10; i++,s*=-1) {
//			System.out.println(s);
//		}
		
		// 5! = 1 x 2 x 3 x 4 x 5
		
//		int sum = 1;
//		for(int i=1; i<=5; i++) {
//			sum *= i;
//		}
//		System.out.println(sum);
		
//		�ʱⰪ
//		while(���ǽ�) {
//			�ݺ��� ���๮;
//			������;
//		}
		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
//		int i = 1;
//		int fac = 1;
//		while(i<=5) {
//			fac *= i;
//			i++;
//		}
//		System.out.println(fac);
		
		//��ø for��
//		for(�ʱⰪ;���ǽ�;������) { ��
//			for(�ʱⰪ;���ǽ�;������) { ��
//				�ݺ��� ���๮;
//			}
//		}
		
		// *****
//		for(int i=1; i<=5; i++) {
//			System.out.print("*");
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println(); �� ���
//		}
		
//		*
//		**
//		***
//		****
//		*****
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*****
//		****
//		***
//		**
//		*
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		     *
//		    **
//		   ***
//		  ****
//		 *****
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=5; j++) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		// while�� ��ø
		
//		*
//		**
//		***
//		****
//		*****
		
//		int i = 1;
//		
//		while(i<=5) {
//			int j = 1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(" ");
//			i++;
//		}
		
//		*****
//		****
//		***
//		**
//		*
		
//		int i = 5;
//		while(i>=1) {
//			int j = 1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(" ");
//			i--;
//		}
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
		
//		int i = 1;
//		while(i<=5) {
//			int j = 1;
//			while(j<=5) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		int i = 5;
//		while(i>=1) {
//			int j = 1;
//			while(j<=5) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		
		// ���� �ݺ���
		
//		for(;true;) {
//			���๮;
//		}
		
//		while(true) {
//			���๮;
//		}
		
//		int i = 1;
//		int even = 0; //Ȧ��
//		int odd = 0; //¦��
//		
//		while (i<=10) {
//			if(i%2 == 0) {
//				odd += i;
//			}else {
//				even += i;
//			}
//			i++;
//		}
//		System.out.println("odd : " + odd);
//		System.out.println("even : " + even);
		
//		int i = 1;
//		int sum = 0;
//		
//		while(true) {
//			if(sum > 100) {
//				break;
//				System.out.println("i : " + i + ", " + "sum : " + sum);
//			}else {
//				sum += i;
//				i++;
//			}
//			
//		}	
		
//		boolean flag = true;
//		int sum = 0;
//		int i = 1;
//		
//		while(flag) {
//			sum += i;
//			if(sum > 90 && sum < 100) { //(!(sum <= 100))���ε� ����
//				flag = false;
//				System.out.println("i : " + i + ", " + "sum : " + sum);		
//			}
//			i++;
//		}
		
//		int i = 0;
//		int sum = 0;
//		
//		while((sum += ++i) <= 100) { // if���� ���ǽ��� while���� ���ǽĿ� ������
//			System.out.println("i : " + i + ", " + "sum : " + sum);
//		}

		// �־��� ������ ���� ���ϱ�
		// ������ �ڸ����� �����ϰ� �־�����.
		// ex) 12345 = 1+2+3+4+5 = 15
		
//		int sum = 0;
//		int r = (int)(Math.random()*30) + 1;
//		
//		for(int i=0; i<=r; i++) {
//			int j = (int)(Math.random()*9) + 1;
//			sum += j;
//			System.out.println("j : " + j + ", sum : " + sum);
//		}
//		System.out.println(sum);
		
		
//		int num = 12345;
//		
//		num % 10 -> 5
//		num / 10 -> 1234 �� ���� �ݺ��ϴ� num�� 0�� �Ǹ� �ݺ��� ����.
		
//		int num = (int)(Math.random()*100000000)+1;
//		int sum = 0;
//		
//		while(num != 0) {
//			sum += num % 10;
//			System.out.println("num : " + num + ", sum : " + sum);
//			num /= 10;
//		}
//		System.out.println(sum);
		
		// break, continue
//		int i = 1;
//		
//		while(true) {
//			if(i > 10) {
//				break;
//			}
//			System.out.println(i + ".hello world");
//			i++;
//		}
		
//		int i = 0;
//		
//		while(i <= 10) {
//			i++;
//			if(i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i + ". hello world");
//		}
		
//		do {
//			���๮
//		}while(���ǽ�); 
		
		
//		int i = 1;
//		
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 10);
		
//		int i = 1;
//		
//		do {
//			int j = 1;
//			do {
//				System.out.print("*");
//				j++;				
//			}while(j<=i);
//			System.out.println(" ");
//			i++;
//		}while(i<=5);
		
		// 1 ~ 20 ���� �߿� 2 �Ǵ� 3�� ����� �ƴ� ���� ����
//		int sum = 0;
//		
//		for(int i=1; i<=20; i++) {
//			if(i%2 != 0 && i%3 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=20) {
//			if(i%2 != 0 && i%3 != 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
		// 1+(-2)+3(-4)+...�� ���� ������ ���س����� �� �� ���� ���ؾ� ������ 100 �̻��� �Ǵ��� ���Ͻÿ�
		
//		int sum = 0;
//		int s = 1; // ��ȣ ������ ���� ����
//		int num = 0;
//		int i = 1;
//		
//		while(true) {
//			num = s * i;
//			sum += num;
//			
//			s = -s; // 1 -> -1 -> 1 ...
//			i++;
//			
//			if(sum >= 100) {
//				break;
//			}
//			
//		}
//		System.out.println("num : " + num);
//		System.out.println("sum : " + sum);
		
//		int i = 1;
//		int j = 0;
//		int sum = 0;
//		
//		while(true) {
//			sum = sum + i + j;
//			i += 2;
//			j -= 2;
//			if(sum >= 100) {
//				break;
//			}
//		}
//		System.out.println("i : " + i + ", j : " + j + ", sum : " + sum); 
		// sum = 100���� �ݺ����� ���߱�� ������ ���� ���� ���� ������ �� 100�� �������� �� �� ����
		
		
		// ������ 2x + 4y = 10�� ��� �ظ� ���Ͻÿ�. �� x�� y�� �����̰� ������ ������ 0<=x<=10, 0<=y<=10�̴�.
		
//		for(int x=0; x<=10; x++) {
//			for(int y=0; y<=10; y++) {
//				if((x * 2) + (y * 4) == 10) {
//					System.out.println("x : " + x + ", y : " + y);
//				}
//			}
//		}
		
//		int number = 12345; 	// 12345 -> 54321
//		int number = (int)(Math.random()*10000000)+1;
//		int r = 0;
//		
//		System.out.println(number);
//		while(number != 0) {
//			r = r * 10 + number % 10;
//			System.out.println("number : " + number + ", r : " + r);
//			number /= 10;
//		}
//		System.out.println(r);
		
//		int number = 12321;
//		int sum = number;
//		int r = 0;
//		
//		while(sum != 0) {
//			r = r * 10 + sum % 10;
//			System.out.println("sum : " + sum + ", r : " + r);
//			sum /= 10;
//		}
//		if(number == r) {
//			System.out.println("number : " + number + ", r : " + r);
//			System.out.println("ȸ���Դϴ�.");
//		}else {
//			System.out.println("number : " + number + ", r : " + r);
//			System.out.println("ȸ���� �ƴմϴ�.");
//		}
		
		
		
	}

}
