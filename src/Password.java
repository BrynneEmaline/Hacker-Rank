public class Password {


    /* a password string: pwd consists of binary characters
   it must be divided into substrings of non-overlapping, even length substrings.
    ***** Each substring can only contain 1s or 0s, not a mix. *****

    Find the minimum number of characters that must be flipped in the password string,
    i.e. changed from 0 to 1 or 1 to 0 to allow the string to be divided as described.
    Complete the function getMinFlips in the editor below.
    getMinFlips takes the following arguments:
    str pwd: the binary string.
    Returns: int: the minimum number of flips to make the division possible.
    Constraints: 2<= pwd <= 10^5 , the length of pwd is even, pwd contains only 1s and 0s

     */


    public int getMinFlips(String pwd) {

        int flipsCount = 0;
        for (int i = 0; i < pwd.length(); i += 2) {
            char first = pwd.charAt(i);
            char second = pwd.charAt(i + 1);
            if (first == second) {
            } else {
                flipsCount++;
            }
        }
        System.out.println("flipsCount = " + flipsCount);
        return flipsCount;
    }
}
