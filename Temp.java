public class Temp {
    public static double CtoF (double temp) {
	return temp * (1.8) + 32;}

    public static double FtoC (double temp) {
	return (temp - 32) / 1.8;}
    
    
    public static void main(String[] args) {
	System.out.println(CtoF(-40.0));
	System.out.println(FtoC(212.0));
	System.out.println(CtoF(100.0));
    }
}