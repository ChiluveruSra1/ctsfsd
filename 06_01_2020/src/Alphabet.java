
public class Alphabet {
	
	private char[] s=new char[26];
	private String str;
	private char[] tempArray;
	
	public char[] createArray() {
		for(int i=0;i<s.length;i++) {
			s[i]=(char)('a'+i);
		}
		return s;
	}
	
	public void displayArray() {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+",");
		}
	}
	
	public void convertStringToArray(String str) {
		this.str=str;
		tempArray=str.toCharArray();
	}
	
	public void displayStringToArray() {
		//for(char c:tempArray) {
		int count=0;
		for(int i=0;i<tempArray.length;i++) {
			System.out.println(tempArray[i]);
			char ch=tempArray[i];
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') 
				count++;
		}
		System.out.println("no. of vowels: "+count);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet a=new Alphabet();
		a.convertStringToArray("sravan kumar chiluveru");
		a.displayStringToArray();
	}

}
