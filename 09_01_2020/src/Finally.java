
public class Finally {

	public static void main(String[] args) {
		int c=0;
		while(true) {
			try {
				if(c++==0) {
					throw new Exception();}
				}catch(Exception e){
					e.printStackTrace();}
			finally {
				System.out.println("finally block "+c);
				if(c==3) 
					break;
				}
			}
		}}
