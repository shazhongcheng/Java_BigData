package base01;

public class MatrixTranspose {
	public static void main(String[] args) {
		int [][] mat = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		print(mat);
		matrixTranspose(mat);
		print(mat);
	}

	private static void matrixTranspose(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		
	}

	private static void print(int [][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
