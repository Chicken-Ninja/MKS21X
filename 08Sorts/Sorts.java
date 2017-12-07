import java.util.Arrays;
public class Sorts {
    private int Position = 0; 

    public static void swap(int[]ary , int a , int b) {
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;}
    
    public static void sorts(int[]ary){
	for(int counter = 0; counter < ary.length; counter++) {
	    swap(ary , counter , NewPos(ary , counter));}
    }
    
    
	
	

	public static int NewPos(int[] a, int start) {
	    int smallest = a[start];
	    int position = start;
	    for(int counter = start; counter < a.length; counter++ ) {
		if(a[counter] < smallest){smallest = a[counter];}}
	    for(int counter = start; counter < a.length; counter++ ) {
		if(a[counter] == smallest) {position = counter;}}
	    return position;
		
	    }
	
    public static String name() {
	return "01.Last.First";}
}
    