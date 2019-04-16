//Parth Mistry

public class Lab05SimpleArrays {
	
	public int[] createSimpleArray(int x){
		int[] arr = new int[x];
		int count = 0;
		for (int i = 0; i < x; i++) {
			arr[i] = count;
			count += 1;
		}
		return arr;
	}
	
	public int[][] createTwoDimensionalArray(int x, int y) {
		int[][] arr = new int[x][y];
		int count = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = count;
				count += 1;
			}
			count = 0;
		}
		return arr;
	}
	
	public int[][] createRaggedArray(int[] vals) {
		int[][] ragArr = new int[vals.length][];
		for (int i = 0; i < vals.length; i++) {
			ragArr[i] = createSimpleArray(vals[i]);
		}
		return ragArr;
	}
	
	public int totalLength(String[] vals) {
		int sum = 0;
		for (int i = 0; i < vals.length; i++) {
			sum += vals[i].length();
		}
		return sum;
	}

}
