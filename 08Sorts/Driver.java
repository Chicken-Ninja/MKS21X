public class Driver{
  public static void main(String[]args){
    //Change this part with any test case you like by
    //commenting and uncommenting
    
    int[] a = {64, 25, 12, 22, 11};
    int[] b = {34, 25, 12, 22, 12};
    int[] c = {64, 25, 12 ,22, 11};
    //int[] a = {6, 25, -12, 22, 1, 32, 22};
    //int[] a = {-5, -25, -12, -15, 1};
    //int[] a = {1, 1, 0, 1, 0, 0};
    //int[] a = {1932, -25, 12, 12, 3};
    //int[] a = {4, 23, -12, 0, 11, 1, 4, 99, 32, 14, 19, 23};
    //Sorts.swap(a , 0 , 4);
    //Sorts.bubbleSort(a);
    //Sorts.bubblePlace(a , 1);
    //Sorts.bubblePlace(a , 3);
    System.out.println(Sorts.isEqual(a , c));
    
    Sorts.bubbleSort(a);
String temp = "";
	for(int counter = 0; counter < a.length; counter++ ) {
	    {temp = temp + a[counter] + " ";}}
	System.out.println(temp);

    IntervalSort.Interval(b);
    temp = "";
       	for(int counter = 0; counter < b.length; counter++ ) {
	    {temp = temp + b[counter] + " ";}}
	System.out.println(temp);

  
  }
}