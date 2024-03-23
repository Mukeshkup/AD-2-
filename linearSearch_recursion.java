public class linearSearch_recursion {
    public static void main(String[] args) {
        System.out.println("Linear search using Recursion!");
        int key=89;
        int arr[]={3,4,5,44,89,34};
        boolean numberFoundNotFound= linearSearch(arr,key,0);
        if(numberFoundNotFound)
            System.out.println("Number Found");
        else
            System.out.println("Number Not Found");
    }
    
    static boolean linearSearch(int arr[],int key,int index){
        
        if(index==arr.length)
            return false;
        else
            if(arr[index]==key)
                return true;
            else
                return linearSearch(arr,key,index+1);
        
    }
}