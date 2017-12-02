public class ReferenceBook extends LibraryBook {
    private String Collection;

    public ReferenceBook (String guy , String name, String thing , String shelf, String collect){
	super(guy , name , thing , shelf); 
	setCollection(collect);
    }
    public String getCollection() {
	return Collection;}
    
    public void setCollection(String collect){
	Collection = collect;}

    public void checkout(String thing1 , String thing2) {
	//	System.out.println("Cannot check out a reference book");}
	System.out.println ("Cannot check out a reference book");}
    public void returned() {
	System.out.println("Reference book could not have been checked out -- return impossible");}
    public String circulationStatus () {
	return "non-circulating reference book"; }
    
     public String toString () {
	 return getTitle() + " " + getAuthor() + " " + getISBN() + " " + getcallNumber() + " " + circulationStatus() + " " + getCollection();
     }
 }

     
	