import static org.junit.Assert.*;
import org.junit.*;

public class SkillTest {
    @Test
    public void testMultiply(){
        assertEquals(100, Skill.multiply(10, 10));
    }
}