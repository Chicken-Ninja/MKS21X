public class Book {
    private String Author = "";
    private String Title = "";
    private String ISBN = "";
    public Book () {}
    public Book (String guy , String name, String thing){
	Author = guy;
	Title = name;
	ISBN = thing;
    }
    public String getAuthor () {
	return Author;}
    
    public String getTitle () {
	return Title;}

    public String getISBN () {
	return ISBN;}

    public void setAuthor (String x) {
	Author = x; }

    public void setTitle (String x) {
	Title = x;}

    public void setISBN (String x) {
	ISBN = x;}

    public String toString () {
	return Title + " " + Author + " " + ISBN;}
}
    
    
