/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import DAL.CourseDAO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
        
    }
    
    CourseDAO c = new CourseDAO();
    
    @Test
    public void testdfsdfs(){
        boolean expected = false;
        boolean actual = c.getAll().isEmpty();
        assertEquals(expected, actual);
    }
    
}
