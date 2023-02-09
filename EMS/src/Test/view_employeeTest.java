import Employee.view_employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class view_employeeTest {
    view_employee view_employee;

    @Before
    public void setUp() {
        view_employee = new view_employee();
    }

    @Test
    public void view_employee() {
        assertAll("view employee",
                () -> assertNotNull(view_employee.frame),
                () -> assertNotNull(view_employee.t),
                () -> assertNotNull(view_employee.l1),
                () -> assertNotNull(view_employee.l2),
                () -> assertNotNull(view_employee.b1),
                () -> assertNotNull(view_employee.b2)
        );

        assertAll("frame",
                () -> assertEquals("View", view_employee.frame.getTitle()),
                () -> assertEquals(Color.green, view_employee.frame.getBackground()),
                () -> assertEquals(null, view_employee.frame.getLayout()),
                () -> assertEquals(450, view_employee.frame.getX()),
                () -> assertEquals(250, view_employee.frame.getY()),
                () -> assertEquals(500, view_employee.frame.getWidth()),
                () -> assertEquals(270, view_employee.frame.getHeight()),
                () -> assertEquals(true, view_employee.frame.isVisible())
        );

        assertAll("Label1",
                () -> assertEquals(0, view_employee.l1.getX()),
                () -> assertEquals(0, view_employee.l1.getY()),
                () -> assertEquals(500, view_employee.l1.getWidth()),
                () -> assertEquals(270, view_employee.l1.getHeight()),
                () -> assertEquals(null, view_employee.l1.getLayout())
        );
        ImageIcon i1 = (ImageIcon) view_employee.l1.getIcon();
        assertNotNull(i1);

        assertAll("Employee Id Label",
                () -> assertEquals("Employee Id", view_employee.l2.getText()),
                () -> assertEquals(40, view_employee.l2.getX()),
                () -> assertEquals(60, view_employee.l2.getY()),
                () -> assertEquals(250, view_employee.l2.getWidth()),
                () -> assertEquals(30, view_employee.l2.getHeight()),
                () -> assertEquals("serif", view_employee.l2.getFont().getName()),
                () -> assertEquals(30, view_employee.l2.getFont().getSize()),
                () -> assertEquals(true, view_employee.l2.getFont().isBold()),
                () -> assertEquals(Color.white, view_employee.l2.getForeground())
        );


    }

    @After
    public void tearDown() {
    }
}