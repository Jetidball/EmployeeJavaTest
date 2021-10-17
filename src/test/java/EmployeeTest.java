import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {
    Employee employee;
    @Before
    public void setup() throws ParseException {
        employee = new Employee();

    }

    @Test
    public void testAddingEmployee() throws ParseException {
        Date dateHired = new SimpleDateFormat( "yyyyMMdd" ).parse( "20100520" );
        employee.setName("jim");
        employee.setId(1);
        employee.setManagerFlag(true);
        employee.setDateHired((dateHired));

        assertEquals(employee.getName(),"jim");
        assertEquals(employee.getManagerFlag(),true);
        assertEquals(employee.getDateHired(),dateHired);
        assertEquals(employee.getId(),1);

//        employee.getName();
//        employee.getManagerFlag();
//        employee.getDateHired();
//        employee.getId();

    }




}
