public class Driver {
    public static void main (String[]args){
	ReversedCharSequence a = new ReversedCharSequence("Hello");
	System.out.println(a.toString());
	System.out.println(a.length());
	System.out.println(a.subSequence(0 , 4));
	System.out.println(a.charAt(3));
}
}