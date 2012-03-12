import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cypher
 */
public class NumTest {

    @Test
    public void testGetUtilizedVarNames() {
        Num n = new Num(3);
        assertArrayEquals(new String[0], n.getUtilizedVarNames());
    }

}