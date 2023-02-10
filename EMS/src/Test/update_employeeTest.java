import Employee.update_employee;
import org.junit.After;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class update_employeeTest {
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


    }

    @After
    void tearDown() {
    }
}