import java.io.*;
import java.util.*;
public class Barcode {

private String Zip;
    public Barcode (String ZipCode) {
	if(ZipCode.length() != 5) {
	    System.out.println("Nopey"); 
	    throw new IllegalArgumentException();
	}
        Zip = ZipCode;}
    //ZIPCODE STATIC HELPERS N'SHIT
    public static String morph(String str) {
		String[] Bars = {"||:::|",":::||","::|:|", "::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
		return Bars[Integer.parseInt(str)];
    }
     public static int getSum (String zip) {
	int temp = 0; 
	for (int counter = 0; counter < zip.length() - 1; counter++) {
	    temp = temp + Integer.parseInt(zip.substring(counter , counter + 1));
	}
	return temp % 10;}
	    

    public static String toCode (String ZipCode) {
	String temp = ZipCode + getSum(ZipCode);
	String Final = "";
	if(ZipCode.length() != 5) {
	    System.out.println ("Nope");
	    throw new IllegalArgumentException();
	}
	
	for(int counter = 0; counter < temp.length() - 1 ; counter++ ) {
	    Final = Final + morph(temp.substring(counter, counter + 1));}
	return "|" +  Final + "|" ;}

    //TOSTRING

    public String toString() {
	return toCode(Zip) + " (" + getZip() + ")";}

    //BARCODE STATIC HELPERS N'SHIT 
    public static String ZipMorph (String str) {
	String fill = "";
	for(int counter = 0 ; counter < 10 ; counter ++) {
	    if(str.equals(morph(fill + counter))) {
		fill = fill + counter;}}
	    return fill;}
    public static String toZip (String code) {
    	String dump = "";
    	for (int counter = 1; counter < code.length() - 4; counter = counter + 5) {
    	    dump = dump + ZipMorph(code.substring(counter, counter + 5));}
	return dump; }



    //GRABBERS 
    public String getZip() {
	return Zip; }
    
    public String getCode() {
	return toCode(Zip);}

    
    

	

}
