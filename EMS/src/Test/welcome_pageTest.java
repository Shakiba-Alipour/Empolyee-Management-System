import Employee.welcome_page;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

public class welcome_pageTest implements ActionListener {
    welcome_page welcome_page;
    JFrame fr;
    JButton btn;

    @Before
    public void setUp() {
        welcome_page = new welcome_page();
        btn = welcome_page.b;
        fr = welcome_page.frame;
    }

    @Test
    public void welcome_pageTest() {
        assertAll("welcome_page",
                () -> assertEquals("EMS", fr.getName()),
                () -> assertEquals(Color.red, fr.getBackground()),
                () -> assertEquals(JFrame.EXIT_ON_CLOSE, fr.getDefaultCloseOperation()),
                () -> assertEquals(true, fr.isResizable())
        );

        assertNotNull(btn);
        assertAll("Button",
                () -> assertEquals("Click Here To Continue", btn.getName()),
                () -> assertEquals(525, btn.getX()),
                () -> assertEquals(530, btn.getY()),
                () -> assertEquals(180, btn.getHeight()),
                () -> assertEquals(40, btn.getWidth()),
                () -> assertEquals(Color.DARK_GRAY, btn.getBackground()),
                () -> assertEquals(Color.white, btn.getForeground())
        );

    }

    @Test
    public void actionPerformed(ActionEvent e) {
        assertEquals(false, fr.isVisible());
    }
}
