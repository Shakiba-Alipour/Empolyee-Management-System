import Employee.remove_employee;
import org.junit.After;
import org.junit.Before;

import javax.swing.*;
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

        assertAll("Label 5",
                () -> assertEquals(0, remove_employee.l5.getX()),
                () -> assertEquals(0, remove_employee.l5.getY()),
                () -> assertEquals(500, remove_employee.l5.getWidth()),
                () -> assertEquals(500, remove_employee.l5.getHeight()),
                () -> assertEquals(null, remove_employee.l5.getLayout())
        );
        ImageIcon i1 = (ImageIcon) remove_employee.l5.getIcon();
        assertNotNull(i1);

        assertAll("Employee Id Label",
                () -> assertEquals("Employee ID", remove_employee.l1.getText()),
                () -> assertEquals(Color.white, remove_employee.l1.getForeground()),
                () -> assertEquals(50, remove_employee.l1.getX()),
                () -> assertEquals(50, remove_employee.l1.getY()),
                () -> assertEquals(250, remove_employee.l1.getWidth()),
                () -> assertEquals(30, remove_employee.l1.getHeight()),
                () -> assertEquals("serif", remove_employee.l1.getFont().getName()),
                () -> assertEquals(25, remove_employee.l1.getFont().getSize()),
                () -> assertEquals(true, remove_employee.l1.getFont().isBold())
        );

        assertAll("Text Field",
                () -> assertEquals(250, remove_employee.t.getX()),
                () -> assertEquals(50, remove_employee.t.getY()),
                () -> assertEquals(150, remove_employee.t.getWidth()),
                () -> assertEquals(30, remove_employee.t.getHeight())
        );

        assertAll("Search Button",
                () -> assertEquals("Search", remove_employee.b.getText()),
                () -> assertEquals(200, remove_employee.b.getX()),
                () -> assertEquals(100, remove_employee.b.getY()),
                () -> assertEquals(100, remove_employee.b.getWidth()),
                () -> assertEquals(30, remove_employee.b.getHeight()),
                () -> assertEquals(true, remove_employee.b.getActionListeners())
        );

        assertAll("back Button",
                () -> assertEquals("back", remove_employee.b3.getText()),
                () -> assertEquals(360, remove_employee.b3.getX()),
                () -> assertEquals(100, remove_employee.b3.getY()),
                () -> assertEquals(100, remove_employee.b3.getWidth()),
                () -> assertEquals(30, remove_employee.b3.getHeight()),
                () -> assertEquals(true, remove_employee.b3.getActionListeners())
        );

        assertAll("Name Label",
                () -> assertEquals("Name:", remove_employee.l2.getText()),
                () -> assertEquals(Color.white, remove_employee.l2.getForeground()),
                () -> assertEquals(50, remove_employee.l2.getX()),
                () -> assertEquals(150, remove_employee.l2.getY()),
                () -> assertEquals(250, remove_employee.l2.getWidth()),
                () -> assertEquals(30, remove_employee.l2.getHeight()),
                () -> assertEquals("serif", remove_employee.l2.getFont().getName()),
                () -> assertEquals(20, remove_employee.l2.getFont().getSize()),
                () -> assertEquals(true, remove_employee.l2.getFont().isBold())
        );

        assertAll("Label6",
                () -> assertEquals(Color.white, remove_employee.l6.getForeground()),
                () -> assertEquals(200, remove_employee.l6.getX()),
                () -> assertEquals(150, remove_employee.l6.getY()),
                () -> assertEquals(350, remove_employee.l6.getWidth()),
                () -> assertEquals(30, remove_employee.l6.getHeight()),
                () -> assertEquals("serif", remove_employee.l6.getFont().getName()),
                () -> assertEquals(20, remove_employee.l6.getFont().getSize()),
                () -> assertEquals(true, remove_employee.l6.getFont().isBold())
        );

        assertAll("Mobile No Label",
                () -> assertEquals("Mobile No:", remove_employee.l3.getText()),
                () -> assertEquals(Color.white, remove_employee.l3.getForeground()),
                () -> assertEquals(50, remove_employee.l3.getX()),
                () -> assertEquals(200, remove_employee.l3.getY()),
                () -> assertEquals(250, remove_employee.l3.getWidth()),
                () -> assertEquals(30, remove_employee.l3.getHeight()),
                () -> assertEquals("serif", remove_employee.l3.getFont().getName()),
                () -> assertEquals(20, remove_employee.l3.getFont().getSize()),
                () -> assertEquals(true, remove_employee.l3.getFont().isBold())
        );

        assertAll("Name Label",
                () -> assertEquals(Color.white, remove_employee.l7.getForeground()),
                () -> assertEquals(200, remove_employee.l7.getX()),
                () -> assertEquals(200, remove_employee.l7.getY()),
                () -> assertEquals(350, remove_employee.l7.getWidth()),
                () -> assertEquals(30, remove_employee.l7.getHeight()),
                () -> assertEquals("serif", remove_employee.l7.getFont().getName()),
                () -> assertEquals(20, remove_employee.l7.getFont().getSize()),
                () -> assertEquals(true, remove_employee.l7.getFont().isBold())
        );

        assertAll("Email Id Label",
                () -> assertEquals("Email Id:", remove_employee.l4.getText()),
                () -> assertEquals(Color.white, remove_employee.l4.getForeground()),
                () -> assertEquals(50, remove_employee.l4.getX()),
                () -> assertEquals(250, remove_employee.l4.getY()),
                () -> assertEquals(250, remove_employee.l4.getWidth()),
                () -> assertEquals(30, remove_employee.l4.getHeight()),
                () -> assertEquals("serif", remove_employee.l4.getFont().getName()),
                () -> assertEquals(20, remove_employee.l4.getFont().getSize()),
                () -> assertEquals(true, remove_employee.l4.getFont().isBold())
        );

        assertAll("Label8",
                () -> assertEquals(Color.white, remove_employee.l8.getForeground()),
                () -> assertEquals(200, remove_employee.l8.getX()),
                () -> assertEquals(250, remove_employee.l8.getY()),
                () -> assertEquals(350, remove_employee.l8.getWidth()),
                () -> assertEquals(30, remove_employee.l8.getHeight()),
                () -> assertEquals("serif", remove_employee.l8.getFont().getName()),
                () -> assertEquals(20, remove_employee.l8.getFont().getSize()),
                () -> assertEquals(true, remove_employee.l8.getFont().isBold())
        );
    }

    @After
    void tearDown() {
    }
}