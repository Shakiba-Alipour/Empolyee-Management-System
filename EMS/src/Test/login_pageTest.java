import Employee.login_page;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class login_pageTest {
    login_page login_page;

    @Before
    public void setUp() {
        login_page = new login_page();
    }

    @Test
    public void login_pageTest() {
        assertAll("login page",
                () -> assertNotNull(login_page.frame),
                () -> assertNotNull(login_page.t1),
                () -> assertNotNull(login_page.t2),
                () -> assertNotNull(login_page.l1),
                () -> assertNotNull(login_page.l2),
                () -> assertNotNull(login_page.b1),
                () -> assertNotNull(login_page.b2)
        );

        assertAll("frame",
                () -> assertEquals("Login", login_page.frame.getTitle()),
                () -> assertEquals(Color.WHITE, login_page.frame.getBackground()),
                () -> assertNotNull(login_page.frame.getLayout()),
                () -> assertEquals(JFrame.EXIT_ON_CLOSE, login_page.frame.getDefaultCloseOperation()),
                () -> assertEquals(380, login_page.frame.getX()),
                () -> assertEquals(230, login_page.frame.getY()),
                () -> assertEquals(600, login_page.frame.getWidth()),
                () -> assertEquals(300, login_page.frame.getHeight()),
                () -> assertEquals(true, login_page.frame.isVisible()),
                () -> assertEquals(Color.WHITE, login_page.frame.getContentPane().getBackground())
        );

        assertAll("Username Label",
                () -> assertEquals("Username", login_page.l1.getText()),
                () -> assertEquals(40, login_page.l1.getX()),
                () -> assertEquals(20, login_page.l1.getY()),
                () -> assertEquals(100, login_page.l1.getWidth()),
                () -> assertEquals(30, login_page.l1.getHeight())
        );

        assertAll("Password Label",
                () -> assertEquals("Password", login_page.l2.getText()),
                () -> assertEquals(40, login_page.l2.getX()),
                () -> assertEquals(70, login_page.l2.getY()),
                () -> assertEquals(100, login_page.l2.getWidth()),
                () -> assertEquals(30, login_page.l2.getHeight())
        );

        assertAll("Text Field",
                () -> assertEquals(150, login_page.t1.getX()),
                () -> assertEquals(20, login_page.t1.getY()),
                () -> assertEquals(150, login_page.t1.getWidth()),
                () -> assertEquals(30, login_page.t1.getHeight())
        );

        assertAll("Password Field",
                () -> assertEquals(150, login_page.t2.getX()),
                () -> assertEquals(70, login_page.t2.getY()),
                () -> assertEquals(150, login_page.t2.getWidth()),
                () -> assertEquals(30, login_page.t2.getHeight())
        );

        assertAll("Login Button",
                () -> assertEquals("Login", login_page.b1.getText()),
                () -> assertEquals(Color.BLACK, login_page.b1.getBackground()),
                () -> assertEquals(Color.WHITE, login_page.b1.getForeground()),
                () -> assertEquals(40, login_page.b1.getX()),
                () -> assertEquals(140, login_page.b1.getY()),
                () -> assertEquals(120, login_page.b1.getWidth()),
                () -> assertEquals(30, login_page.b1.getHeight()),
                () -> assertEquals("serif", login_page.b1.getFont().getName()),
                () -> assertEquals(15, login_page.b1.getFont().getSize()),
                () -> assertEquals(true, login_page.b1.getFont().isBold()),
                () -> assertNotNull(login_page.b1.getActionListeners())
        );

        assertAll("Cancel Button",
                () -> assertEquals("Cancel", login_page.b2.getText()),
                () -> assertEquals(Color.BLACK, login_page.b2.getBackground()),
                () -> assertEquals(Color.WHITE, login_page.b2.getForeground()),
                () -> assertEquals(180, login_page.b2.getX()),
                () -> assertEquals(140, login_page.b2.getY()),
                () -> assertEquals(120, login_page.b2.getWidth()),
                () -> assertEquals(30, login_page.b2.getHeight()),
                () -> assertEquals("serif", login_page.b2.getFont().getName()),
                () -> assertEquals(15, login_page.b2.getFont().getSize()),
                () -> assertEquals(true, login_page.b2.getFont().isBold()),
                () -> assertNotNull(login_page.b2.getActionListeners())
        );
    }

//    @After
//    void tearDown() {
//    }
}