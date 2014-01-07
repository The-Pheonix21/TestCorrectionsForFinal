public static int getPeakIndex(int[] array){
	int peakIndex = -1;
	for (int i=1; i < array.length-1; i++){
	  if (array[i-1] < array[i] && array[i]>array[i+1]){
	     peakIndex=i;
	     return peakIndex;
	  }
	}
	return peakIndex;
}