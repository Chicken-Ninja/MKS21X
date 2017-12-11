import java.util.Arrays;
public class Sorts {
    private int Position = 0; 
    
    //INSERTION SORT
    public static void insertionSort(int[] ary) {
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
   
	   
    //SWAP (FOR ALL THE SORTS)



    public static void swap(int[]ary , int a , int b) {
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;}



    //SELECTION SORT AND ALL ITS METHODS 
    


    public static void selectionSort(int[]ary){
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


    //NAME THING 
    public static String name() {
	return "10.Ko.Ethan";}



    //BUBBLE SORT AND ALL ITS METHODS 

    


    public static void bubbleSort(int[] a) {
	
	int pass = 0;
	int position = 0;

	for(int counter = 0 ; counter < a.length; counter++) {
	    int[] store = new int[a.length];
	    for(int stepper = 0; stepper < a.length; stepper++){
		
		store[stepper] = a[stepper];
		
	    }
	
	    Npass(a , counter);		       
	    if(isEqual(a , store)){break;} 
	    
	}
	    
	    
	    
    }
		

    public static void bubblePlace(int[] a, int current) {
	if(a[current] >= a[current + 1]) {swap(a , current , current + 1);}
    }
    
    public static boolean isEqual(int[] a , int[] b) {
	if(a.length != b.length) {return false;}
	for(int counter = 0; counter < a.length ; counter ++ ){
	    if( a[counter] != b[counter]) {return false;} }
	return true;
    }
    
    public static void Npass(int[] a, int current){
	int pass = current; 
	for(int counter = 0; counter < a.length - (1 + current); counter++ ) {
	    bubblePlace(a , counter);
	}
    }

		
		


    
    
}
    