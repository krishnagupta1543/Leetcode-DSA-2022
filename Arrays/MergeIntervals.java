class Solution {
    // Time complexity O(NLogN)
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> arr = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] i: intervals){
            int s = i[0];
            int e = i[1];
            
            if(end >= s){
                end = Math.max(end, e);
            }else{
                arr.add(new int[]{start, end});
                start = s;
                end = e;
            }
        }

        arr.add(new int[]{start, end});
        // return arr.toArray(new int[0][]);
        int[][] ans = new int[arr.size()][2];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < 2; j++){
                ans[i][j] = arr.get(i)[j];
            }
        }
        return ans;
    }
}
