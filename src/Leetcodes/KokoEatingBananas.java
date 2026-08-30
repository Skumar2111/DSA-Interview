package Leetcodes;

public class KokoEatingBananas {

        public int minEatingSpeed(int[] piles, int h) {
            int low = 1;
            int high = 1;
            int answer = 0;

            for(int i = 0 ; i < piles.length ; i++)
            {
                if(piles[i] > high)
                {
                    high = piles[i];
                }
            }

            while(low <= high)
            {
                int mid = low + (high - low) / 2;

                if(isPossible(piles,mid,h))
                {
                    answer = mid;
                    high = mid-1;
                }
                else
                {
                    low = mid + 1;
                }
            }

            return low;
        }

        private boolean isPossible(int[] piles, int speed, int h) {

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + speed - 1) / speed;

                if (hours > h) {
                    return false;
                }
            }

            return true;
        }
    }

