package com.metacube.junit.JUnitAssignment;

public class ArrOperation {
	/**
	 * This Method is returning the largest mirror section of our array
	 * @param arr
	 * @return maxMirror
	 */
	public int MaxMirror(int [] arr) {
		/**
		 * Throw assertion in following cases 
		 * :- If array is empty 
		 */
		if(arr.length<=0||arr==null) {
			throw new AssertionError("Array Cannot Be Empty or negative");
		}
		
		int result=0;
		for(int left=0;left<arr.length;left++) {
			for(int right=arr.length-1;right>=left;right--) {
				int current =0;
				for(int i=left,j=right;i<=right&&arr[i]==arr[j];i++,j--) {
					current++;
				}
				result= Math.max(result, current);
			}
		}
		return result;
	}
	/**
	 * With the help of count clumps method we are counting the number of clumps present in our array
	 * Clump in an array is a series of 2 or more adjacent elements of the same value
	 * @param arr
	 * @return Cout of Clumps
	 */
	public int CountClumps(int [] arr) {
		/**
		 * Throw assertion in following cases 
		 * :- If array is empty 
		 */
		if(arr.length<=0||arr==null) {
			throw new AssertionError("Array Cannot Be Empty");
		}
		int result=0;
		int i=0;
		while(i<arr.length) {
			int count=0;
			int j=i;
			while(j<arr.length&&arr[j]==arr[i]) {
				count++;
				j++;
			}if(count>=2) {
				result++;
			}
			i=j;
		}
		return result;
	}
	/**
	 * With the help of this Method we are rearranging our array such that the position of x remain the same as the array 
	 * While the position of y changes and will come next to x
	 * @param x
	 * @param y
	 * @param arr
	 * @return result arr
	 */
	public int[] fixXY(int x,int y,int []arr) {
		/**
		 * Throw assertion in following cases 
		 * :- If array is empty 
		 */
		if(arr.length<=0) {
			throw new AssertionError("Array Cannot Be Empty");
		}
		/**
		 * Throw assertion in following cases 
		 * :- If there are unequal numbers of X and Y in input array. 
		 */
		boolean flagX=false;
		boolean flagY=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				flagX=true;
			}if(arr[i]==y) {
				flagY=true;
			}
		}
		if(flagX==false||flagY==false) {
			throw new AssertionError("Either x is not present or y is not present");
		}
		/**
		 * Throw assertion in following cases 
		 * :- If X occurs at the last index of array. 
		 */
		if(arr[arr.length-1]==x) {
			throw new AssertionError("x cannot be at last index");
		}
		/**
		 * Throw assertion in following cases 
		 * :- If two adjacents X values are there.  
		 */
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x&&arr[i+1]==x) {
				throw new AssertionError("X cannot be adjacent");
			}
		}
		
		for(int checkY=0;checkY<arr.length;checkY++) {
			if(arr[checkY]==y&& checkY==0||arr[checkY]==y && arr[checkY-1]!=x) {
				int posY=checkY;
				for(int checkX=0;checkX<arr.length;checkX++) {
					if(arr[checkX]==x&&arr[checkX+1]!=y) {
						//Swaping
						int temp=arr[checkX+1];
						arr[checkX+1]=y;
						arr[posY]=temp;
						break;
					}
			
				}
			}
		}
		return arr;
	}
	public int sum(int [] arr) {
		int totalSum=0;
		for(int ele:arr) {
			totalSum+=ele;
		}
		return totalSum;
	}
	public int splitArray(int [] arr) {
		/**
		 * Throw assertion in following cases 
		 * :- If array is empty 
		 */
		if(arr.length<=0||arr==null) {
			throw new AssertionError("Array Cannot Be Empty");
		}
		int TotalSumOfArr=sum(arr);
		if(TotalSumOfArr%2==1) {
			return -1;
		}
		int halfSum=TotalSumOfArr/2;
		int runningSum=0;
		for(int i=0;i<arr.length;i++) {
			runningSum+=arr[i];
			if(runningSum==halfSum) {
				return i+1;
			}
		}
		return-1;
			
	}
}
