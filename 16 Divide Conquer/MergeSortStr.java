public class MergeSortStr {

    public static boolean compare(String str1, String str2) {
        if(str1.compareTo(str2) > 0){ //s1 is greater
            return true;
        }

        return false;
    }

    public static void merge(String str[],int l,int mid,int r) {
        int n1 = mid-l+1;
        int n2 = r - mid;

        String left[] = new String[n1];
        String right[] = new String[n2];

        for(int i= 0;i<n1;i++){
            left[i] = str[l+i];
        }
        
        for(int i = 0;i<n2;i++){
            right[i] = str[mid+1+i];
        }
        
        int i = 0,j=0,k=l;
        while(i<n1 && j<n2){
            if(compare(left[i],right[j]) == false){   //means left[i] is bigger
                str[k] = left[i];
                i++;
                k++;
            }else{
                str[k] = right[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            str[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            str[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSortString(String str[],int l,int r) {
        if(l<r){
            int mid = l+(r-l)/2;

            mergeSortString(str, l, mid);
            mergeSortString(str, mid+1, r);

            merge(str,l,mid,r);
           }
    }
    public static void main(String[] args) {
        String str[] = {"sun","earth","mars","zebra","mercury","apple"};

        int n = str.length;

        mergeSortString(str,0,n-1);

        for(int i = 0;i<n;i++){
            System.out.println(str[i]+ " ");
        }
    }
}
