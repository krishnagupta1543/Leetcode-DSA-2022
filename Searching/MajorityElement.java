// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // TIME COMPLEXITY - O(NLOGN)
       Arrays.sort(a);
       int i = 0; 
       int mx = size/2;
       while(i<a.length)
       {
           int t = a[i];
           int p = 0;
           while(i<a.length && p<=mx && a[i] == t){
               i++;
               p++;
           }
           if(p > mx) return t;
       }
       return -1;
      
    }
}
