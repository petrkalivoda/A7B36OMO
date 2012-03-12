import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cypher
 */
public class ProgramTest {

    @Test
    public void testUsesUnitializedVariables() {
        Program p = new Program(
            new Assignment[]{
                new Assignment("a", new Num(3)),
                new Assignment("b", new Var("a"))
            });

        Program p2 = new Program(
            new Assignment[]{
                new Assignment("a", new Num(3)),
                new Assignment("b", new Addition(new Var("a"), new Var("c")))
            });

        Program p3 = new Program(
            new Assignment[]{
                new Assignment("a", new Addition(new Var("a"), new Var("a")))
            });

        Program p4 = new Program(
            new Assignment[]{
                new Assignment("a", new Num(3)),
                new Assignment("b", new Addition(new Var("a"), new Var("a")))
            });

        assertFalse(p.usesUninitializedVariables());
        assertTrue(p2.usesUninitializedVariables());
        assertTrue(p3.usesUninitializedVariables());
        assertFalse(p4.usesUninitializedVariables());
    }

}