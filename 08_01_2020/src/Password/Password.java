package Password;

public class Password {

	private String password;
	
	public Password(String password) {
		super();
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) throws PasswordException {
		Password p=new Password(args[0]);
		if(args[0].length()<=8 || args[0].length()>=15) {
			throw new PasswordException("length mismatch");
			
		}
		
		char[] c=new char[15];
		for(int i=0;i<args[0].length();i++) {
			c[i]=args[0].charAt(i);
			System.out.print(c[i]);
		}
		System.out.println("\n\n");
		
		for(int k=0;k<c.length;k++) {
			for(int l=0;l<26;l++) {
				if(((c[k]==(char)('a'+l)) || (c[k]==(char)('A'+l))||(c[k]<=9&&c[k]>=0) )) {
					System.out.println(c[k]);
				}	
							throw new PasswordException("invalid password\nthank you");
			}
			}
		System.out.println(args[0]);
		
		
		
	}

}
