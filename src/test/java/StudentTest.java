import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student stShort = new Student("Rafael", "Silva", 30, 'M');
	Student stLong = new Student("Rafael", "Silva", 30, 'M', 5.3, 8.6, 7.2);
	public static final Logger LOG = Logger.getLogger(Student.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	
	@Test
	public void testStudentConstructorShort (){
		LOG.info("Testing the method Constructor with 4 parameters");
		assertEquals(stShort.getFirstName(),"Rafael");
		assertEquals(stShort.getLastName(),"Silva");
		assertEquals(stShort.getAge(), 30);
		assertEquals(stShort.getGender(), 'M');
	}
	
	@Test
	public void testStudentConstructorLong (){
		LOG.info("Testing the method Constructor with 6 parameters");
		assertEquals(stLong.getFirstName(),"Rafael");
		assertEquals(stLong.getLastName(),"Silva");
		assertEquals(stLong.getAge(), 30);
		assertEquals(stLong.getGender(), 'M');
		assertEquals(stLong.getFirstGrade(), 5.3, 0.000001);
		assertEquals(stLong.getSecondGrade(), 8.6, 0.000001);
		assertEquals(stLong.getThirdGrade(), 7.2, 0.000001);
		
	}

	@Test
	public void testSetterAndGetterForFirstGrade (){
		double grade = Double.valueOf(df.format(random.nextDouble()*10));
		stLong.setFirstGrade(grade);
		assertEquals(stLong.getFirstGrade(), grade, 0.00001);
		LOG.info("Testing setter and getter for first grade with: " + grade);
	}
	
	@Test
	public void testSetterAndGetterForSecondGrade (){
		double grade = Double.valueOf(df.format(random.nextDouble()*10));
		LOG.info("Testing setter and getter for second grade with: " + grade);
		stLong.setSecondGrade(grade);
		assertEquals(stLong.getSecondGrade(), grade, 0.00001);
	}
	
	@Test
	public void testSetterAndGetterForThirdGrade (){
		double grade = Double.valueOf(df.format(random.nextDouble()*10));
		LOG.info("Testing setter and getter for third grade with: " + grade);
		stLong.setThirdGrade(grade);
		assertEquals(stLong.getThirdGrade(), grade, 0.00001);
	}
	
	@Test
	public void testSetterAndGetterForAverageGrade (){
		double grade = (stLong.getFirstGrade()+stLong.getSecondGrade()+stLong.getThirdGrade())/3;
		// double grade = Double.valueOf(df.format(random.nextDouble()*10));
		LOG.info("Testing setter and getter for average grade with: " + grade);
		stLong.setAverageGrade(grade);
		assertEquals(stLong.getAverageGrade(), grade, 0.00001);
	}
	
	@Test
	public void testCalculateAverageWithOneParameter (){
		double sum = (stLong.getFirstGrade() + stLong.getSecondGrade() + stLong.getThirdGrade());
		double average = sum/3;
		/*stLong.setAverageGrade(average);*/
		LOG.info("Testing method calculate average grade with: " + average);
		assertEquals(stLong.calculateAverage(stLong.getFirstGrade()), average, 0.000001);		
	}
	
	@Test
	public void testCalculateAverageWithoutParameters(){
		double sum = (stLong.getFirstGrade() + stLong.getSecondGrade() + stLong.getThirdGrade());
		double average = sum/3;
		/*stLong.setAverageGrade(average);*/	
		LOG.info("Testing method calculate average grade with: " + average);
		assertEquals(stLong.calculateAverage(), average, 0.000001);		
	}
	

	@Test
	public void testCalculateAverageWithThreeParameters(){
		double sum = (stLong.getFirstGrade() + stLong.getSecondGrade() + stLong.getThirdGrade());
		double average = sum/3;
		/*stLong.setAverageGrade(average);*/	
		LOG.info("Testing method calculate average grade with: " + average);
		assertEquals(stLong.calculateAverage(stLong.getFirstGrade(),stLong.getSecondGrade(),stLong.getThirdGrade()), average, 0.000001);		
	}
	
}
