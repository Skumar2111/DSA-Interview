package Leetcodes;

import java.util.Arrays;

public class MeetingRooms {

    public static void main(String[] args) {

        int[] start = {1, 10, 7};
        int[] end = {4, 15, 10};
        System.out.println(minMeetingRooms(start,end));
    }


        public static int minMeetingRooms(int[] start, int[] end) {
            // code here
            if(start.length == 0)
            {
                return 0;
            }

            Arrays.sort(start);
            Arrays.sort(end);

            int n = start.length;
            int result = 0;
            int room = 0;

            int i = 0;
            int j = 0;

            while(i < n && j < n )
            {
                if(start[i] < end[j])
                {
                    room++;
                    result = Math.max(result, room);
                    i++;
                }
                else
                {
                    room--;
                    j++;
                }
            }

            return result;


        }
    }


