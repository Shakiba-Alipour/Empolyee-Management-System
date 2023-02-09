import Employee.conn;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class connTest {

    @Test
    public void connTest(){
        conn conn=new conn();
        Connection connection=conn.c;
        Statement statement=conn.st;

        assertEquals("com.mysql.cj.jdbc.Driver", connection.getClass().getName());
        assertNotNull(statement);
    }
}