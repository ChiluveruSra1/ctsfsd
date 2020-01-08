package exception;

public class Excep2 {

	public void calculate(String a) throws ArithmeticException, NumberFormatException {
		System.out.println("calculate mthd");
		System.out.println(Integer.parseInt(a) / 0);
	}

	public static void main(String[] args) {

		
		  try { System.out.println(args[9]); System.out.println(30 / 0); } catch
		  (ArrayIndexOutOfBoundsException e) {
		  System.out.println("within ArrayIndexOutOfBoundsException");
		  System.out.println(e.toString()); } catch (ArithmeticException e) {
		  System.out.println("within ArithmeticException"); } catch (Exception e) {
		  System.out.println(e.toString()); }
		 
		Excep2 e2 = new Excep2();
		try {
			e2.calculate(args[5]);
		} catch (Exception e) {
			//System.err.println(e.toString());
			e.printStackTrace();
		}

	}
}
