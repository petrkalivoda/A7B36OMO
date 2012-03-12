import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cypher
 */
public class AdditionTest {

    @Test
    public void testGetUtilizedVarNames() {
        Addition a = new Addition(new Var("a"), new Var("c"));
        Addition a2 = new Addition(new Var("a"), new Var("a"));

        assertArrayEquals(new String[]{"a", "c"}, a.getUtilizedVarNames());
        assertArrayEquals(new String[]{"a"}, a2.getUtilizedVarNames());
    }

}