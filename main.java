class Solution {
    public int[] sortedSquares(int[] A) {
        boolean sortAgain = false;
        int array1Index = 0;
        int array2Index = A.length;
        boolean foundPositiveValueIndex = false;
        
        if (A[0] < 0) {
            sortAgain = true;    
        }
        for (int i = 0; i < A.length; ++i) {
            if (A[i] >= 0 && !foundPositiveValueIndex) {
                array2Index = i;
                array1Index = i - 1;
                foundPositiveValueIndex = true;
            }
            A[i] *= A[i];
        }    
        
        if (sortAgain) {
            int index = 0;
            int []B = new int[A.length];
            
            while (true) {
                if (array1Index < 0 && array2Index > A.length - 1) {
                    break;
                }
                else {
                    if (array1Index >= 0 && array2Index < A.length) {
                        if (A[array1Index] < A[array2Index]) {
                            B[index++] = A[array1Index--];
                        }
                        else {
                            B[index++] = A[array2Index++];
                        }
                    }
                    else if (array1Index <= 0 && array2Index < A.length) {
                        B[index++] = A[array2Index++];
                    }
                    else {
                        B[index++] = A[array1Index--];
                    }
                }
            }
            return B;
        }
        
        return A;        
    }
}
