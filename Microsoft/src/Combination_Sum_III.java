// Link - https://leetcode.com/problems/combination-sum-iii/

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {

    // TC - 9Ck = (9!)/((k!)*(9-k)!)
    // SC - O(Constant)

    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> res = new ArrayList<>();

            helper(k,n,new boolean[10],new ArrayList<>(),res,0);

            return res;
        }

        public void helper(int k, int n, boolean[] taken, List<Integer> list, List<List<Integer>> res, int last){

            if(k==0 && n==0){
                res.add(new ArrayList<>(list));
                return ;
            }
            if(k<=0 || n<=0) return ;

            for(int i=last+1;i<=9;i++){
                if(!taken[i]){
                    taken[i]=true;
                    list.add(i);

                    helper(k-1,n-i,taken,list,res,i);

                    list.remove(list.size()-1);
                    taken[i]=false;
                }
            }
        }
    }
}
