package spring_ex04;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.ex04.Student;
import com.spring.ex04.StudentInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:appContext.xml"})
public class StudentInfoTest {
	@Autowired
	StudentInfo studInfo;
	
	@Autowired
	ApplicationContext ac;
	
	@Test
	public void testGetStudent() {
//		fail("Not yet implemented");
		
		Student stud = studInfo.getStudent();
		assertEquals(ac.getBean("student1", Student.class), stud);
	}

}
