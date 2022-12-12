import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4},
                {4,5,6,7},{8,9,7,2}
        };
        for(int i = 0; i < matrix.length+1; i++){
            for (int j = 0; j <matrix.length+1; j++){
                System.out.print(matrix[j][i]+"  ");
            }
            System.out.println();
// neden bu şekilde hata veriyor çözemedim daha sonra tekrar bakcam
        }
    }

}