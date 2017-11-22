//Ryan Aday helped me a lot for the remove and the add methods, because I had issues in using size()
public class SuperArray {
    private int size = 0;
    private String[] data = new String [0];
    public SuperArray(int startingcapacity) {
	data = new String [startingcapacity] ;
	
	
    }
    public void clear() { 
	data = new String [size];
	size = 0;
    }
    public int size() { 
	return size;}
   
    public boolean add(String str){
	String[] temp = new String [size + 1];
	for (int counter = 0; counter < size; counter ++ )
	    {temp[counter] = data[counter];}
	data = temp;
	size ++; 
	data[size - 1] = str;
	return true; }
    public boolean isEmpty() {
	for (int counter = 0; counter < size(); counter ++){
	    if (data[counter] != null){return false;}
	}
	return true; 
    }
   
    public String toString () { 
        String dump = "";
	for (int counter = 0; counter < size(); counter ++)
	    {dump = dump + data[counter];
		if(counter < size() - 1) 
			{dump = dump + ",";}
	    }
	return "[" + dump + "]" ; 
    }
    
    public String get(int index) {
	if(index < 0 || index >= size())
	    {System.out.println ("error");
		return null;}
	return data[index];}
   
    public String set(int index, String element){
	throw new UnsupportedOperationException();
	/*if(index < 0 || index >= size())
	    {System.out.println ("error");
		    return null;}
	String temporary = data[index];
	    data[index] = element;    
	    return temporary;}*/ }
    private void resize(){
	 String [] temp = new String[size + size/2];
	 for(int counter = 0; counter < size(); counter ++){
	    temp[counter] = data[counter];}
	 data = temp; }
    public boolean contains(String element){
	for (int counter = 0; counter < data.length; counter++ ) 
	    {if (data[counter] == element) {return true;}}
	return false;}
    public int indexOf(String target){
	for(int counter = 0 ; counter < size(); counter++) 
	    {if (data[counter] == target) {return counter;}}
       	return -1;}
    public int lastindexOf(String target){
	int count = 0; 
	for (int counter = 0; counter < size(); counter++)
	    {if (data[counter] == target) {count = counter;}}
	return count;}
    public void add(int index, String element){
	if (index < 0 || index > size())
	    {System.out.println("Error");}//if out of bounds
	else{
	String [] temp = new String[size + 1];
	boolean addone = false; 
	for (int counter = 0; counter < size(); counter ++)
	    {if (counter == index) {addone = true;}
		if (addone == true)
		    {temp[counter + 1] = data[counter];}
		if (addone == false)
		    {temp[counter] = data[counter];}
	    }
	size = temp.length;
	temp[index] = element;
	data = temp; }}
    public String remove(int index){
	if(index < 0 || index >= size())
	    {System.out.println("Error");
		return null;}
	else { 
	    
	    String value = data[index];
	    String[] temp = new String [size() - 1];
	    boolean subtractone = false; 
	    for (int counter = 0; counter < size() - 1; counter ++){
		if(counter == index) {subtractone = true;}
		if(subtractone == true){
		    temp[counter] = data[counter + 1];}
		if(subtractone == false){
		    temp[counter] = data[counter];}
	    }
	    size = temp.length;
	    data = temp;
	    return value;}
    }	
    public boolean remove (String str){
	String [] temp = new String [size() - 1];
	boolean lever = false; 
	boolean trigger = false; 
	for (int counter = 0; counter < size(); counter ++)
	    {if(data[counter] == str){lever = true;}}
       
	if (lever == true){
	for (int counter = 0 ; counter < size() - 1 ; counter ++){
	    if (data[counter] == str) {trigger = true;}
	    if (trigger == false) {temp[counter] = data[counter];}
	    if (trigger == true) {temp[counter] = data[counter + 1];}
	}data = temp;
	size = size - 1;
	return true; 
	}
	else{return false;}
    }
	    
	
}
    	
