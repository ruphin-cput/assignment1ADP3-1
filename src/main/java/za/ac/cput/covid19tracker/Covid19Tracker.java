package za.ac.cput.covid19tracker;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ruphin Bolonda
 * Student Number : 218321392.
 * Description : Controller Class used in my Covid19Tracker App
 */
public class Covid19Tracker {

    ArrayList<Student> students=new ArrayList<Student>();

    public  void addStudent(Student student){
        students.add(student);
    }

    public boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(email);
        return m.matches();
    }
}
