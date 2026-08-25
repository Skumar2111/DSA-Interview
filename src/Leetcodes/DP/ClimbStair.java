package Leetcodes.DP;

public class ClimbStair {

        public static int climbStairs(int n) {
            int[] memoization = new int[n+1];
            return recurClimbStairs(n,memoization);
        }

        public static int recurClimbStairs(int n, int[] memoization)
        {
            if (n == 1) return 1;
            if (n == 2) return 2;

            if(memoization[n]!=0)
            {
                return memoization[n];
            }

            memoization[n] = recurClimbStairs(n-1,memoization) + recurClimbStairs(n-2,memoization);

            return memoization[n];
        }
    }

