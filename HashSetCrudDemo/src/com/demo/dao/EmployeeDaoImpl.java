package com.demo.dao;
import java.util.Comparator;
import java.util.TreeSet;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;
import com.demo.beans.Vendor;

public class EmployeeDaoImpl implements EmployeeDao{
	
	// we create set of employee type not person type because later we use downcasting
	static Set<Employee> hs;
	static {
		
		hs = new HashSet<>();
		hs.add(new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		hs.add(new SalariedEmployee(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		hs.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hs.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		hs.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		hs.add(new ContractEmployee(13,"Ajit","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		
	}
	

	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		hs.add(e);
		//System.out.println(hs);
		//elst.stream().forEach(System.out::println);
	}


	@Override
	public Set<Employee> getAll() {
		// TODO Auto-generated method stub
		System.out.println("hee");
		return hs;
	}


	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		for(Employee e:hs)
		{
			if(e.getPid() == id)
			{
				return e;
			}
		}
		
		return null;
	}


	@Override
	public Set<Employee> sortByName() {
		// TODO Auto-generated method stub
	
		TreeSet<Employee> ts=new TreeSet<>();
		for(Employee e:hs)
		{
			ts.add(e);
		}
		return ts;
	}


	@Override
	public Set<Employee> sortBySalary() {
		// TODO Auto-generated method stub
		Comparator <Employee> mysal = (o1,o2) ->
		{
			int sal1=0 , sal2=0;
			
			if(o1 instanceof SalariedEmployee)
			{
				sal1 = ((SalariedEmployee) o1).getSal();
				
			}

			else if(o1 instanceof ContractEmployee)
			{
				sal1 = ((ContractEmployee) o1).getCharges();
				
			}
			else
			{
				sal1 = ((Vendor)o1).getAmount();
			}
			
			if(o2 instanceof SalariedEmployee)
			{
				sal2 = ((SalariedEmployee) o2).getSal();
				
			}

			else if(o2 instanceof ContractEmployee)
			{
				sal2 = ((ContractEmployee) o2).getCharges();
				
			}
			else
			{
				sal2 = ((Vendor)o2).getAmount();
			}
             
			
			return (int)(sal2 - sal1); 
			
			
		};
		
		TreeSet<Employee> ts = new TreeSet<>(mysal);
		
		for(Employee e:hs)
		{
			ts.add(e);
		}
		
		
		return ts;
	}


	@Override
	public boolean modifySalById(int id, int sal) {
		// TODO Auto-generated method stub
		Employee e1 = getById(id);
		
		if(e1!= null)
		{
			if(e1 instanceof SalariedEmployee)
			{
				((SalariedEmployee) e1).setSal(sal);
			}
			else if(e1 instanceof ContractEmployee) 
			{
				((ContractEmployee)e1).setCharges(sal);
				
			}
			else 
			{
				((Vendor)e1).setAmount(sal);
			}
			return true;
		}
		
		return false;
	}


	


	

	
	
	
}
