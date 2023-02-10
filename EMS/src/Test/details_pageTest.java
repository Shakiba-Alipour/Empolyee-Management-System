import Employee.details_page;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class details_pageTest {

    details_page details_page;

    @Before
    public void setUp() {
        details_page = new details_page();
    }

    @Test
    public void details_pageTest() {
        assertAll("details page",
                () -> assertNotNull(details_page.frame),
                () -> assertNotNull(details_page.l1),
                () -> assertNotNull(details_page.l2),
                () -> assertNotNull(details_page.b1),
                () -> assertNotNull(details_page.b2),
                () -> assertNotNull(details_page.b3),
                () -> assertNotNull(details_page.b4)
        );

        assertAll("Frame",
                () -> assertEquals("Employee Dashboard", details_page.frame.getTitle()),
                () -> assertEquals(Color.WHITE, details_page.frame.getBackground()),
                () -> assertEquals(JFrame.EXIT_ON_CLOSE, details_page.frame.getDefaultCloseOperation()),
                () -> assertEquals(450, details_page.frame.getX()),
                () -> assertEquals(200, details_page.frame.getY()),
                () -> assertEquals(700, details_page.frame.getWidth()),
                () -> assertEquals(500, details_page.frame.getHeight()),
                () -> assertEquals(true, details_page.frame.isVisible())
        );

        assertAll("Label1",
                () -> assertEquals(0, details_page.l1.getX()),
                () -> assertEquals(0, details_page.l1.getY()),
                () -> assertEquals(700, details_page.l1.getWidth()),
                () -> assertEquals(500, details_page.l1.getHeight()),
                () -> assertEquals(null, details_page.l1.getLayout())
        );
//        ImageIcon i1 = (ImageIcon) details_page.l1.getIcon();
//        assertNotNull(i1);

        assertAll("Employee Details",
                () -> assertEquals(430, details_page.l2.getX()),
                () -> assertEquals(20, details_page.l2.getY()),
                () -> assertEquals(200, details_page.l2.getWidth()),
                () -> assertEquals(40, details_page.l2.getHeight()),
                () -> assertEquals(null, details_page.l2.getLayout()),
                () -> assertEquals("serif", details_page.l2.getFont().getName()),
                () -> assertEquals(25, details_page.l2.getFont().getSize()),
                () -> assertEquals(true, details_page.l2.getFont().isBold()),
                () -> assertEquals(Color.BLUE, details_page.l2.getForeground())
        );

        assertAll("Add Button",
                () -> assertEquals("Add", details_page.b1.getText()),
                () -> assertEquals(Color.pink, details_page.b1.getBackground()),
                () -> assertEquals(420, details_page.b1.getX()),
                () -> assertEquals(80, details_page.b1.getY()),
                () -> assertEquals(90, details_page.b1.getWidth()),
                () -> assertEquals(30, details_page.b1.getHeight()),
                () -> assertEquals("serif", details_page.b1.getFont().getName()),
                () -> assertEquals(15, details_page.b1.getFont().getSize()),
                () -> assertEquals(true, details_page.b1.getFont().isBold()),
                () -> assertNotNull(details_page.b1.getActionListeners())
        );

        assertAll("View Button",
                () -> assertEquals("View", details_page.b2.getText()),
                () -> assertEquals(Color.pink, details_page.b2.getBackground()),
                () -> assertEquals(540, details_page.b2.getX()),
                () -> assertEquals(80, details_page.b2.getY()),
                () -> assertEquals(90, details_page.b2.getWidth()),
                () -> assertEquals(30, details_page.b2.getHeight()),
                () -> assertEquals("serif", details_page.b2.getFont().getName()),
                () -> assertEquals(15, details_page.b2.getFont().getSize()),
                () -> assertEquals(true, details_page.b2.getFont().isBold()),
                () -> assertNotNull(details_page.b2.getActionListeners())
        );

        assertAll("Remove Button",
                () -> assertEquals("Remove", details_page.b3.getText()),
                () -> assertEquals(Color.pink, details_page.b3.getBackground()),
                () -> assertEquals(420, details_page.b3.getX()),
                () -> assertEquals(140, details_page.b3.getY()),
                () -> assertEquals(90, details_page.b3.getWidth()),
                () -> assertEquals(30, details_page.b3.getHeight()),
                () -> assertEquals("serif", details_page.b3.getFont().getName()),
                () -> assertEquals(15, details_page.b3.getFont().getSize()),
                () -> assertEquals(true, details_page.b3.getFont().isBold()),
                () -> assertNotNull(details_page.b3.getActionListeners())
        );

        assertAll("Update Button",
                () -> assertEquals("Update", details_page.b4.getText()),
                () -> assertEquals(Color.pink, details_page.b4.getBackground()),
                () -> assertEquals(540, details_page.b4.getX()),
                () -> assertEquals(140, details_page.b4.getY()),
                () -> assertEquals(90, details_page.b4.getWidth()),
                () -> assertEquals(30, details_page.b4.getHeight()),
                () -> assertEquals("serif", details_page.b4.getFont().getName()),
                () -> assertEquals(15, details_page.b4.getFont().getSize()),
                () -> assertEquals(true, details_page.b4.getFont().isBold()),
                () -> assertNotNull(details_page.b4.getActionListeners())
        );


    }

    @Test
    @DisplayName("Action Listener Test")
    public void actionPerformedTest() {
        assertDoesNotThrow(() -> details_page.b1.doClick());
        assertDoesNotThrow(() -> details_page.b2.doClick());
        assertDoesNotThrow(() -> details_page.b3.doClick());
        assertDoesNotThrow(() -> details_page.b4.doClick());
    }
}