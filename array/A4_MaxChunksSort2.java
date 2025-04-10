package apx.array;

public class A4_MaxChunksSort2 {
    public int maxChunksToSorted(int[] arr) {
        int n =  arr.length ;

        int pfm [] = new int[n];
        int sfm [] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i< n ;i++){
            max = Math.max(arr[i],max);
            pfm[i] = max ;

        }

        for(int i = n -1 ;  i>=0 ; i--){
            min = Math.min(arr[i],min);
            sfm[i] = min;
        }
        int count =0 ;
        for(int i = 0 ; i < n-1 ; i++){
            if(pfm[i] <= sfm[i+1]){
                count++;
            }
        }
        count++;

        return count;
    }
}
