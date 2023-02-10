import Employee.update_employee;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class update_employeeTest {
    update_employee update_employee;

    @ParameterizedTest
    @ValueSource(
            strings = {"idaa"}
    )
    public void update_employeeTest(String candidate) {
        update_employee = new update_employee(candidate);

        assertAll("add employee page",
                () -> assertNotNull(update_employee.f),
                () -> assertNotNull(update_employee.t),
                () -> assertNotNull(update_employee.t1),
                () -> assertNotNull(update_employee.t2),
                () -> assertNotNull(update_employee.t3),
                () -> assertNotNull(update_employee.t4),
                () -> assertNotNull(update_employee.t5),
                () -> assertNotNull(update_employee.t6),
                () -> assertNotNull(update_employee.t7),
                () -> assertNotNull(update_employee.t8),
                () -> assertNotNull(update_employee.t9),
                () -> assertNotNull(update_employee.id1),
                () -> assertNotNull(update_employee.id10),
                () -> assertNotNull(update_employee.id2),
                () -> assertNotNull(update_employee.id3),
                () -> assertNotNull(update_employee.id4),
                () -> assertNotNull(update_employee.id5),
                () -> assertNotNull(update_employee.id6),
                () -> assertNotNull(update_employee.id7),
                () -> assertNotNull(update_employee.id8),
                () -> assertNotNull(update_employee.id9),
                () -> assertNotNull(update_employee.id10),
                () -> assertNotNull(update_employee.id15),
                () -> assertNotNull(update_employee.b),
                () -> assertNotNull(update_employee.b1),
                () -> assertNotNull(update_employee.id2),
                () -> assertNotNull(update_employee.id_emp)
        );

        assertAll("Frame",
                () -> assertEquals("update Employee details", update_employee.f.getTitle()),
                () -> assertEquals(Color.white, update_employee.f.getBackground()),
                () -> assertEquals(450, update_employee.f.getX()),
                () -> assertEquals(250, update_employee.f.getY()),
                () -> assertEquals(900, update_employee.f.getWidth()),
                () -> assertEquals(500, update_employee.f.getHeight()),
                () -> assertEquals(true, update_employee.f.isVisible()),
                () -> assertNotNull(update_employee.f.getLayout())
        );

        assertAll("id15",
                () -> assertEquals(0, update_employee.id15.getX()),
                () -> assertEquals(0, update_employee.id15.getY()),
                () -> assertEquals(900, update_employee.id15.getWidth()),
                () -> assertEquals(500, update_employee.id15.getHeight()),
                () -> assertEquals(null, update_employee.id15.getLayout())
        );
        ImageIcon i1 = (ImageIcon) update_employee.id15.getIcon();
        assertNotNull(i1);

        assertAll("Update Employee Detail Label",
                () -> assertEquals("Update Employee Detail:", update_employee.id8.getText()),
                () -> assertEquals(50, update_employee.id8.getX()),
                () -> assertEquals(10, update_employee.id8.getY()),
                () -> assertEquals(500, update_employee.id8.getWidth()),
                () -> assertEquals(50, update_employee.id8.getHeight()),
                () -> assertEquals("serif", update_employee.id8.getFont().getName()),
                () -> assertEquals(40, update_employee.id8.getFont().getSize()),
                () -> assertEquals(true, update_employee.id8.getFont().isItalic()),
                () -> assertEquals(Color.black, update_employee.id8.getForeground())
        );

        assertAll("Name Label",
                () -> assertEquals("Name:", update_employee.id1.getText()),
                () -> assertEquals(50, update_employee.id1.getX()),
                () -> assertEquals(100, update_employee.id1.getY()),
                () -> assertEquals(100, update_employee.id1.getWidth()),
                () -> assertEquals(30, update_employee.id1.getHeight()),
                () -> assertEquals("serif", update_employee.id1.getFont().getName()),
                () -> assertEquals(20, update_employee.id1.getFont().getSize()),
                () -> assertEquals(true, update_employee.id1.getFont().isBold()),
                () -> assertEquals(Color.black, update_employee.id1.getForeground())
        );

        assertAll("Father's Name Label",
                () -> assertEquals("Father's Name:", update_employee.id2.getText()),
                () -> assertEquals(400, update_employee.id2.getX()),
                () -> assertEquals(100, update_employee.id2.getY()),
                () -> assertEquals(200, update_employee.id2.getWidth()),
                () -> assertEquals(30, update_employee.id2.getHeight()),
                () -> assertEquals("serif", update_employee.id2.getFont().getName()),
                () -> assertEquals(20, update_employee.id2.getFont().getSize()),
                () -> assertEquals(true, update_employee.id2.getFont().isBold())
        );

        assertAll("Address Label",
                () -> assertEquals("Address:", update_employee.id3.getText()),
                () -> assertEquals(50, update_employee.id3.getX()),
                () -> assertEquals(150, update_employee.id3.getY()),
                () -> assertEquals(100, update_employee.id3.getWidth()),
                () -> assertEquals(30, update_employee.id3.getHeight()),
                () -> assertEquals("serif", update_employee.id3.getFont().getName()),
                () -> assertEquals(20, update_employee.id3.getFont().getSize()),
                () -> assertEquals(true, update_employee.id3.getFont().isBold())
        );

        assertAll("Mobile No Label",
                () -> assertEquals("Mobile No:", update_employee.id4.getText()),
                () -> assertEquals(400, update_employee.id4.getX()),
                () -> assertEquals(150, update_employee.id4.getY()),
                () -> assertEquals(100, update_employee.id4.getWidth()),
                () -> assertEquals(30, update_employee.id4.getHeight()),
                () -> assertEquals("serif", update_employee.id4.getFont().getName()),
                () -> assertEquals(20, update_employee.id4.getFont().getSize()),
                () -> assertEquals(true, update_employee.id4.getFont().isBold())
        );

        assertAll("Email Id Label",
                () -> assertEquals("Email Id:", update_employee.id5.getText()),
                () -> assertEquals(50, update_employee.id5.getX()),
                () -> assertEquals(200, update_employee.id5.getY()),
                () -> assertEquals(100, update_employee.id5.getWidth()),
                () -> assertEquals(30, update_employee.id5.getHeight()),
                () -> assertEquals("serif", update_employee.id5.getFont().getName()),
                () -> assertEquals(20, update_employee.id5.getFont().getSize()),
                () -> assertEquals(true, update_employee.id5.getFont().isBold())
        );

        assertAll("Education Label",
                () -> assertEquals("Education:", update_employee.id6.getText()),
                () -> assertEquals(400, update_employee.id6.getX()),
                () -> assertEquals(200, update_employee.id6.getY()),
                () -> assertEquals(100, update_employee.id6.getWidth()),
                () -> assertEquals(30, update_employee.id6.getHeight()),
                () -> assertEquals("serif", update_employee.id6.getFont().getName()),
                () -> assertEquals(20, update_employee.id6.getFont().getSize()),
                () -> assertEquals(true, update_employee.id6.getFont().isBold())
        );

        assertAll("Job Post Label",
                () -> assertEquals("Job Post:", update_employee.id7.getText()),
                () -> assertEquals(50, update_employee.id7.getX()),
                () -> assertEquals(250, update_employee.id7.getY()),
                () -> assertEquals(100, update_employee.id7.getWidth()),
                () -> assertEquals(30, update_employee.id7.getHeight()),
                () -> assertEquals("serif", update_employee.id7.getFont().getName()),
                () -> assertEquals(20, update_employee.id7.getFont().getSize()),
                () -> assertEquals(true, update_employee.id7.getFont().isBold())
        );

        assertAll("Aadhar No Label",
                () -> assertEquals("Aadhar No:", update_employee.id9.getText()),
                () -> assertEquals(400, update_employee.id9.getX()),
                () -> assertEquals(250, update_employee.id9.getY()),
                () -> assertEquals(100, update_employee.id9.getWidth()),
                () -> assertEquals(30, update_employee.id9.getHeight()),
                () -> assertEquals("serif", update_employee.id9.getFont().getName()),
                () -> assertEquals(20, update_employee.id9.getFont().getSize()),
                () -> assertEquals(true, update_employee.id9.getFont().isBold())
        );

        assertAll("Employee Id Label",
                () -> assertEquals("Employee Id:", update_employee.id10.getText()),
                () -> assertEquals(50, update_employee.id10.getX()),
                () -> assertEquals(300, update_employee.id10.getY()),
                () -> assertEquals(150, update_employee.id10.getWidth()),
                () -> assertEquals(30, update_employee.id10.getHeight()),
                () -> assertEquals("serif", update_employee.id10.getFont().getName()),
                () -> assertEquals(20, update_employee.id10.getFont().getSize()),
                () -> assertEquals(true, update_employee.id10.getFont().isBold())
        );

        assertAll("Text Field 1",
                () -> assertEquals(200, update_employee.t1.getX()),
                () -> assertEquals(100, update_employee.t1.getY()),
                () -> assertEquals(150, update_employee.t1.getWidth()),
                () -> assertEquals(30, update_employee.t1.getHeight())
        );

        assertAll("Text Field 2",
                () -> assertEquals(600, update_employee.t2.getX()),
                () -> assertEquals(100, update_employee.t2.getY()),
                () -> assertEquals(150, update_employee.t2.getWidth()),
                () -> assertEquals(30, update_employee.t2.getHeight())
        );

        assertAll("Text Field 3",
                () -> assertEquals(200, update_employee.t3.getX()),
                () -> assertEquals(150, update_employee.t3.getY()),
                () -> assertEquals(150, update_employee.t3.getWidth()),
                () -> assertEquals(30, update_employee.t3.getHeight())
        );

        assertAll("Text Field 4",
                () -> assertEquals(600, update_employee.t4.getX()),
                () -> assertEquals(150, update_employee.t4.getY()),
                () -> assertEquals(150, update_employee.t4.getWidth()),
                () -> assertEquals(30, update_employee.t4.getHeight())
        );

        assertAll("Text Field 5",
                () -> assertEquals(200, update_employee.t5.getX()),
                () -> assertEquals(200, update_employee.t5.getY()),
                () -> assertEquals(150, update_employee.t5.getWidth()),
                () -> assertEquals(30, update_employee.t5.getHeight())
        );

        assertAll("Text Field 6",
                () -> assertEquals(600, update_employee.t6.getX()),
                () -> assertEquals(200, update_employee.t6.getY()),
                () -> assertEquals(150, update_employee.t6.getWidth()),
                () -> assertEquals(30, update_employee.t6.getHeight())
        );

        assertAll("Text Field 7",
                () -> assertEquals(200, update_employee.t7.getX()),
                () -> assertEquals(250, update_employee.t7.getY()),
                () -> assertEquals(150, update_employee.t7.getWidth()),
                () -> assertEquals(30, update_employee.t7.getHeight())
        );

        assertAll("Text Field 8",
                () -> assertEquals(600, update_employee.t8.getX()),
                () -> assertEquals(250, update_employee.t8.getY()),
                () -> assertEquals(150, update_employee.t8.getWidth()),
                () -> assertEquals(30, update_employee.t8.getHeight())
        );

        assertAll("Text Field 9",
                () -> assertEquals(200, update_employee.t9.getX()),
                () -> assertEquals(300, update_employee.t9.getY()),
                () -> assertEquals(150, update_employee.t9.getWidth()),
                () -> assertEquals(30, update_employee.t9.getHeight())
        );

        assertAll("Update Button",
                () -> assertEquals("Update", update_employee.b.getText()),
                () -> assertEquals(250, update_employee.b.getX()),
                () -> assertEquals(400, update_employee.b.getY()),
                () -> assertEquals(100, update_employee.b.getWidth()),
                () -> assertEquals(30, update_employee.b.getHeight()),
                () -> assertNotNull(update_employee.b.getActionListeners())
        );

        assertAll("Cancel Button",
                () -> assertEquals("Cancel", update_employee.b1.getText()),
                () -> assertEquals(450, update_employee.b1.getX()),
                () -> assertEquals(400, update_employee.b1.getY()),
                () -> assertEquals(100, update_employee.b1.getWidth()),
                () -> assertEquals(30, update_employee.b1.getHeight()),
                () -> assertNotNull(update_employee.b1.getActionListeners())
        );
    }

//    @ParameterizedTest
//    @ValueSource(
//            strings = {"idaa"}
//    )
//    public void showDataTest(String candidate) {
//
//    }
//
//    @After
//    public void tearDown() {
//    }
}