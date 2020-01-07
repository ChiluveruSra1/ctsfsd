
public class MultiDA {

	public static void main(String[] args) {
		int c=0;
		int[][] md=new int[3][];
		md[0]=new int[4];
		md[1]=new int[2];
		md[2]=new int[7];
		
		for(int i=0;i<md.length;i++) {
			for(int j=0;j<md[i].length;j++) {
				md[i][j]=c++;
			}
		}
		for(int i=0;i<md.length;i++) {
			for(int j=0;j<md[i].length;j++) 
				System.out.print(md[i][j]+" ");
			System.out.println();
	}
	}
}