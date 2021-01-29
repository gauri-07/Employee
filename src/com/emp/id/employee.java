package com.emp.id;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class employee implements Comparable<employee>{
	private int employeeid;
    public String employeename;
	protected String location;
	private int age;
	private int number;
	public int getemployeeid() {
		return employeeid;
		
	}
	
	public void setemployeeid(int employeeid)
	{
		this.employeeid=employeeid;
	}
	 
	public String getemployeename() {
		return employeename;
		
	}
	public void setemployeename(String employeename)
	{
		this.employeename=employeename;
	
	}
	protected String getlocation() {
		return location;
		
	}
	protected void setlocation(String location)
	{
		this.location=location;
	
	}
	private int getage() {
		return age;
		
	}
	private void setage(int age) {
		this.age=age;
		
	}
    private int getnumber() {
    	return number;
    }
    private void setnumber(int number)
    {
    	this.number=number;
    }
	public static void main(String[] args) {
		employee emp=new employee();
		emp.setemployeeid(12);
		emp.setemployeename("Gauri");
		emp.setlocation("nerul");
		emp.setage(22);
		emp.setnumber(12334444);
		System.out.println("emp id"+emp.getemployeeid()+"employee name"+emp.getemployeename()+"emp location"+emp.getlocation()+"emp age"+emp.getage()+
				"employee number"+emp.getnumber());
		
		employee emp1=new employee();
		emp1.setemployeeid(15);
		emp1.setemployeename("Gauri");
		emp1.setlocation("nerul");
		emp1.setage(22);
		emp1.setnumber(12334444);
		System.out.println("emp id"+emp.getemployeeid()+"employee name"+emp.getemployeename()+"emp location"+emp.getlocation()+"emp age"+emp.getage()+
				"employee number"+emp.getnumber());
		List<employee> emp11=new ArrayList<>();
		Collections.sort(emp11);
		for(employee e:emp11) {
			System.out.println(e.getemployeeid()+"\t--"+e.getemployeename());
		}
	}
	@Override
	public int compareTo(employee o) {
	if (this.employeeid == o.employeeid)
	return 0;
	else if (this.employeeid < o.employeeid)
	return 1;
	else
	return -1;
	}

}

