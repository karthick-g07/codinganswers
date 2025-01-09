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
    public String reverseVowels(String s) {

         
        
        char a[]=s.toCharArray();
        char t[]=new char[s.length()];
        int y=0;
      for(char x:a)
        {
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
            {
                t[y++]=x;
            }
        }
        y--;
        for(int i=0;i<s.length();i++)
        {
             if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
            {
                a[i]=t[y];
                y--;
            }
        }
        String res=new String(a);
    return res;   
         
    }
}
```