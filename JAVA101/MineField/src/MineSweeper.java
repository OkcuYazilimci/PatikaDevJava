import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int rowNumber;
    int columnNumber;
    int size;
    int[][] map;
    int[][] board;
    boolean game = true;

    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.size = rowNumber * columnNumber;
        this.map = new int[rowNumber][columnNumber];
        this.board = new int[rowNumber][columnNumber];
    }

    public void run() {
        int success = 0;
        prepare();
        print(map);
        System.out.println("Game Started");
        while (game) {
            print(board);
            System.out.println("Row:");
            int row = input.nextInt();
            System.out.println("Column:");
            int col = input.nextInt();
            if (map[row][col] != -1) {
                checkBoard(row, col);
                success++;
                if ( success == (size - ( size / 4 ))) {
                    System.out.println("YOU WON");
                    break;
                }
            } else {
                game = false;
                System.out.println("GAME OVER");
            }
        }
    }

    public void checkBoard(int r, int c) {
        if ((c < columnNumber -1 ) && (map[r][c + 1] == -1)) {
            board[r][c]++;
        }
        if ((r < rowNumber -1 ) && (map[r + 1][c] == -1)) {
            board[r][c]++;
        }
        if ((r > 0 ) && (map[r - 1][c] == -1)) {
            board[r][c]++;
        }
        if ((r > 0 ) && (map[r][c - 1] == -1)) {
            board[r][c]++;
        }
        if (board[r][c] == 0) {
            board[r][c] = -2;
        }
    }
       /*int[][] matris = new int[rowNumber][columnNumber];
        int number = 1;
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++) {
                matris[i][j] = number++;
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("xxxxxxxxx");
    String[][] mines = new String[rowNumber][columnNumber];
        for(int i = 0; i < mines.length; i++){
            for(int j = 0; j < mines[i].length; j++) {
                mines[i][j] = " - ";
                System.out.print(mines[i][j]+" ");
            }
            System.out.println();
        }
    }*/

    public void prepare() {
        int randRow, rancdCol;
        int count = 0;
        while (count != (size/4)) {
            randRow = rand.nextInt(rowNumber);
            rancdCol = rand.nextInt(columnNumber);
            if (map[randRow][rancdCol] != -1) {
                map[randRow][rancdCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr ){
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > 0 ) {
                    System.out.println("          ");
                }
            System.out.print(arr[i][j]+ "    " );
            }
            System.out.println();
        }
    }

}
