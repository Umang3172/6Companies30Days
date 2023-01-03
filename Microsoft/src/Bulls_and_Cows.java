
// Link - https://leetcode.com/problems/bulls-and-cows/description/
public class Bulls_and_Cows {

    // TC = O(n)
    // SC = O(const) as only extra space needed is for 2 extra arrays of const length 9

    class Solution {



        public String getHint(String secret, String guess) {
            int bulls=0,cows=0;
            int n=secret.length();
            int[] sec = new int[10];
            int[] gue = new int[10];

            for(int i=0;i<n;i++){
                // For getting integer value
                int s=secret.charAt(i)-'0';
                int g=guess.charAt(i)-'0';

                // for bulls
                if(s==g){
                    bulls++;
                }
                else{
                    sec[s]++;
                    gue[g]++;
                }
            }

            // for cows
            for(int i=0;i<sec.length;i++){
                cows+=Math.min(sec[i],gue[i]);
            }

            return bulls+"A"+cows+"B";
        }
    }

}
