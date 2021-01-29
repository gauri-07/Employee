package com.emp.id;

public class Manager extends employee {
	public String Deptname;
	private int deptid;
	
	public String GetDeptname()
	{
		return Deptname;
		
	}
	public void setDeptname(String deptname)
	{
	    this.Deptname=deptname;
	}
   private int getdeptid()
   {
	   return deptid;
   }
   private void setdeptid(int deptid)
   {
	   this.deptid=deptid;
   }
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setDeptname("gauri");
		m.setdeptid(111);
		System.out.println("id is"+m.getdeptid());
		System.out.println("name is"+m.GetDeptname());
 
	}

}
