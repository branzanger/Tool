package Random;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class DebtCalculator {

	public static void main(String[] args) {

		String[][] debt = { { "Alex", "Blake", "2" }, { "Blake", "Alex", "2" }, { "Casey", "Alex", "5" },
							{ "Blake", "Casey", "7"}, { "Alex", "Blake", "4" }, { "Alex", "Casey", "4" } };

		smallestNegativeBalance(debt);

	}

	public static void smallestNegativeBalance(String [][] debt) {
		
		HashMap<String, Integer> bal = new HashMap<String, Integer>();
		ArrayList<String> keys = new ArrayList<String>();
		
		//makes a hashmap for people's balance and an ArrayList for the keys
		for(int i=0;i<debt.length;i++) {
			if(!bal.containsKey(debt[i][0])||!bal.containsKey(debt[i][1])) {
				bal.put(debt[i][0], 0);
				keys.add(debt[i][0]);
				//if They add in Lenders that aren't in the Borrowers section(doesn't work)
				//bal.put(debt[i][1], 0);
				//keys.add(debt[i][1]);
			}
		}
		
		//calculates the debt
		for(int i=0;i<debt.length;i++) {
			//subtracts amount owed to the debtee from balace
			int newBalance = bal.get(debt[i][0]) - Integer.parseInt(debt[i][2]);
			bal.put(debt[i][0], newBalance);
			//adds amount owed from debtor to balance
			newBalance = bal.get(debt[i][1]) + Integer.parseInt(debt[i][2]);
			bal.put(debt[i][1], newBalance);
			
		}
		
		Set<Map.Entry<String, Integer>> list = bal.entrySet();
		
		System.out.println(keys);
		System.out.println(bal);
	}

}
© 2022 GitHub, Inc.
Terms
Privacy
Security
Stat
