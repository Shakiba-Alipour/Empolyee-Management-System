import Employee.search_employee;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class search_employeeTest {

    search_employee search_employee;

    @Before
    public void setUp() {
        search_employee = new search_employee();
    }

    @Test
    public void search_employeeTest() {
        assertAll("search employee page",
                () -> assertNotNull(search_employee.frame),
                () -> assertNotNull(search_employee.l1),
                () -> assertNotNull(search_employee.l2),
                () -> assertNotNull(search_employee.b1),
                () -> assertNotNull(search_employee.b2),
                () -> assertNotNull(search_employee.t)
        );

        assertAll("Frame",
                () -> assertEquals("Search", search_employee.frame.getTitle()),
                () -> assertEquals(Color.green, search_employee.frame.getBackground()),
                () -> assertEquals(450, search_employee.frame.getX()),
                () -> assertEquals(250, search_employee.frame.getY()),
                () -> assertEquals(500, search_employee.frame.getWidth()),
                () -> assertEquals(270, search_employee.frame.getHeight()),
                () -> assertEquals(true, search_employee.frame.isVisible())
        );

        assertAll("Label1",
                () -> assertEquals(0, search_employee.l1.getX()),
                () -> assertEquals(0, search_employee.l1.getY()),
                () -> assertEquals(500, search_employee.l1.getWidth()),
                () -> assertEquals(270, search_employee.l1.getHeight()),
                () -> assertEquals(null, search_employee.l1.getLayout())
        );
        ImageIcon i1 = (ImageIcon) search_employee.l1.getIcon();
        assertNotNull(i1);

        assertAll("Employee Id Label",
                ()-> assertEquals("Employee Id", search_employee.l2.getText()),
                ()->assertEquals(Color.white,search_employee.l2.getForeground()),
                () -> assertEquals(40, search_employee.l2.getX()),
                () -> assertEquals(60, search_employee.l2.getY()),
                () -> assertEquals(250, search_employee.l2.getWidth()),
                () -> assertEquals(30, search_employee.l2.getHeight()),
                () -> assertEquals("serif", search_employee.l2.getFont().getName()),
                () -> assertEquals(30, search_employee.l2.getFont().getSize()),
                () -> assertEquals(true, search_employee.l2.getFont().isBold())
        );

        assertAll("Text Field",
                () -> assertEquals(240, search_employee.t.getX()),
                () -> assertEquals(60, search_employee.t.getY()),
                () -> assertEquals(220, search_employee.t.getWidth()),
                () -> assertEquals(30, search_employee.t.getHeight()),
                () -> assertEquals("serif", search_employee.t.getFont().getName()),
                () -> assertEquals(17, search_employee.t.getFont().getSize()),
                () -> assertEquals(true, search_employee.t.getFont().isBold())
        );


    }

//    @After
//    void tearDown() {
//    }
}