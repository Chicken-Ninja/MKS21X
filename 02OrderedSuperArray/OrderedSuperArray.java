public class OrderedSuperArray extends SuperArray{
     /*constructor initializes an empty List*/

    public OrderedSuperArray() {
	super();} 

  public OrderedSuperArray(int StartingCapacity){
      super(StartingCapacity);
 //Complete this.

  }

    public OrderedSuperArray(String[] ary) {
	super(ary.length);
	for (int x = 0; x < ary.length; x ++) 
	    {add(ary[x]);}}

  /*call the proper add.*/
  public void add(int index, String value){
    add(value);
  }

    private  int find(String value){
	if (size() == 0) {return 0;}
	for (int counter = 0 ; counter < size(); counter ++ ){

	    if(get(counter).compareTo(value) > 0) {return counter;}
	    if(get(counter).compareTo(value) == 0) {return counter;}
	}
	return size();}
    private int findBinary(String value) {
	if(size() == 0) {return 0;}
	if(get(size() / 2) .compareTo(value) ==  0){return size() / 2;}
	if(get(size()/ 2) .compareTo(value) > 0) {
	    for (int counter = size()/2 ; counter > 0; counter --){
		if(get(counter).compareTo(value) < 0) {return counter + 1;}
	    }
	    return 0;
	}
	else/* if(get(size() / 2).compareTo(value) < 0)*/{
		for(int counter = size() / 2; counter < size(); counter ++ ) {
		    if (get(counter).compareTo(value) > 0) {return counter - 1;}}
		return size();}
    }
     public int lastIndexOfBinary(String element){
	 int start = indexOfBinary(element);
	int finish = size();
	while (start != finish){
	    if (get((start + finish)/2).compareTo(element) > 0){
		finish = (start + finish) / 2;}
	    else if (get((start + finish)/2).equals(element)){
		if (start == size() - 1 || !(get((start + finish) / 2 + 1).equals(element))){
		    return (start + finish) / 2;
		}
		finish = (start + finish) / 2;
		start = (start + finish) / 2 - 1; 
	    }else {
		start = (start + finish) / 2 + 1;
	    }}
	if (get(start) != element){
	    return -1;}
	return start;}
    
     public int indexOfBinary(String element){
	 int start = 0;
	int finish = size();
	while (start != finish){
	    if (get((start + finish)/2).compareTo(element) > 0){
	        finish = (start + finish) / 2;
	    } else if (get((start + finish)/2).equals(element)){
		if (start == 0 || !(get(((start + finish) / 2) - 1).equals(element))){
		    return (start + finish) / 2;}
		finish = (start + finish) / 2;
		start = (start + finish) / 2 - 1; 
	    }else {
		start = (start + finish) / 2 + 1;
	    }}
	if (get(start) != element){
	    return -1;}
	return start;
    }	

       
  /*Write this method and any
    appropriate helper methods.*/
  public boolean add(String value){
      int place = find(value);
      super.add(place , value);
      return true;}
 
	
}


