import Employee.remove_employee;
import org.junit.After;
import org.junit.Before;

import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class remove_employeeTest {

    remove_employee remove_employee;

    @Before
    void setUp() {
        remove_employee = new remove_employee();
    }

    public remove_employeeTest() {
        assertAll("remove employee page",
                () -> assertNotNull(remove_employee.frame),
                () -> assertNotNull(remove_employee.t),
                () -> assertNotNull(remove_employee.l1),
                () -> assertNotNull(remove_employee.l2),
                () -> assertNotNull(remove_employee.l3),
                () -> assertNotNull(remove_employee.l4),
                () -> assertNotNull(remove_employee.l5),
                () -> assertNotNull(remove_employee.l6),
                () -> assertNotNull(remove_employee.l7),
                () -> assertNotNull(remove_employee.l8),
                () -> assertNotNull(remove_employee.b),
                () -> assertNotNull(remove_employee.b1),
                () -> assertNotNull(remove_employee.b2),
                () -> assertNotNull(remove_employee.b3)
        );

        assertAll("Frame",
                () -> assertEquals("Remove Employee", remove_employee.frame.getTitle()),
                () -> assertEquals(null, remove_employee.frame.getLayout()),
                () -> assertEquals(Color.green, remove_employee.frame.getBackground()),
                () -> assertEquals(500, remove_employee.frame.getX()),
                () -> assertEquals(250, remove_employee.frame.getY()),
                () -> assertEquals(500, remove_employee.frame.getWidth()),
                () -> assertEquals(500, remove_employee.frame.getHeight()),
                () -> assertEquals(true, remove_employee.frame.isVisible())
        );


    }

    @After
    void tearDown() {
    }
}