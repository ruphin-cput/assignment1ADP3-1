package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ruphin Bolonda
 * Student Number : 218321392.
 * Description : Test Class used in my Covid19Tracker App
 */

class Covid19TrackerTest {

    @Test
    public void testAddStudent() throws Exception {
        /*Arrange*/
        Covid19Tracker covid19Tracker=new Covid19Tracker();
        covid19Tracker.addStudent(new Student("Lungile","Feza","218321314","218321314@mycput.ac.za",25,true));
        covid19Tracker.addStudent(new Student("Sipho","Lona","218321315","218321315@mycput.ac.za",19,false));
        /*Act*/
        int size = covid19Tracker.students.size();
        /*Assert*/
        assertEquals(2,size,"Incorrect collection size ");
    }

    @Test
    public void testIfObjectsAreSame() throws Exception {
        /*Arrange*/
        Covid19Tracker covid19Tracker1=new Covid19Tracker();
        Covid19Tracker covid19Tracker2=new Covid19Tracker();
        covid19Tracker1.addStudent(new Student("Peter","Booysen","218321316","218321316@mycput.ac.za",20,true));
        covid19Tracker2.addStudent(new Student("Jewish","Trevor","218321317","218321317@mycput.ac.za",22,false));

        /*Assert*/
        assertSame(covid19Tracker1, covid19Tracker2,"Failed because objects are not same ");
    }

    @Test
    public void testEmpty() throws Exception{
        try {
            testAddStudent();
            fail("Should have thrown an exception");
        } catch (final RuntimeException e) {
            assertTrue(true);
        }
    }


    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testDataAccessTimeout(){
        Covid19Tracker covid19Tracker1=new Covid19Tracker();
        covid19Tracker1.addStudent(new Student("Jonathan","Vortex","218321317","218321317@mycput.ac.za",21,true));
        String studentNumber = covid19Tracker1.students.get(0).getStudentNumber();
    }

    @Disabled
    @Test
    public void testGetStudentNumber() throws Exception {
        /*Arrange*/
        Covid19Tracker covid19Tracker1=new Covid19Tracker();
        covid19Tracker1.addStudent(new Student("Assan","Guru","218321318","218321318@mycput.ac.za",26,true));
        /*Act*/
        String studentNumber = covid19Tracker1.students.get(0).getStudentNumber();
        /*Assert*/
        assertNotNull("Returned null for existing student", studentNumber);
    }
}