package FindAndReplace;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jonathan Dedering on 9/21/15.
 */
public class FindAndReplaceTest {

    @Test
    public void removePunc() {
        FindAndReplace fnr = new FindAndReplace();
        String result = fnr.removePunc(",n,n,n");
        assertTrue(result.equals("nnn"));
    }

    @Test
    public void importReplacementFile() {
        FindAndReplace fnr = new FindAndReplace();
        String replacementFile = "/Users/Private/IdeaProjects/Dedering-Find_and_Replace/findandreplace.txt";
        String result = fnr.importFiles(replacementFile);
        assertNotNull(result);
    }

    @Test
    public void importReplacementInput() {
        FindAndReplace fnr = new FindAndReplace();
        String replacementInput = "/Users/Private/IdeaProjects/Dedering-Find_and_Replace/findandreplace-input.txt";
        String result = fnr.importReplacementFiles(replacementInput);
        assertNotNull(result != null);
    }

}