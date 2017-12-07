public class IntervalSort {
    public static void Interval(int[] ary) {
	for(int counter = 0; counter < ary.length; counter++ )
	    {positionless(ary , counter);}
    
    }
    
    public static void positionless(int[] ary, int start) {
	int smallest = ary[start];
	int position = 0; 
	
	for(int counter = start; counter > 0; counter --){
	    if(ary[counter] < ary[counter - 1]) {swap(ary , counter, counter - 1);}
	}
    }
    public static void swap (int[] ary , int a , int b) {
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;
    }
}
	    