public class Driver {
    public static void main (String[] args) {
	Barcode a = new Barcode("11111");
	System.out.println(a);
	System.out.println(a.getCode());
	System.out.println(Barcode.toZip("|:::||:::||:::||:::||:::||:::|||"));
	System.out.println(Barcode.toCode("12121"));
	Barcode b = new Barcode ("21111");
	Barcode c = new Barcode ("12111");
	System.out.println(a.compareTo(c));
	System.out.println(b.compareTo(c));
	System.out.println(c.compareTo(a));
    }
}