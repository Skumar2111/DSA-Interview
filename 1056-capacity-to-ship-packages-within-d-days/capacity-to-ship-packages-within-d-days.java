class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int min = 0;
        int max = 0;

        for(int i = 0 ; i < weights.length ; i++)
        {
            min = Math.max(min,weights[i]);
            max = max + weights[i];
        }


        while(min <= max)
        {
            int mid = min + (max - min) / 2;

            if(isPossible(weights,days,mid))
            {
                max = mid-1;
            }
            else
            {
                min = mid + 1;
            }

            
        }
        return min;
    }

    public boolean isPossible(int[] weights, int days ,int capacity)
    {
        int currentWeight = 0 ;
        int requiredDays = 1;

        for(int weight : weights)
        {
            if(weight + currentWeight > capacity)
            {

              requiredDays++;
              currentWeight = weight;
            }
            else
            {
                currentWeight += weight;
            }
        }

        if(requiredDays > days)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}