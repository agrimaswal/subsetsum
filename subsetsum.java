



//agrim aswal
class subset{

    static boolean isSubsetSum(int arr[],int n,int sum){
        if(sum==0){
            return true;
        }

        if(n==0){
            return false;
        }

        if(arr[n-1]>sum){
            return isSubsetSum(arr, n-1, sum);
        }
        return isSubsetSum(arr, n-1, sum)||isSubsetSum(arr, n-1, sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int arr[]={3, 34, 4, 12, 5, 2};
        int sum=9;
        int n=arr.length;
        if(isSubsetSum(arr, n, sum)==true){
            System.out.println("found the subset with the given sum");

        }
        else{
            System.out.println("no subset with the given sum");
        }
    }
}

