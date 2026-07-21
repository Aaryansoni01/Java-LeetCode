import java.util.*;
class Solution {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

        }
        System.out.println("enter target element");
        int target=sc.nextInt();
        int ans = search(arr,target);
        System.out.println(ans);
    }
    public static  int search(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
    return -1;   
    }

}