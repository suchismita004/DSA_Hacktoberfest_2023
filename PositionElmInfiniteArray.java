//position of an element in an infinite sorted array
public class PositionElmInfiniteArray {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = {3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
    int target = 10;
    System.out.println(ans(arr, target));
	}
	static int ans(int arr[],int target){
		int start=0;
		int end=1;  //first  we start with box of size 2  so,start=0,end=1
		
		while(target>arr[end]){
			int temp=end+1;   //newstart
			end=end+(end-start+1)*2;
			start=temp;
		}
		return find(arr,target,start,end);
	}
	
	static int find(int arr[],int target,int start,int end){
		
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
