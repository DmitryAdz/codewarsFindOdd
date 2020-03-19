package codewarsFindOdd;

import java.util.ArrayList;

public class FindOdd {

	public static int findIt(int[] a) {
		int numbOdd = 0;
		int sizeA = a.length;
		int tempElement = a[0];
		int count = 0;
		ArrayList<Integer> temp1Arr = new ArrayList<Integer>();
		for(int i = 0; i < sizeA; i++) {
			if(tempElement == a[i]) {
				count++;
			}
			if(tempElement != a[i]) {
				temp1Arr.add(a[i]); 
			}
		}
		if(count%2 != 0) {
			numbOdd = tempElement;
			return numbOdd;
		}
		
		ArrayList<Integer> temp2Arr = new ArrayList<Integer>();
		while(!temp1Arr.isEmpty()) {
			tempElement = temp1Arr.get(0);
			count = 0;
			for(Integer elem : temp1Arr) {
				if(tempElement == elem) {
					count++;
				}
				if(tempElement != elem) {
					temp2Arr.add(elem); 
				}
			}
			if(count%2 != 0) {
				numbOdd = tempElement;
				return numbOdd;
			}
			temp1Arr.clear();
			temp1Arr.addAll(temp2Arr);
			temp2Arr.clear(); 
		}
		
		return numbOdd;
	}
}
