import Employee.welcome_page;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class welcome_pageTest {
    welcome_page welcome_page;

    @Before
    public void setUp() {
        welcome_page = new welcome_page();
    }

    @Test
    public void welcome_pageTest() {
        assertAll("welcome_page",
                () -> assertEquals("EMS", welcome_page.frame.getName()),
                () -> assertEquals(Color.red, welcome_page.frame.getBackground()),
                () -> assertEquals(JFrame.EXIT_ON_CLOSE, welcome_page.frame.getDefaultCloseOperation()),
                () -> assertEquals(true, welcome_page.frame.isResizable())
        );

        assertNotNull(welcome_page.b);
        assertAll("Button",
                () -> assertEquals("Click Here To Continue", welcome_page.b.getName()),
                () -> assertEquals(525, welcome_page.b.getX()),
                () -> assertEquals(530, welcome_page.b.getY()),
                () -> assertEquals(180, welcome_page.b.getHeight()),
                () -> assertEquals(40, welcome_page.b.getWidth()),
                () -> assertEquals(Color.DARK_GRAY, welcome_page.b.getBackground()),
                () -> assertEquals(Color.white, welcome_page.b.getForeground()),
                () -> assertNotNull(welcome_page.b.getActionListeners())
        );

    }

    @Test
    @DisplayName("Action Listener Test")
    public void actionPerformedTest() {
        assertDoesNotThrow(() -> welcome_page.b.doClick());
        assertEquals(false, welcome_page.frame.isVisible());
    }
}
