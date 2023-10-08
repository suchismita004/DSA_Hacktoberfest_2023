
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,6,34,56,78,90};
		int target=78;
		int ans=find(arr,target);
		System.out.println(ans);
	}
	static int find(int arr[],int target){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(target==arr[mid]){
				return mid;
			}
			if(target>arr[mid]){
				start=mid+1;
			}else{
				end=mid-1;
			}
	}
		return -1;
	}

}
