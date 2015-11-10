package simplealgorithm;

import java.util.ArrayList;

public class MatrixManagement {
	public int[][] Rotate90Matrix(int[][] Matrix, int m, int n){
		int[][] NMatrix = new int[100][100];
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				NMatrix[i][j] = Matrix[m - 1 - j][i];
			}
		}
		return NMatrix;
	}
	
	public static int[][] convertZeroToOne(int[][] Matrix, int m, int n){
		ArrayList<Integer> candidate = new ArrayList<Integer>();
		for(int i = 0;i<m;i++){
			for(int j = 0;j < n;j++){
				if(Matrix[i][j] == 0){
					candidate.add(i, 1);
					candidate.add(j, 1);
				}
			}
		}
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				if(candidate.get(i) == 1 || candidate.get(j) == 1){
					Matrix[i][j] = 0;
				}
			}
		}
		return Matrix;
	}
}

// (1) 2차원 배열을 인자로 넘기고 받는 방법에 대해서
// (2) 2차원 배열의 동적 할당을 위한 ...
// (3) 어레이리스트의 2차원 배열을 만드는 방법에 대해서