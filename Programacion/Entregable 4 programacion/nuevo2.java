public class nuevo2 {
    public static void burbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
                for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                    }
                
                        for (int x = 0; x < arr.length; x++) {
                            System.out.print(arr[x] + " ");
                        }
                    System.out.println("");
                }
        }
    }

    public static void main(String[] args) {
      
        int[] myArr = {5, 1, 4, 2, 8};
        System.out.println("Original array:");
            for (int i = 0; i < myArr.length; i++) {
                System.out.print(myArr[i] + " ");
            }
        System.out.println("");

        System.out.println("Array after sorting:");
        burbuja(myArr);
    }
}
