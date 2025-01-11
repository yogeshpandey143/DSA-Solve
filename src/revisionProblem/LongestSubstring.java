package revisionProblem;

import java.util.HashMap;
//Given a string s, find the length of the longest substring with all distinct characters.
//
//Examples:
//Input: s = "geeksforgeeks"
//Output: 7
public class LongestSubstring {

    public static int longestUniqueSubstr(String s) {
        // code here
        int i =0, j=0, n = s.length();
        int res=1;
        HashMap<Character,Integer> map = new HashMap<>();

        while(j<n)
        {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(map.size()==j-i+1)
            {
                res=Math.max(res,j-i+1);
                j++;
            }
            else{
                while(i<n && map.size()!=j-i+1)
                {
                    char temp = s.charAt(i);
                    if(map.get(temp)>1) map.put(ch, map.get(ch)-1);
                    else map.remove(temp);

                    i++;
                }

                if(map.size()==j-i+1) res = Math.max(res,j-i+1);
                j++;
            }

        }



        return res;
    }
    public static void main(String[] args) {



        System.out.println(longestUniqueSubstr("geeksforgeeks"));

    }
}
