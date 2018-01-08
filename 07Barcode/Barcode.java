import java.io.*;
import java.util.*;

public class Barcode implements Comparable<Barcode> {
private static String[] Bars = {"||:::",":::||","::|:|", "::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
private String Zip;
    public Barcode (String ZipCode) {
	if(ZipCode.length() != 5) {
	    System.out.println("Nope"); 
	    throw new IllegalArgumentException();
	}
	for(int counter = 0; counter < ZipCode.length(); counter ++){
	    if(Character.isDigit(ZipCode.charAt(counter)) == false) {
		throw new IllegalArgumentException();}}
        Zip = ZipCode;}
    //ZIPCODE STATIC HELPERS N'SHIT
    public static String morph(String str) {
		return Bars[Integer.parseInt(str)];
    }
     public static int getSum (String zip) {
	int temp = 0; 
	for (int counter = 0; counter < zip.length(); counter++) {
	    temp = temp + Integer.parseInt(zip.substring(counter , counter + 1));
	    
	}
	
	return temp % 10;}

	 
	    

    public static String toCode (String ZipCode) {
	for(int counter = 0; counter < ZipCode.length(); counter ++){
	    if(Character.isDigit(ZipCode.charAt(counter)) == false) {
		throw new IllegalArgumentException();}}
	String temp = ZipCode + getSum(ZipCode);
	System.out.println(temp);
	String Final = "";
	if(temp.length() != 6) {
	    System.out.println ("Nope");
	    throw new IllegalArgumentException();
	}
	
	
	for(int counter = 0; counter <= temp.length() - 1 ; counter++ ) {
	    Final = Final + morph(temp.substring(counter, counter + 1));}
	return "|" +  Final + "|" ;}

    //TOSTRING

    public String toString() {
	return toCode(Zip) + " (" + getZip() + ")";}

    //BARCODE STATIC HELPERS N'SHIT 
    public static String ZipMorph (String str) {
	//System.out.println(str);
        //if(str.length() != 5 ){
	//    throw new IllegalArgumentException() ;}
	String fill = "";
	for(int counter = 0 ; counter <= 9 ; counter ++) {
	    if(str.equals(Bars[counter])){
		fill = fill + counter;}}	
    return fill;}
    public static String toZip (String code) {
	if(code.length() != 32) {throw new IllegalArgumentException();}
	if(!(code.substring(code.length() - 1, code.length()).equals("|")) || !(code.substring(0 , 1).equals("|"))) {throw new IllegalArgumentException();}
	String temp = code.substring(1 , code.length() - 1); 
    	String dump = "";
    	for (int counter = 0; counter < temp.length() - 4; counter = counter + 5) {
	    //System.out.println(dump);
	    //System.out.println(temp.substring(counter , counter + 5));
    	    dump = dump + ZipMorph(temp.substring(counter, counter + 5));}
	System.out.println(getSum(dump.substring(0 , dump.length() - 1)));
	System.out.println(dump.substring(dump.length() - 1 , dump.length()));
	System.out.println(dump.substring(0 , dump.length() - 1));
	
	if(!(dump.substring(dump.length() - 1, dump.length()).equals("" + getSum(dump.substring(0 , dump.length() - 1)))))
	{throw new IllegalArgumentException();}

	else{return dump.substring(0 , dump.length()- 1);}}



    //GRABBERS 
    public String getZip() {
	return Zip; }    
    public String getCode() {
	return toCode(Zip);}

    //COMPARETO 
    public int compareTo (Barcode a) {
	return Zip.compareTo(a.getZip());}
    
    

	

}
