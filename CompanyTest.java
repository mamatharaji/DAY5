package Company;

import Branch.Branch;

public class CompanyTest 
{
	class Company
	{
		int companyCode;
		String companyName;
		String placeOfCompany;
		private Branch br=new Branch();
		public Company(int companyCode, String companyName, String placeOfCompany, Branch br)
		{
			super();
			this.companyCode = companyCode;
			this.companyName = companyName;
			this.placeOfCompany = placeOfCompany;
			this.br = br;
		}
		@Override
		public String toString() {
			return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", placeOfCompany="
					+ placeOfCompany + ", br=" + br + "]";
		}
		public int getCompanyCode() {
			return companyCode;
		}
		public void setCompanyCode(int companyCode) {
			this.companyCode = companyCode;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getPlaceOfCompany() {
			return placeOfCompany;
		}
		public void setPlaceOfCompany(String placeOfCompany) {
			this.placeOfCompany = placeOfCompany;
		}
		public Branch getBr() {
			return br;
		}
		public void setBr(Branch br) {
			this.br = br;
		}
		
		
		
	}
}
