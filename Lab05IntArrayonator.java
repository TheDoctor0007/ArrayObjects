//Parth Mistry and James R Ogden

public class Lab05IntArrayonator {
	
	private int[] myArray;
	
	public Lab05IntArrayonator(){
		this.myArray = new int[0];
		}

	public Lab05IntArrayonator(int[] myArray){
		this.myArray = myArray;
	}
	
	public int[] getArray(){
		return this.myArray;
	} // provides deep copy

	public int getLength(){
		return this.myArray.length;
	} // returns length of array

	public int getValue( int loc ){
		return myArray[loc];
	} // returns value at index

	public int getMin(){
		if (myArray. length ==0){
			return 0;
		}
		int min = myArray[0];
		for (int i=1; i<myArray.length; i++) {
			if (myArray[i] < min){
				min = myArray[i];
			}
		}
		return min;
	} //returns smallest value

	public int getMinLoc(){
		if (myArray. length ==0){
			return 0;
		}
		int min = myArray[0];
		int minLoc = 0;
		for (int i=1; i<myArray.length; i++){
			if (myArray[i] < min){
				min = myArray[i];
				minLoc = i;
			}
		}
		return minLoc;
	} // returns smallest value’s index

	public int getMax(){
		if (myArray. length ==0) {
			return 0;
		}
		int max = myArray[0];
		for (int i=1; i<myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
		}
		return max;
	} //returns largest value

	public int getMaxLoc(){
		if (myArray. length ==0){
			return 0;
		}
		int max = myArray[0];
		int maxLoc = 0;
		for (int i=1; i<myArray.length; i++){
			if (myArray[i] > max){
				max = myArray[i];
				maxLoc = i;
			}
		}
		return maxLoc;
	} // returns largest value’s index

	public double getMean(){
		double mean = 0;
		for(int i=0; i<myArray.length; i++) {
			mean += myArray[i];
		}
		return (mean / myArray.length);
	} // returns mean of all values

	public String toString(){
		String thing = "";
		for (int i=0; i<myArray.length; i++){
			thing += myArray[i];
			thing += " ";
		}
		return thing;
	} //returns the string output of the array

	public int firstLarger( int val ){
		for (int i=0; i<myArray.length; i++)
			if ( myArray[i] > val) {
				return i;
			}
		return -1;
	} // returns index of first value larger than val - if none, returns -1

	public boolean isSorted(){
		for (int i=1; i<myArray.length; i++) {
			if( myArray[i-1] > myArray[i]) {
				return false;
			}
		}
		return true;
	} // returns true if sorted, false if not
	
	public void setArray(int[] myArray) {
		this.myArray = myArray;
	}
	
	public void setValue(int loc, int val) {
		val = myArray[loc];
	}
	
	public void insert (int val, int loc) {
		int[] copArr = new int[myArray.length+1];
		for (int i = 0; i < myArray.length; i++) {
			if (i < loc){
			copArr[i] = myArray[i];
			} else if (i == loc) {
				copArr[i] = val;
			} else {
				copArr[i] = myArray[i-1];
			}
		}
	}
	
	public void delete (int loc) {
		int[] copArr = new int[myArray.length-1];
		for (int i = 0; i < copArr.length; i++) {
			if (i < loc) {
				copArr[i] = myArray[i];
			} else {
				copArr[i] = myArray[i+1];
			}
		}
	}
	
	private void swap(int loc1, int loc2) {
		//loc1 and loc2 are index values
		int temp = myArray[loc1];
		myArray[loc1] = myArray[loc2];
		myArray[loc2] = temp;
	}
	
	public void selector(int[] list) {
		int n= list.length;
		for (int i = 0, nMinOne = n-1; i < nMinOne; i++) {
			int minIndex = i, minVal = list[i];
			for (int j = i+1; j < n; j++) {
				if (list[j] < minVal) {
					minVal = list[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(i, minIndex);
			}
		}
	}
	
	public void insertor(int[] list) {
		int n = list.length;
		for (int i = 1; i < n; i++) {
			int k, current = list[i];
			for (k = i-1; k >= 0 && list[k] > current; k--) {
				list[k+1] = list[k];
			}
			list[k+1] = current;
		}
	}
	
	public int median(){
		int len = myArray.length;
		int[] cop = new int[len];
		for (int i=0; i<len; i++) {
			cop[i] = myArray[i];
		}
		insertor(cop);
		if (len%2 == 1) {
			return (cop[len/2] + cop[len/2 +1])/2;
		} else {
			return cop[len/2];
		}
	} // returns the median, w/o changing array

}
