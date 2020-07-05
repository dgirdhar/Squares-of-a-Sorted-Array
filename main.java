class Solution {
    public int[] sortedSquares(int[] A) {
        boolean sortAgain = false;
        
        if (A[0] < 0) {
            sortAgain = true;    
        }
        for (int i = 0; i < A.length; ++i) {
            A[i] *= A[i];
        }    
        
        if (sortAgain) {
            Arrays.sort(A);
        }
        
        return A;        
    }
}
