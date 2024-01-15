public class ArrayOps {
    public static void main(String[] args) {
     
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int n=array.length;
        int sum=0;
        int originalSum=0;
        originalSum=((n+1)*(n))/2;
        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        return originalSum-sum;
    }
   

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max=0;
        int max2=0;
        int x=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
                x=i;
            }
        }
       for(int i=0;i<array.length;i++){
        if(array[i]>max2 && array[i]<=max &&x!=i){
            max2=array[i];
        }
       }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
       boolean find=false;
       for(int i=0;i<array1.length;i++){
        find=false;
        for(int x=0;x<array2.length;x++){
          if(array1[i]==array2[x]){
            find=true;
          }
        }
        if(find==false) return false;
       }
       return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean sorted=true;
       if(array[0]>array[1]){// from the max to min
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){sorted=false;}
        }
       }
       if(array[0]<array[1]){//from the min to max
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){sorted=false;}
        }
       }
        return sorted;
    }

}
