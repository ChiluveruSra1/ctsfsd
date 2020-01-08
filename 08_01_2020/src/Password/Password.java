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
		Password p = new Password(args[0]);
		if (args[0].length() <= 8 || args[0].length() >= 15) {
			throw new PasswordException("length mismatch");

		}

		char[] c = new char[15];
		for (int i = 0; i < args[0].length(); i++) {
			c[i] = args[0].charAt(i);
			// System.out.println(c[i]);
		}
int l=0;
		for (int i = 0; i < c.length; i++) {
			//for (int l = 0; l < 26; l++) {
				while ((c[i] == (char) ('a' + l))) {
					System.out.println("1");
					l++;
					throw new PasswordException("invalid password\nthank you");
				}
				while (c[i] == (char) ('A' + l)) {
					System.out.println("2");
					l++;
					throw new PasswordException("invalid password\nthank you");
				}
				/*
				 * else System.out.println("xxxx");
				 *//*
					 * )||l>26 || (c[k]<=9&&c[k]>=0) ) { //System.out.println(c[l]); throw new
					 * PasswordException("invalid password\nthank you");
					 */
			}

		System.out.println(args[0]);

	}

}
