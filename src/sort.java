public class sort {
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(int [] arr){
        int swaps=0;
        while (swaps==0) {
            for (int i=0; i< arr.length; i++){
                if (arr[i]==arr[i+1]){
                     swaps=swaps+1;
                     swap(arr, i, i+1);
                }
            }
        }
    }

    public static  int [] sortedArr(int count){
        int [] arr= new int[10000];
        for(int i=0; i<arr.length;i++){
            arr[i]=i;
        }
        return arr;
    }

    public static int[]randomIntArr(int count){
        int [] arr = new int[10000];
        for (int i=0; i<arr.length; i++){
            arr[i]=(int)(Math.random()+10001);
        }
        return arr;
    }
}
