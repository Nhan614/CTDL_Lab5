package task1;

public class Matrix {
	// task1.1
	public static int[][] add1(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}


	//task1.2
	public static int[][] add2(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}


	//task1.3
	public static int[][] multiply(int[][] a, int[][] b) {
		if (a[0].length == b.length) {
			int[][] result = new int[a.length][b[0].length];
			int index = 0;
			for (int i = 0; i < result.length; i++) {
				if (index >= result[i].length) {
					index = 0;
				}
				while (index < result[i].length) {
					for (int j = 0; j < a[i].length; j++) {
						result[i][index] += a[i][j] * b[j][index];
					}
					index++;
				}
			}
			return result;
		} else

		{
			return null;
		}
	}


	public static int[][] transpose(int[][] a) {
		int[][] result = new int[a[0].length][a.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[j][i];
			}
		}
		return result;
	}

	public static void printArr(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
	public static void main(String[] args) {
		int[][] a1 = { { 7, 2 }, { 5, 3 } };
		int[][] a2 = { { 2, 1 }, { 3, 1 } };
		
		
		printArr(add1(a1, a2));
		printArr(add2(a1, a2));
		
		printArr(multiply(a1, a2));
		
		printArr(transpose(a1));
		printArr(transpose(a2));
	}
}
