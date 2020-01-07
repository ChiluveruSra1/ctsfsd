package comm.example;

import static java.lang.System.out;

import java.time.LocalDate;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor 															// Anotations

@Getter
@Setter
public class Account {

	public String acNo;
	public AcType acType;
	public LocalDate doO;
	public double amount;

	private static Account ac;
	static {
		ac = new Account();
	}

	public static Account crtAc(AcType acType, double amount) {
		ac.setAcNo(UUID.randomUUID().toString());
		ac.setAcType(acType);
		ac.setAmount(amount);
		ac.setDoO(LocalDate.now());
		return ac;
	}

	public void displayAc() {
		String no[]=getAcNo().split("-");
		out.println("\nA/c No.: 111" + (no[0]+no[1]) + "\nA/c Type: " + acType + "\nDate of Opening: " + doO + "\nAmount: " + amount+"\n\n");
	}

}
