public class checkLength {

    public static final int PART_SCORE = 60;

    public int getScore(String input1, String input2) {

        int lenA = input1.length();
        int lenB = input2.length();

        if(lenA == lenB) {
            return 60;
        }else if((lenA >= 2 * lenB) || (lenB >= 2 * lenA)){
            return 0;
        }else {
            int maxLen = Math.max(lenA, lenB);
            int minLen = Math.min(lenA, lenB);
            int gap = maxLen-minLen;
            double logic = 1- (double)(gap)/minLen;
            return (int)(logic* PART_SCORE);
        }
    }
}
