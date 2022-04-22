import static org.junit.Assert.*;//imports junit.Assert which is needed to use assertEquals
import org.junit.*;//it imports jUnit

public class MarkdownParseTest {//This is the class where are the testing methods will be held
    @Test//lets jUnit know this is a test
    public void addition() {//This is a method which will run when you call addition 
        assertEquals(2, 1 + 1);//This checks that the (expected answer, what we try to check) matches
    }

    
}
