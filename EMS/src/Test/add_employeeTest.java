import Employee.add_employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class add_employeeTest {

    add_employee add_employee;

    @Before
    public void setUp() {
        add_employee = new add_employee();
    }

    @Test
    public void add_employeeTest() {
        assertAll("add employee page",
                () -> assertNotNull(add_employee.frame),
                () -> assertNotNull(add_employee.t1),
                () -> assertNotNull(add_employee.t2),
                () -> assertNotNull(add_employee.t3),
                () -> assertNotNull(add_employee.t4),
                () -> assertNotNull(add_employee.t5),
                () -> assertNotNull(add_employee.t6),
                () -> assertNotNull(add_employee.t7),
                () -> assertNotNull(add_employee.t8),
                () -> assertNotNull(add_employee.t9),
                () -> assertNotNull(add_employee.t10),
                () -> assertNotNull(add_employee.t11),
                () -> assertNotNull(add_employee.label1),
                () -> assertNotNull(add_employee.label2),
                () -> assertNotNull(add_employee.label3),
                () -> assertNotNull(add_employee.label4),
                () -> assertNotNull(add_employee.label5),
                () -> assertNotNull(add_employee.label6),
                () -> assertNotNull(add_employee.label7),
                () -> assertNotNull(add_employee.label8),
                () -> assertNotNull(add_employee.label9),
                () -> assertNotNull(add_employee.label10),
                () -> assertNotNull(add_employee.label11),
                () -> assertNotNull(add_employee.label12),
                () -> assertNotNull(add_employee.label13),
                () -> assertNotNull(add_employee.box),
                () -> assertNotNull(add_employee.title),
                () -> assertNotNull(add_employee.b1),
                () -> assertNotNull(add_employee.b2)
        );

        assertAll("Frame",
                () -> assertEquals("Add Employee", add_employee.frame.getTitle()),
                () -> assertEquals(null, add_employee.frame.getLayout()),
                () -> assertEquals(Color.WHITE, add_employee.frame.getBackground()),
                () -> assertEquals(200, add_employee.frame.getX()),
                () -> assertEquals(20, add_employee.frame.getY()),
                () -> assertEquals(900, add_employee.frame.getWidth()),
                () -> assertEquals(700, add_employee.frame.getHeight()),
                () -> assertEquals(true, add_employee.frame.isVisible())
        );

        assertAll("Box Label",
                () -> assertEquals(0, add_employee.box.getX()),
                () -> assertEquals(0, add_employee.box.getY()),
                () -> assertEquals(900, add_employee.box.getWidth()),
                () -> assertEquals(700, add_employee.box.getHeight()),
                () -> assertEquals(null, add_employee.box.getLayout())
        );
        ImageIcon i1 = (ImageIcon) add_employee.box.getIcon();
        assertNotNull(i1);

        assertAll("Title Details",
                () -> assertEquals("New Employee Details", add_employee.title.getText()),
                () -> assertEquals(320, add_employee.title.getX()),
                () -> assertEquals(30, add_employee.title.getY()),
                () -> assertEquals(500, add_employee.title.getWidth()),
                () -> assertEquals(50, add_employee.title.getHeight()),
                () -> assertEquals("serif", add_employee.title.getFont().getName()),
                () -> assertEquals(25, add_employee.title.getFont().getSize()),
                () -> assertEquals(true, add_employee.title.getFont().isItalic()),
                () -> assertEquals(Color.black, add_employee.title.getForeground())
        );

        assertAll("Name Label",
                () -> assertEquals("Name", add_employee.label1.getText()),
                () -> assertEquals(50, add_employee.label1.getX()),
                () -> assertEquals(150, add_employee.label1.getY()),
                () -> assertEquals(100, add_employee.label1.getWidth()),
                () -> assertEquals(30, add_employee.label1.getHeight()),
                () -> assertEquals("serif", add_employee.label1.getFont().getName()),
                () -> assertEquals(20, add_employee.label1.getFont().getSize()),
                () -> assertEquals(true, add_employee.label1.getFont().isBold())
        );

        assertAll("Father's Name Label",
                () -> assertEquals("Father's Name", add_employee.label2.getText()),
                () -> assertEquals(400, add_employee.label2.getX()),
                () -> assertEquals(150, add_employee.label2.getY()),
                () -> assertEquals(200, add_employee.label2.getWidth()),
                () -> assertEquals(30, add_employee.label2.getHeight()),
                () -> assertEquals("serif", add_employee.label2.getFont().getName()),
                () -> assertEquals(20, add_employee.label2.getFont().getSize()),
                () -> assertEquals(true, add_employee.label2.getFont().isBold())
        );

        assertAll("Age Label",
                () -> assertEquals("Age", add_employee.label3.getText()),
                () -> assertEquals(50, add_employee.label3.getX()),
                () -> assertEquals(200, add_employee.label3.getY()),
                () -> assertEquals(100, add_employee.label3.getWidth()),
                () -> assertEquals(30, add_employee.label3.getHeight()),
                () -> assertEquals("serif", add_employee.label3.getFont().getName()),
                () -> assertEquals(20, add_employee.label3.getFont().getSize()),
                () -> assertEquals(true, add_employee.label3.getFont().isBold())
        );

        assertAll("Date Of Birth Label",
                () -> assertEquals("Date Of Birth", add_employee.label4.getText()),
                () -> assertEquals(400, add_employee.label4.getX()),
                () -> assertEquals(200, add_employee.label4.getY()),
                () -> assertEquals(200, add_employee.label4.getWidth()),
                () -> assertEquals(30, add_employee.label4.getHeight()),
                () -> assertEquals("serif", add_employee.label4.getFont().getName()),
                () -> assertEquals(20, add_employee.label4.getFont().getSize()),
                () -> assertEquals(true, add_employee.label4.getFont().isBold())
        );

        assertAll("Address Label",
                () -> assertEquals("Address", add_employee.label5.getText()),
                () -> assertEquals(50, add_employee.label5.getX()),
                () -> assertEquals(250, add_employee.label5.getY()),
                () -> assertEquals(100, add_employee.label5.getWidth()),
                () -> assertEquals(30, add_employee.label5.getHeight()),
                () -> assertEquals("serif", add_employee.label5.getFont().getName()),
                () -> assertEquals(20, add_employee.label5.getFont().getSize()),
                () -> assertEquals(true, add_employee.label5.getFont().isBold())
        );

        assertAll("Phone Label",
                () -> assertEquals("Phone", add_employee.label6.getText()),
                () -> assertEquals(400, add_employee.label6.getX()),
                () -> assertEquals(250, add_employee.label6.getY()),
                () -> assertEquals(100, add_employee.label6.getWidth()),
                () -> assertEquals(30, add_employee.label6.getHeight()),
                () -> assertEquals("serif", add_employee.label6.getFont().getName()),
                () -> assertEquals(20, add_employee.label6.getFont().getSize()),
                () -> assertEquals(true, add_employee.label6.getFont().isBold())
        );

        assertAll("Email Id Label",
                () -> assertEquals("Email Id", add_employee.label7.getText()),
                () -> assertEquals(50, add_employee.label7.getX()),
                () -> assertEquals(300, add_employee.label7.getY()),
                () -> assertEquals(100, add_employee.label7.getWidth()),
                () -> assertEquals(30, add_employee.label7.getHeight()),
                () -> assertEquals("serif", add_employee.label7.getFont().getName()),
                () -> assertEquals(20, add_employee.label7.getFont().getSize()),
                () -> assertEquals(true, add_employee.label7.getFont().isBold())
        );

        assertAll("Education Label",
                () -> assertEquals("Education", add_employee.label8.getText()),
                () -> assertEquals(400, add_employee.label8.getX()),
                () -> assertEquals(300, add_employee.label8.getY()),
                () -> assertEquals(100, add_employee.label8.getWidth()),
                () -> assertEquals(30, add_employee.label8.getHeight()),
                () -> assertEquals("serif", add_employee.label8.getFont().getName()),
                () -> assertEquals(20, add_employee.label8.getFont().getSize()),
                () -> assertEquals(true, add_employee.label8.getFont().isBold())
        );

        assertAll("Job Post Label",
                () -> assertEquals("Job Post", add_employee.label9.getText()),
                () -> assertEquals(50, add_employee.label9.getX()),
                () -> assertEquals(350, add_employee.label9.getY()),
                () -> assertEquals(100, add_employee.label9.getWidth()),
                () -> assertEquals(30, add_employee.label9.getHeight()),
                () -> assertEquals("serif", add_employee.label9.getFont().getName()),
                () -> assertEquals(20, add_employee.label9.getFont().getSize()),
                () -> assertEquals(true, add_employee.label9.getFont().isBold())
        );

        assertAll("Aadhar No Label",
                () -> assertEquals("Aadhar No", add_employee.label10.getText()),
                () -> assertEquals(400, add_employee.label10.getX()),
                () -> assertEquals(350, add_employee.label10.getY()),
                () -> assertEquals(100, add_employee.label10.getWidth()),
                () -> assertEquals(30, add_employee.label10.getHeight()),
                () -> assertEquals("serif", add_employee.label10.getFont().getName()),
                () -> assertEquals(20, add_employee.label10.getFont().getSize()),
                () -> assertEquals(true, add_employee.label10.getFont().isBold())
        );

        assertAll("Employee Id Label",
                () -> assertEquals("Employee Id", add_employee.label11.getText()),
                () -> assertEquals(50, add_employee.label11.getX()),
                () -> assertEquals(400, add_employee.label11.getY()),
                () -> assertEquals(150, add_employee.label11.getWidth()),
                () -> assertEquals(30, add_employee.label11.getHeight()),
                () -> assertEquals("serif", add_employee.label11.getFont().getName()),
                () -> assertEquals(20, add_employee.label11.getFont().getSize()),
                () -> assertEquals(true, add_employee.label11.getFont().isBold())
        );

        assertAll("Label",
                () -> assertEquals(200, add_employee.label12.getX()),
                () -> assertEquals(450, add_employee.label12.getY()),
                () -> assertEquals(250, add_employee.label12.getWidth()),
                () -> assertEquals(200, add_employee.label12.getHeight())
        );

        assertAll("Label",
                () -> assertEquals("", add_employee.label13.getText()),
                () -> assertEquals(600, add_employee.label13.getX()),
                () -> assertEquals(450, add_employee.label13.getY()),
                () -> assertEquals(250, add_employee.label13.getWidth()),
                () -> assertEquals(200, add_employee.label13.getHeight())
        );

        assertAll("Text Field 1",
                () -> assertEquals(200, add_employee.t1.getX()),
                () -> assertEquals(150, add_employee.t1.getY()),
                () -> assertEquals(150, add_employee.t1.getWidth()),
                () -> assertEquals(30, add_employee.t1.getHeight()),
                () -> assertEquals("serif", add_employee.t1.getFont().getName()),
                () -> assertEquals(15, add_employee.t1.getFont().getSize()),
                () -> assertEquals(true, add_employee.t1.getFont().isBold())
        );

        assertAll("Text Field 2",
                () -> assertEquals(600, add_employee.t2.getX()),
                () -> assertEquals(150, add_employee.t2.getY()),
                () -> assertEquals(150, add_employee.t2.getWidth()),
                () -> assertEquals(30, add_employee.t2.getHeight()),
                () -> assertEquals("serif", add_employee.t2.getFont().getName()),
                () -> assertEquals(15, add_employee.t2.getFont().getSize()),
                () -> assertEquals(true, add_employee.t2.getFont().isBold())
        );

        assertAll("Text Field 3",
                () -> assertEquals(200, add_employee.t3.getX()),
                () -> assertEquals(200, add_employee.t3.getY()),
                () -> assertEquals(150, add_employee.t3.getWidth()),
                () -> assertEquals(30, add_employee.t3.getHeight()),
                () -> assertEquals("serif", add_employee.t3.getFont().getName()),
                () -> assertEquals(15, add_employee.t3.getFont().getSize()),
                () -> assertEquals(true, add_employee.t3.getFont().isBold())
        );

        assertAll("Text Field 4",
                () -> assertEquals(600, add_employee.t4.getX()),
                () -> assertEquals(200, add_employee.t4.getY()),
                () -> assertEquals(150, add_employee.t4.getWidth()),
                () -> assertEquals(30, add_employee.t4.getHeight()),
                () -> assertEquals("serif", add_employee.t4.getFont().getName()),
                () -> assertEquals(15, add_employee.t4.getFont().getSize()),
                () -> assertEquals(true, add_employee.t4.getFont().isBold())
        );

        assertAll("Text Field 5",
                () -> assertEquals(200, add_employee.t5.getX()),
                () -> assertEquals(250, add_employee.t5.getY()),
                () -> assertEquals(150, add_employee.t5.getWidth()),
                () -> assertEquals(30, add_employee.t5.getHeight()),
                () -> assertEquals("serif", add_employee.t5.getFont().getName()),
                () -> assertEquals(15, add_employee.t5.getFont().getSize()),
                () -> assertEquals(true, add_employee.t5.getFont().isBold())
        );

        assertAll("Text Field 6",
                () -> assertEquals(600, add_employee.t6.getX()),
                () -> assertEquals(250, add_employee.t6.getY()),
                () -> assertEquals(150, add_employee.t6.getWidth()),
                () -> assertEquals(30, add_employee.t6.getHeight()),
                () -> assertEquals("serif", add_employee.t6.getFont().getName()),
                () -> assertEquals(15, add_employee.t6.getFont().getSize()),
                () -> assertEquals(true, add_employee.t6.getFont().isBold())
        );

        assertAll("Text Field 7",
                () -> assertEquals(200, add_employee.t7.getX()),
                () -> assertEquals(300, add_employee.t7.getY()),
                () -> assertEquals(150, add_employee.t7.getWidth()),
                () -> assertEquals(30, add_employee.t7.getHeight()),
                () -> assertEquals("serif", add_employee.t7.getFont().getName()),
                () -> assertEquals(15, add_employee.t7.getFont().getSize()),
                () -> assertEquals(true, add_employee.t7.getFont().isBold())
        );

        assertAll("Text Field 8",
                () -> assertEquals(600, add_employee.t8.getX()),
                () -> assertEquals(300, add_employee.t8.getY()),
                () -> assertEquals(150, add_employee.t8.getWidth()),
                () -> assertEquals(30, add_employee.t8.getHeight()),
                () -> assertEquals("serif", add_employee.t8.getFont().getName()),
                () -> assertEquals(15, add_employee.t8.getFont().getSize()),
                () -> assertEquals(true, add_employee.t8.getFont().isBold())
        );

        assertAll("Text Field 9",
                () -> assertEquals(200, add_employee.t9.getX()),
                () -> assertEquals(350, add_employee.t9.getY()),
                () -> assertEquals(150, add_employee.t9.getWidth()),
                () -> assertEquals(30, add_employee.t9.getHeight()),
                () -> assertEquals("serif", add_employee.t9.getFont().getName()),
                () -> assertEquals(15, add_employee.t9.getFont().getSize()),
                () -> assertEquals(true, add_employee.t9.getFont().isBold())
        );

        assertAll("Text Field 10",
                () -> assertEquals(600, add_employee.t10.getX()),
                () -> assertEquals(350, add_employee.t10.getY()),
                () -> assertEquals(150, add_employee.t10.getWidth()),
                () -> assertEquals(30, add_employee.t10.getHeight()),
                () -> assertEquals("serif", add_employee.t10.getFont().getName()),
                () -> assertEquals(15, add_employee.t10.getFont().getSize()),
                () -> assertEquals(true, add_employee.t10.getFont().isBold())
        );

        assertAll("Text Field 11",
                () -> assertEquals(200, add_employee.t11.getX()),
                () -> assertEquals(400, add_employee.t11.getY()),
                () -> assertEquals(150, add_employee.t11.getWidth()),
                () -> assertEquals(30, add_employee.t11.getHeight()),
                () -> assertEquals("serif", add_employee.t11.getFont().getName()),
                () -> assertEquals(15, add_employee.t11.getFont().getSize()),
                () -> assertEquals(true, add_employee.t11.getFont().isBold())
        );

        assertAll("Submit Button",
                () -> assertEquals("Submit", add_employee.b1.getText()),
                () -> assertEquals(Color.BLACK, add_employee.b1.getBackground()),
                () -> assertEquals(Color.WHITE, add_employee.b1.getForeground()),
                () -> assertEquals(250, add_employee.b1.getX()),
                () -> assertEquals(550, add_employee.b1.getY()),
                () -> assertEquals(150, add_employee.b1.getWidth()),
                () -> assertEquals(40, add_employee.b1.getHeight())
        );

        assertAll("Submit Button",
                () -> assertEquals("Submit", add_employee.b1.getText()),
                () -> assertEquals(Color.BLACK, add_employee.b1.getBackground()),
                () -> assertEquals(Color.WHITE, add_employee.b1.getForeground()),
                () -> assertEquals(250, add_employee.b1.getX()),
                () -> assertEquals(550, add_employee.b1.getY()),
                () -> assertEquals(150, add_employee.b1.getWidth()),
                () -> assertEquals(40, add_employee.b1.getHeight()),
                () -> assertNotNull(add_employee.b1.getActionListeners())
        );

        assertAll("Cancel Button",
                () -> assertEquals("Cancel", add_employee.b2.getText()),
                () -> assertEquals(Color.BLACK, add_employee.b2.getBackground()),
                () -> assertEquals(Color.WHITE, add_employee.b2.getForeground()),
                () -> assertEquals(450, add_employee.b2.getX()),
                () -> assertEquals(550, add_employee.b2.getY()),
                () -> assertEquals(150, add_employee.b2.getWidth()),
                () -> assertEquals(40, add_employee.b2.getHeight()),
                () -> assertNotNull(add_employee.b2.getActionListeners())
        );
    }

//    @After
//    public void tearDown() {
//    }
}