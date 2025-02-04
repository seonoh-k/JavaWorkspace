import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		final int SIZE = 3;
		int cnt = 0;
		int chk1 = 0;
		int chk2 = 0;
		int x = 0;
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		
		char[][] field = new char[SIZE][SIZE];
		int[][] fieldset = new int[SIZE][SIZE];
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				fieldset[i][j] = (i) * 3 + j + 1;
				field[i][j] = '□';
			}
		}
		
		for(char row[] : field) {
			for(char TTT : row) {
				System.out.print(TTT + " ");
			}
			System.out.println();
		}
		
		do {
			System.out.println("X/O를 기입할 숫자를 입력하세요");
			System.out.println("Player1 = X, Player2 = O");
			x = scan.nextInt();
			cnt++;
			
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {				
					if(cnt%2 != 0) {
						if(x == fieldset[i][j]) {
							fieldset[i][j] = 0;
							field[i][j] = 'X';
							break;							
						}else if(x == fieldset[i][j] && (fieldset[i][j] == 0 || fieldset[i][j] == 1)) {
							System.out.println("이미 입력한 자리입니다");
							cnt--;
							break;
						}
					}else if(cnt%2 == 0) {
						if(x == fieldset[i][j]) {
							fieldset[i][j] = 1;
							field[i][j] = 'O';							
							break;							
						}else if(x == fieldset[i][j] && (fieldset[i][j] == 0 || fieldset[i][j] == 1)) {
							System.out.println("이미 입력한 자리입니다");
							cnt--;
							break;
						}
					}
					
				}
			}
			
			for(int i=0; i<SIZE; i++) {
				chk1 = 0;
				chk2 = 0;
				for(int j=0; j<SIZE; j++) {
					if(fieldset[i][j] == 0) {
						chk1++;
					}else if(fieldset[i][j] == 1) {
						chk2++;
					}
					
					if(chk1 == 3) {
						System.out.println("Player1 Win!");
						flag = false;
						break;
					}else if(chk2 == 3) {
						System.out.println("Player2 Win!");
						flag = false;
						break;
					}
				}
				
				chk1 = 0;
				chk2 = 0;
				
				for(int j=0; j<SIZE; j++) {
					if(fieldset[j][i] == 0) {
						chk1++;
					}else if(fieldset[j][i] == 1) {
						chk2++;
					}
					
					if(chk1 == 3) {
						System.out.println("Player1 Win!");
						flag = false;
						break;
					}else if(chk2 == 3) {
						System.out.println("Player2 Win!");
						flag = false;
						break;
					}
				}
			}
			
			if(fieldset[0][0] == 0 && fieldset[1][1] ==  0 && fieldset[2][2] == 0) {
				System.out.println("Player1 Win!");
				flag = false;
				break;
			}else if(fieldset[0][2] == 0 && fieldset[1][1] == 0 && fieldset[2][0] == 0) {
				System.out.println("Player1 Win!");
				flag = false;
				break;
			}
			
			if(fieldset[0][0] == 1 && fieldset[1][1] ==  1 && fieldset[2][2] == 1) {
				System.out.println("Player2 Win!");
				flag = false;
				break;
			}else if(fieldset[0][2] == 1 && fieldset[1][1] == 1 && fieldset[2][0] == 1) {
				System.out.println("Player2 Win!");
				flag = false;
				break;
			}
			
			for(char row[] : field) {
				for(char TTT : row) {
					System.out.print(TTT + " ");
				}
				System.out.println();
			}
			
			if(cnt == 9) {
				flag = false;
				System.out.println("GAME OVER");
				break;
			}
			
			if(flag == false) {
				scan.close();
				break;
			}
		}while(flag = true);
		
		
	}

}
