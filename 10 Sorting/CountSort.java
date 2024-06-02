public class CountSort {

    public static void countSort(int arr[]){
        int n = arr.length;

        int mxEle = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            mxEle = Math.max(mxEle, arr[i]);
        }

        int countArr[] = new int[mxEle+1];

        for(int i = 0;i<n;i++){
            countArr[arr[i]]++;
        }

        int j = 0;
        for(int i = 0;i<mxEle;i++){
            while(countArr[i]>0){
                arr[j] = i;
                j++;
                countArr[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,1,4,3,2};

        countSort(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
