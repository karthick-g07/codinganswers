# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public boolean isSubsequence(String s, String t) {
        
       int s1=0,t1=0;
       while(s1<s.length()&&t1<t.length())
       {
            if(s.charAt(s1)==t.charAt(t1))
                s1++;

            t1++;    
       }
    return s1==s.length();
    }
}
```