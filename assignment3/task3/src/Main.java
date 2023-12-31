public class Main {
    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        printarray(array);
        reversearray(array);
    }
    public static void printarray(int[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void reversearray(int[] array){
        for(int i = array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}