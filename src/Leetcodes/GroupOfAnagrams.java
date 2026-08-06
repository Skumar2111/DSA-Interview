package Leetcodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* LeetCode - 49
* https://leetcode.com/problems/group-anagrams/description/
* */

class GroupOfAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String,Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i++)
        {

            String key = getHash(strs[i]);

            if(!hashMap.containsKey(key))
            {
                hashMap.put(key,result.size());
                result.add(new ArrayList<>());
            }

            result.get(hashMap.get(key)).add(strs[i]);


        }

        return result;



    }



    public static String getHash(String s)
    {
        StringBuilder hash = new StringBuilder();
        int[] charArr = new int[26];

        for(char c : s.toCharArray())
        {
            charArr[c -'a']++;
        }

        for(int j = 0 ; j < 26 ; j++)
        {
            hash.append(charArr[j]);
            hash.append("$");
        }

        return hash.toString();





    }
}