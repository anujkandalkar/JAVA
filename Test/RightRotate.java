public class RightRotate {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        for(int i=0;i<3;i++){
            int last=arr[arr.length-1];

        for(int j=arr.length-1;j>0;j--){

            arr[j]=arr[j-1];

        }

        arr[0]=last;
        }

        for(int num:arr)

            System.out.print(num+" ");

    }
}