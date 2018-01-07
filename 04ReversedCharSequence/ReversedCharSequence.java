public class ReversedCharSequence implements CharSequence {
    private String data = "";
    public ReversedCharSequence(String thing) {
	for (int counter = thing.length(); counter > 0; counter -- ){
	    data = data + thing.substring(counter - 1, counter);}}
    public String toString (){
	return data;}
    public int length() {
	return data.length();}
    public char charAt(int index) {
	return data.charAt(index);}
    public CharSequence subSequence (int start, int end) {
	return data.substring(start, end); }

	
}

	   	
       