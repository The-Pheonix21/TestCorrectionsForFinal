private String[] mixedWords(String[] words) {
	String[] tempArr = new String[words.length];
	for (int i = 0;i < tempArr.length; i +=2 ) {
		tempArr[i] = tho.recombine(words[i], words[i+1]);
		tempArr[i+1] = tho.recombine(words[i+1],words[i]);
	}
	return tempArr;
}