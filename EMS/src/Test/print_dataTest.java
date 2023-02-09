import Employee.print_data;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class print_dataTest {

    print_data print_data;

    @Before
    @ParameterizedTest
    @ValueSource(
            strings = {"employee id"}
    )
    public void setUp(String candidate) {
        print_data = new print_data(candidate);
    }

    @Test
    public void print_dataTest() {
        assertAll(
                () -> assertNotNull(print_data.f),
                () -> assertNotNull(print_data.id1),
                () -> assertNotNull(print_data.id2),
                () -> assertNotNull(print_data.id3),
                () -> assertNotNull(print_data.id4),
                () -> assertNotNull(print_data.id5),
                () -> assertNotNull(print_data.id6),
                () -> assertNotNull(print_data.id7),
                () -> assertNotNull(print_data.id8),
                () -> assertNotNull(print_data.id9),
                () -> assertNotNull(print_data.aid),
                () -> assertNotNull(print_data.aid1),
                () -> assertNotNull(print_data.aid2),
                () -> assertNotNull(print_data.aid3),
                () -> assertNotNull(print_data.aid4),
                () -> assertNotNull(print_data.aid5),
                () -> assertNotNull(print_data.aid6),
                () -> assertNotNull(print_data.aid7),
                () -> assertNotNull(print_data.address),
                () -> assertNotNull(print_data.education),
                () -> assertNotNull(print_data.name),
                () -> assertNotNull(print_data.emp_id),
                () -> assertNotNull(print_data.phone),
                () -> assertNotNull(print_data.email),
                () -> assertNotNull(print_data.age),
                () -> assertNotNull(print_data.dob),
                () -> assertNotNull(print_data.aadhar),
                () -> assertNotNull(print_data.icon)
        );

        assertAll("frame",
                () -> assertEquals("Print Data", print_data.f.getTitle()),
                () -> assertEquals(Color.green, print_data.f.getBackground()),
                () -> assertEquals(null, print_data.f.getLayout()),
                () -> assertEquals(450, print_data.f.getX()),
                () -> assertEquals(200, print_data.f.getY()),
                () -> assertEquals(595, print_data.f.getWidth()),
                () -> assertEquals(642, print_data.f.getHeight()),
                () -> assertEquals(true, print_data.f.isVisible())
        );

        assertAll("id9",
                () -> assertEquals(0, print_data.id9.getX()),
                () -> assertEquals(0, print_data.id9.getY()),
                () -> assertEquals(595, print_data.id9.getWidth()),
                () -> assertEquals(642, print_data.id9.getHeight()),
                () -> assertEquals(null, print_data.id9.getLayout())
        );
        ImageIcon i1 = (ImageIcon) print_data.id9.getIcon();
        assertNotNull(i1);

        assertAll("id8",
                () -> assertEquals("Employee Details", print_data.id8.getText()),
                () -> assertEquals(0, print_data.id8.getX()),
                () -> assertEquals(0, print_data.id8.getY()),
                () -> assertEquals(595, print_data.id8.getWidth()),
                () -> assertEquals(642, print_data.id8.getHeight()),
                () -> assertEquals("serif", print_data.id8.getFont().getName()),
                () -> assertEquals(25, print_data.id8.getFont().getSize()),
                () -> assertEquals(true, print_data.id8.getFont().isBold()),
                () -> assertEquals(null, print_data.id8.getLayout())
        );

        assertAll("id",
                () -> assertEquals("Employee Id:", print_data.id.getText()),
                () -> assertEquals(50, print_data.id.getX()),
                () -> assertEquals(70, print_data.id.getY()),
                () -> assertEquals(120, print_data.id.getWidth()),
                () -> assertEquals(30, print_data.id.getHeight()),
                () -> assertEquals("serif", print_data.id.getFont().getName()),
                () -> assertEquals(20, print_data.id.getFont().getSize()),
                () -> assertEquals(true, print_data.id.getFont().isBold()),
                () -> assertEquals(null, print_data.id.getLayout())
        );

        assertAll("aid",
                () -> assertEquals(200, print_data.aid.getX()),
                () -> assertEquals(70, print_data.aid.getY()),
                () -> assertEquals(200, print_data.aid.getWidth()),
                () -> assertEquals(30, print_data.aid.getHeight()),
                () -> assertEquals("serif", print_data.aid.getFont().getName()),
                () -> assertEquals(20, print_data.aid.getFont().getSize()),
                () -> assertEquals(true, print_data.aid.getFont().isBold()),
                () -> assertEquals(null, print_data.aid.getLayout())
        );

        assertAll("id1",
                () -> assertEquals("Name:", print_data.id1.getText()),
                () -> assertEquals(50, print_data.id1.getX()),
                () -> assertEquals(120, print_data.id1.getY()),
                () -> assertEquals(100, print_data.id1.getWidth()),
                () -> assertEquals(30, print_data.id1.getHeight()),
                () -> assertEquals("serif", print_data.id1.getFont().getName()),
                () -> assertEquals(20, print_data.id1.getFont().getSize()),
                () -> assertEquals(true, print_data.id1.getFont().isBold()),
                () -> assertEquals(null, print_data.id1.getLayout())
        );

        assertAll("aid1",
                () -> assertEquals(200, print_data.aid1.getX()),
                () -> assertEquals(120, print_data.aid1.getY()),
                () -> assertEquals(300, print_data.aid1.getWidth()),
                () -> assertEquals(30, print_data.aid1.getHeight()),
                () -> assertEquals("serif", print_data.aid1.getFont().getName()),
                () -> assertEquals(20, print_data.aid1.getFont().getSize()),
                () -> assertEquals(true, print_data.aid1.getFont().isBold()),
                () -> assertEquals(null, print_data.aid1.getLayout())
        );

        assertAll("id2",
                () -> assertEquals("Father's Name:", print_data.id2.getText()),
                () -> assertEquals(50, print_data.id2.getX()),
                () -> assertEquals(170, print_data.id2.getY()),
                () -> assertEquals(200, print_data.id2.getWidth()),
                () -> assertEquals(30, print_data.id2.getHeight()),
                () -> assertEquals("serif", print_data.id2.getFont().getName()),
                () -> assertEquals(20, print_data.id2.getFont().getSize()),
                () -> assertEquals(true, print_data.id2.getFont().isBold()),
                () -> assertEquals(null, print_data.id2.getLayout())
        );

        assertAll("aid2",
                () -> assertEquals(200, print_data.aid2.getX()),
                () -> assertEquals(170, print_data.aid2.getY()),
                () -> assertEquals(300, print_data.aid2.getWidth()),
                () -> assertEquals(30, print_data.aid2.getHeight()),
                () -> assertEquals("serif", print_data.aid2.getFont().getName()),
                () -> assertEquals(20, print_data.aid2.getFont().getSize()),
                () -> assertEquals(true, print_data.aid2.getFont().isBold()),
                () -> assertEquals(null, print_data.aid2.getLayout())
        );

        assertAll("id3",
                () -> assertEquals("Address:", print_data.id3.getText()),
                () -> assertEquals(50, print_data.id3.getX()),
                () -> assertEquals(170, print_data.id3.getY()),
                () -> assertEquals(200, print_data.id3.getWidth()),
                () -> assertEquals(30, print_data.id3.getHeight()),
                () -> assertEquals("serif", print_data.id3.getFont().getName()),
                () -> assertEquals(20, print_data.id3.getFont().getSize()),
                () -> assertEquals(true, print_data.id3.getFont().isBold()),
                () -> assertEquals(null, print_data.id3.getLayout())
        );

        assertAll("aid3",
                () -> assertEquals(200, print_data.aid3.getX()),
                () -> assertEquals(220, print_data.aid3.getY()),
                () -> assertEquals(300, print_data.aid3.getWidth()),
                () -> assertEquals(30, print_data.aid3.getHeight()),
                () -> assertEquals("serif", print_data.aid3.getFont().getName()),
                () -> assertEquals(20, print_data.aid3.getFont().getSize()),
                () -> assertEquals(true, print_data.aid3.getFont().isBold()),
                () -> assertEquals(null, print_data.aid3.getLayout())
        );

        assertAll("id4",
                () -> assertEquals("Mobile No:", print_data.id4.getText()),
                () -> assertEquals(50, print_data.id4.getX()),
                () -> assertEquals(270, print_data.id4.getY()),
                () -> assertEquals(200, print_data.id4.getWidth()),
                () -> assertEquals(30, print_data.id4.getHeight()),
                () -> assertEquals("serif", print_data.id4.getFont().getName()),
                () -> assertEquals(20, print_data.id4.getFont().getSize()),
                () -> assertEquals(true, print_data.id4.getFont().isBold()),
                () -> assertEquals(null, print_data.id4.getLayout())
        );

        assertAll("aid4",
                () -> assertEquals(200, print_data.aid4.getX()),
                () -> assertEquals(270, print_data.aid4.getY()),
                () -> assertEquals(300, print_data.aid4.getWidth()),
                () -> assertEquals(30, print_data.aid4.getHeight()),
                () -> assertEquals("serif", print_data.aid4.getFont().getName()),
                () -> assertEquals(20, print_data.aid4.getFont().getSize()),
                () -> assertEquals(true, print_data.aid4.getFont().isBold()),
                () -> assertEquals(null, print_data.aid4.getLayout())
        );

        assertAll("id5",
                () -> assertEquals("Email Id:", print_data.id5.getText()),
                () -> assertEquals(50, print_data.id5.getX()),
                () -> assertEquals(320, print_data.id5.getY()),
                () -> assertEquals(200, print_data.id5.getWidth()),
                () -> assertEquals(30, print_data.id5.getHeight()),
                () -> assertEquals("serif", print_data.id5.getFont().getName()),
                () -> assertEquals(20, print_data.id5.getFont().getSize()),
                () -> assertEquals(true, print_data.id5.getFont().isBold()),
                () -> assertEquals(null, print_data.id5.getLayout())
        );

        assertAll("aid5",
                () -> assertEquals(200, print_data.aid5.getX()),
                () -> assertEquals(320, print_data.aid5.getY()),
                () -> assertEquals(300, print_data.aid5.getWidth()),
                () -> assertEquals(30, print_data.aid5.getHeight()),
                () -> assertEquals("serif", print_data.aid5.getFont().getName()),
                () -> assertEquals(20, print_data.aid5.getFont().getSize()),
                () -> assertEquals(true, print_data.aid5.getFont().isBold()),
                () -> assertEquals(null, print_data.aid5.getLayout())
        );

        assertAll("id6",
                () -> assertEquals("Education:", print_data.id6.getText()),
                () -> assertEquals(50, print_data.id6.getX()),
                () -> assertEquals(420, print_data.id6.getY()),
                () -> assertEquals(200, print_data.id6.getWidth()),
                () -> assertEquals(30, print_data.id6.getHeight()),
                () -> assertEquals("serif", print_data.id6.getFont().getName()),
                () -> assertEquals(20, print_data.id6.getFont().getSize()),
                () -> assertEquals(true, print_data.id6.getFont().isBold()),
                () -> assertEquals(null, print_data.id6.getLayout())
        );

        assertAll("aid6",
                () -> assertEquals(200, print_data.aid6.getX()),
                () -> assertEquals(370, print_data.aid6.getY()),
                () -> assertEquals(300, print_data.aid6.getWidth()),
                () -> assertEquals(30, print_data.aid6.getHeight()),
                () -> assertEquals("serif", print_data.aid6.getFont().getName()),
                () -> assertEquals(20, print_data.aid6.getFont().getSize()),
                () -> assertEquals(true, print_data.aid6.getFont().isBold()),
                () -> assertEquals(null, print_data.aid6.getLayout())
        );

        assertAll("id7",
                () -> assertEquals("Job Post:", print_data.id7.getText()),
                () -> assertEquals(50, print_data.id7.getX()),
                () -> assertEquals(420, print_data.id7.getY()),
                () -> assertEquals(200, print_data.id7.getWidth()),
                () -> assertEquals(30, print_data.id7.getHeight()),
                () -> assertEquals("serif", print_data.id7.getFont().getName()),
                () -> assertEquals(20, print_data.id7.getFont().getSize()),
                () -> assertEquals(true, print_data.id7.getFont().isBold()),
                () -> assertEquals(null, print_data.id7.getLayout())
        );

        assertAll("aid7",
                () -> assertEquals(200, print_data.aid7.getX()),
                () -> assertEquals(420, print_data.aid7.getY()),
                () -> assertEquals(300, print_data.aid7.getWidth()),
                () -> assertEquals(30, print_data.aid7.getHeight()),
                () -> assertEquals("serif", print_data.aid7.getFont().getName()),
                () -> assertEquals(20, print_data.aid7.getFont().getSize()),
                () -> assertEquals(true, print_data.aid7.getFont().isBold()),
                () -> assertEquals(null, print_data.aid7.getLayout())
        );

        assertAll("Print Button",
                () -> assertEquals("Print", print_data.b1.getText()),
                () -> assertEquals(Color.BLACK, print_data.b1.getBackground()),
                () -> assertEquals(Color.WHITE, print_data.b1.getForeground()),
                () -> assertEquals(100, print_data.b1.getX()),
                () -> assertEquals(520, print_data.b1.getY()),
                () -> assertEquals(100, print_data.b1.getWidth()),
                () -> assertEquals(30, print_data.b1.getHeight()),
                () -> assertNotNull(print_data.b1.getActionListeners())
        );

        assertAll("Cancel Button",
                () -> assertEquals("Cancel", print_data.b2.getText()),
                () -> assertEquals(Color.BLACK, print_data.b2.getBackground()),
                () -> assertEquals(Color.WHITE, print_data.b2.getForeground()),
                () -> assertEquals(250, print_data.b2.getX()),
                () -> assertEquals(520, print_data.b2.getY()),
                () -> assertEquals(100, print_data.b2.getWidth()),
                () -> assertEquals(30, print_data.b2.getHeight()),
                () -> assertNotNull(print_data.b2.getActionListeners())
        );
    }

    @After
    public void tearDown() {
    }
}