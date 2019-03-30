package base01;

public class HPrintThMatx {

	public static void main(String[] args) {
		int [][][] mat = new int[][][] {{{1,2,3},{4,5,6},{7,8,9}},{{11,12,13},{14,15,16},{17,18,19}},{{21,22,23},{24,25,26},{27,28,29}}};
		System.err.println("纵向输出：");
		print1(mat);
		System.err.println("横向输出：");
		print2(mat);
		
	}

	private static void print1(int[][][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for (int k = 0; k < mat[i][j].length; k++) {
					System.out.print(mat[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	private static void print2(int[][][] mat) {
		for (int j = 0; j < mat[0].length; j++) {
			for (int i = 0; i < mat.length; i++) {
				for (int k = 0; k < mat[i][j].length; k++) {
					System.out.print(mat[i][j][k]+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
