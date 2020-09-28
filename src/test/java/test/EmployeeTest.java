package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testgetMonthlyBasic()  {
	       double expectedValue=10000;
	       Employee employee= new Employee("Kriti",1,10000,10);
	       double actualValue=employee.getMonthlyBasic();
	       double delta = 0;
		assertEquals(expectedValue, actualValue, delta);
	    }
	
	
	@Test
	public void testgetAnnualBasic()  {
	       double annualBasic = 120000;
	       Assert.assertTrue(annualBasic>10000);
	       Assert.assertFalse(annualBasic <= 10000);
	       
	    }
	
	@Test
	public void testgetMonthlyGrossSalary()  {
		Employee employee= new Employee("Kriti",1,10000,10);
	       assertEquals(17050,employee.getMonthlyGrossSalary(),0);
	    }
	
	@Test
	public void testgetAnnualGrossSalary()  {
		Employee employee= new Employee("Kriti",1,10000,10);
	       assertEquals(204600,employee.getAnnualGrossSalary(),0);
	    }
	
	@Test
	public void testgetMonthlyDeductions()  {
		Employee employee= new Employee("Kriti",1,10000,10);
	       assertEquals(1100.0000149011612,employee.getMonthlyDeductions(),0);
	    }
	
	
	@Test
	public void testgetMonthlyTakeHome () {
		Employee employee= new Employee("Kriti",1,10000,10);
	       assertEquals(15949.999985098839,employee.getMonthlyTakeHome(),0);
	    }
	
	public void testgetAnnulaTakeHome () {
		Employee employee= new Employee("Kriti",1,10000,10);
	       assertEquals(191399.99982118607,employee.getAnnualTakeHome(),0);
	    }
	
	
	


}
