package easy;

public class BinarrySearch {
    public int find(int[] arr,int low,int high,int key){
       if (low>high || arr[low]<key || arr[high]>key){
           return -1;
       }
       int middle = (low+high)/2;
       if (arr[middle]>key){
           find(arr,low,middle-1,key);
       }else if(arr[middle]<key){
           find(arr,middle+1,high,key);
       }else {
           return middle;
       }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int key = 4;
        BinarrySearch binarrySearch = new BinarrySearch();
        int position = binarrySearch.find(arr,0,arr.length,4);
        if (position==-1){
            System.out.println("没找到");
        }else {
            System.out.println(position);
        }
    }
}
