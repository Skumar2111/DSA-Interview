package Leetcodes;

import java.util.Arrays;

/* LeetCode - 881 - https://leetcode.com/problems/boats-to-save-people/description/
 */


public class BoatAndPeople {

    public static void main(String[] args) {

        int[] people = {3,2,2,1};
        int limit = 3;

        System.out.println(numRescueBoats(people,limit));


    }
        public static int numRescueBoats(int[] people, int limit) {

            Arrays.sort(people);
            int count = 0;

            int left = 0;
            int right = people.length - 1;

            int boatCount = 0;

            while(left <= right)
            {
                int sum = people[left] + people[right];
                if(sum <= limit)
                {
                    boatCount++;
                    left++;
                    right--;
                }
                else
                {
                    boatCount++;
                    right--;
                }



            }

            return boatCount;
        }
    }




