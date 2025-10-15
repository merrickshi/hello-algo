package leetcode;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static leetcode.PalindromeValid.*;

public class PalindromeValidTest extends TestCase {

    @Test
    public void testPalindromeValid_IsPalindrome_true() {
        String str = "1red rum, sir, is murder1";
        Boolean result = PalindromeValid(str);

        Assert.assertTrue(result);
    }

    @Test
    public void testPalindromeValid_NotPalindrome_false() {
        String str = "apple";
        Boolean result = PalindromeValid(str);

        Assert.assertFalse(result);
    }


    @Test
    public void testSimplified() {
        String str = "1red rum, sir, is murder1";
        String result = Simplified(str);

        Assert.assertEquals(result, "1redrumsirismurder1");
    }
}