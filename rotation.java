public class rotation {
    public static void main(String args[]) {
        int A[]={5,9,6,10,12,7,3,5,7,2,6,4,2,9};
        int temp;
        temp=A[0];
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
            System.out.println(A[i]);
            System.out.println(temp);


        }
      
    }   
}
