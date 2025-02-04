import java.util.Scanner;

public class bingo {

	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0;
		int y = 0;
		int val = 0;
		int cnt = 0;
		boolean flag = false;
		
		Scanner scan = new Scanner(System.in);
		
		int[][] bingo = new int[SIZE][SIZE];
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x = (int)(Math.random()*SIZE);
				y = (int)(Math.random()*SIZE);
			
				int tmp;
				tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
			
		}
		
		do {
			for(int row[] : bingo) {
				for(int num : row) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
			
			System.out.println("숫자를 입력하세요");
			val = scan.nextInt();
			
			
			for(int i=0; i<SIZE; i++) {
				cnt = 0;
				for(int j=0; j<SIZE; j++) {
					if(bingo[i][j] == val) {
						bingo[i][j] = 0;
					}
					
					if(bingo[i][j] == 0) {
						cnt++;
					}
				}
				for(int j=0; j<SIZE; j++) {
					if(bingo[j][i] == 0) {
						cnt++;
					}
				}
				
				if(cnt == 5) {
					flag = true;
					System.out.println("BINGO!");
					break;
				}
			}
			if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 && bingo[3][3] == 0 && bingo[4][4] == 0) {
				flag = true;
				System.out.println("BINGO!");
			}
			if(bingo[0][4] == 0 && bingo[1][3] == 0 && bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0] == 0) {
				flag = true;
				System.out.println("BINGO!");
			}
			if(flag == true) {
				scan.close();
				break;
			}
		}while(val != 0);
		
		System.out.println("GAME OVER");
	}

}
