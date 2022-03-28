package Branch;

public class Branch 
{
	 private int brCode;
	 private String brName;
	void printBranchdetails(int brCode, String brName)
	{
		System.out.println("Branch code is......."+brCode);
		System.out.println("Branch Name is......."+brName);
	}
	@Override
	public String toString() {
		return "Branch [brCode=" + brCode + ", brName=" + brName + "]";
	}
	public int getBrCode() {
		return brCode;
	}
	public void setBrCode(int brCode) {
		this.brCode = brCode;
	}
	public String getBrName() {
		return brName;
	}
	public void setBrName(String brName) {
		this.brName = brName;
	}
	
	
}
