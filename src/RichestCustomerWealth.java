
public class RichestCustomerWealth {

	public static int maximumWealth(int accounts[][]) {
		int maximumWealthSoFar = 0;
		
		for(int customer[] : accounts) {
			int currentWealth = 0;
			
			for(int bank : customer) {
				currentWealth += bank;
			}
			
			maximumWealthSoFar = Math.max(maximumWealthSoFar, currentWealth); // The Math.max built-in function will get the maximum value out of all values
		
		}
		return maximumWealthSoFar;
	}
	
	public static void main(String[] args) {
		int accounts[][] = new int[3][3];
		accounts[0][0] = 7;
		accounts[0][1] = 1;
		accounts[0][2] = 3;
		accounts[1][0] = 2;
		accounts[1][1] = 8;
		accounts[1][2] = 7;
		accounts[2][0] = 1;
		accounts[2][1] = 9;
		accounts[2][2] = 5;
		
		System.out.println("The maximum sum is: " + maximumWealth(accounts));
		
		// Time Complexity = O(n x m)
		// Space Complexity = O(1)
	}

}
