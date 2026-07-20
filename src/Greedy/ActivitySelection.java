package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelection {

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int n = start.length;

        ArrayList<ActivityPair> activityPairArrayList = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            activityPairArrayList.add(new ActivityPair(start[i],end[i]));
        }

        Collections.sort(activityPairArrayList,(a,b) -> a.end - b.end);

        int count = 1;
        int previous = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(activityPairArrayList.get(i).start > activityPairArrayList.get(previous).end)
            {
                count++;
                previous = i;
            }
        }

        System.out.println(count);
        return;

    }
}

class ActivityPair
{
    int start;
    int end;

    public ActivityPair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
