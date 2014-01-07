public static boolean isMountain(int[] array){
    int pkIndexVal;
    pkIndexVal = this.getPeakIndex(array);
	if ((pkIndexVal > -1) && this.isIncreasing(array,pkIndexVal) && this.isDescreasing(array,pkIndexVal)) {
		return true;}
     else{
     	return false;
     }
}