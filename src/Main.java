public class Main {
    public static void main(String[] args) {
        int[] arr= {4, 6, 5, 3, 2, 9, 10};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}
