import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String> {
    private String[] dump; 
    private int end; 
    private int current = 0;
    public SuperArrayIterator (String[] a , int stop){
	dump = a;			       
	end = stop - 1;
	current = 0; }
    public void remove() {
	throw new UnsupportedOperationException (); }

    public String next() {
	if(hasNext()){
	    current++;}	else{System.exit(0);}
	return dump[current - 1];}

    public boolean hasNext() {
	if (current <= end) {return true;}
	else{ return false;} }
}