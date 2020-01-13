package assignment.one;

public class UserMainCode {

	private String password;
	private static boolean checkP = false;

	/*
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 * 
	 * public boolean isCheckP() { return checkP; }
	 * 
	 * public void setCheckP(boolean checkP) { this.checkP = checkP; }
	 */
	public static boolean checkPassword(String password) {
		char[] c = new char[15];
		for (int i = 0; i < password.length(); i++) {
			c[i] = password.charAt(i);
			System.out.print(c[i]);
		}
		System.out.println("\n\n");

		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

		if (password.length() < 8) {
			// System.out.println("Invalid Password");
			checkP = false;
			return checkP;

		}

		for (int k = 0; k < c.length; k++) {
			if (c[k] >= (char) ('A') && c[k] <= (char) ('Z')) {
				count1++;
				
				if(count1>1)
					continue;
				
				checkP = true;
				// System.out.println(c[k]);
				continue;
			} else if (c[k] >= (char) ('a') && c[k] <= (char) ('z')) {
				count2++;

				if(count2>1)
					continue;
				
				checkP = true;
				continue;
			} else if (c[k] <= 9 && c[k] >= 0) {
				count3++;

				if(count3>1)
					continue;
				
				checkP = true;
				// System.out.println(c[k]);
				continue;
			} else if (c[k] == '!' || c[k] == '@' || c[k] == '#' || c[k] == '$' || c[k] == '%' || c[k] == '&') {
				count4++;

				if(count4>1)
					continue;
				
				checkP = true;
				// System.out.println(c[k]);
				continue;
			} else
				checkP = false;
		}

		//System.out.println(count1 + "   " + count2 + "   " + count3 + "\n\n");

		if (count1 > 0 && count2 > 0 && count3 > 0 && count4 > 0)
			checkP = true;
		else
			checkP = false;
		return checkP;
	}
}
