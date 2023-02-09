import Employee.print_data;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

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


    }

    @After
    public void tearDown() {
    }
}