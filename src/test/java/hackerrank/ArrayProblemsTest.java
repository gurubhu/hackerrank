package hackerrank;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayProblemsTest {

	@Test
	public void lonelyIntegerTest(){
		Integer[] a = {0, 0, 1, 2, 1};
		int element = ArrayProblems.lonelyInteger(Arrays.asList(a));
		assertEquals(2,element);		
	}
	
	@Test
	public void gradingStudentsTest(){
		Integer[] a = {84, 29, 57};
		List<Integer> results = ArrayProblems.gradingStudents(Arrays.asList(a));
		System.out.println(results);	
	}
}
