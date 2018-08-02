package com.techlabs.EmployeeReflection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class EmployeeTest {
	public static void main(String args[])
	{
		Employee emp1=new Employee("Shubham", "Computer", 100 );
		
		Class<Employee> cls = Employee.class;
		System.out.println("Name of Class:\t"+emp1.getClass()+"\n");
		
		Constructor<Employee>[] cons= (Constructor<Employee>[])cls.getDeclaredConstructors();
		System.out.println("Constructor"+cons[0].getParameterCount());
		for(Constructor<Employee> con: cons)
		System.out.println(con.toString());
		
		System.out.println("\n");
		Method[] methods = cls.getMethods();
		for(int i=0; i<methods.length;i++)
		{
		   if(methods[i].getName().startsWith("get")||methods[i].getName().startsWith("set"))
			System.out.println(methods[i].toString());
		   System.out.println(methods[i]);
		}
		
		
		

		System.out.println("\n");
		Field[] field = cls.getFields();
        for(int i=0; i<field.length;i++)
		System.out.println(field[i].getName());
		
        
	}

}
