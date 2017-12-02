public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
    
    public CirculatingBook (String guy , String name , String thing, String shelf) {
	super(guy , name , thing, shelf) ; 
	setCurrentHolder(null);
	setDueDate(null);
    }
    public String getCurrentHolder() {
	return currentHolder;}
    
    public String getDueDate() {
	return dueDate;}
    
    public void setCurrentHolder(String dude){
	currentHolder = dude;
    }

    public void setDueDate(String date) {
	dueDate = date;}

    public void checkout (String guy , String date) {
	setCurrentHolder(guy);
	setDueDate(date);}

    public void returned () {
	setCurrentHolder(null);
	setDueDate(null);
    }
    
    public String circulationStatus() {
	if(getCurrentHolder() == null && getDueDate() == null) {
	    return "Book is currently available on the shelves";}
	else{return getCurrentHolder() + " " + getDueDate();}
		}

    public String toString() {
	return getTitle() + " " + getAuthor() + " " + getISBN() + " " + getcallNumber() + " " + circulationStatus() + " " + getCurrentHolder() + " " + getDueDate();}
}