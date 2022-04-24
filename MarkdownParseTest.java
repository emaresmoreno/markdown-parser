import static org.junit.Assert.*;//imports junit.Assert which is needed to use assertEquals
import org.junit.*;//it imports jUnit
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {//This is the class where are the testing methods will be held
    @Test//lets jUnit know this is a test
    public void addition() {//This is a method which will run when you call addition 
        assertEquals(2, 1 + 1);//This checks that the (expected answer, what we try to check) matches
    }

    @Test
    public void checkLinks() throws IOException {
            Path result = Path.of("test-file.md");//gets a path to test-file.md (says it exixts) (Needed for line 17)
            String contents = Files.readString(result);
            //contents gets the information that is stored in result
            ArrayList<String> inputResult = MarkdownParse.getLinks(contents);//puts wtv is stored in result (now called contents) into the class we created
            assertEquals(inputResult, List.of("https://something.com", "some-thing.html"));//checks expected and actual output 
            //The error on line 17 cannot be removed. I tried to test the checkLinks test using the red circle and the error appeared. 
    }

    @Test
    public void check() throws IOException {
        Path whichFile = Path.of("testfile1.md");
        String contentsOf = Files.readString(whichFile);
        ArrayList<String> outcome = MarkdownParse.getLinks(contentsOf);
        assertEquals(outcome, List.of(""));
    }

    

}
