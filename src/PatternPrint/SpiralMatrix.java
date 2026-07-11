package PatternPrint;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int rowStart = 0;
            int rowEnd = matrix.length;
            int colStart = 0;
            int colEnd = matrix[0].length;

            while (rowStart < rowEnd && colStart < colEnd) {


                for (int i = colStart; i < colEnd; i++) {
                    ans.add(matrix[rowStart][i]);
                }
                rowStart++;


                for (int i = rowStart; i < rowEnd; i++) {
                    ans.add(matrix[i][colEnd - 1]);
                }
                colEnd--;


                if (rowStart < rowEnd) {
                    for (int i = colEnd - 1; i >= colStart; i--) {
                        ans.add(matrix[rowEnd - 1][i]);
                    }
                    rowEnd--;
                }


                if (colStart < colEnd) {
                    for (int i = rowEnd - 1; i >= rowStart; i--) {
                        ans.add(matrix[i][colStart]);
                    }
                    colStart++;
                }
            }

            return ans;
        }
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        SpiralMatrix obj = new SpiralMatrix();

        List<Integer> result = obj.spiralOrder(matrix);

        System.out.println(result);
    }
    }

//
// Left -> Right
// Top -> Bottom
// Right -> Left
// Bottom -> Top