package LeetCode_ADailyTopic;


/**
 * @author SouthWind
 */
public class Leet_299 {
    public String getHint(String secret, String guess) {
        char[] secretChar = secret.toCharArray();
        char[] guessChar = guess.toCharArray();
        String res = "";
        int A = 0;
        int B = 0;
        for (int i = 0; i < secretChar.length; i++) {
            char c = secretChar[i];
            if (c == guessChar[i]) {
                A++;
            }
        }

        return secret;
    }
}
