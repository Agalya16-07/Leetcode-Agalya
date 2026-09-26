// Last updated: 9/26/2026, 8:24:32 PM
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        if(source.length !=target.length){
4            return false;
5        }
6        long ss = 0;
7        long st=0;
8        for(int i=0; i<source.length; i++){
9            ss+=source[i];
10            st+=target[i];
11        }
12        return ss==st;
13    }
14}