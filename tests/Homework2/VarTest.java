import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cypher
 */
public class VarTest {

    @Test
    public void testGetUtilizedVarNames() {
       Var a = new Var("a");
       assertArrayEquals(new String[]{"a"}, a.getUtilizedVarNames());
    }

}