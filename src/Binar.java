public class Binar {

    public static void main(String[] args) {
        int[] spravka = { -3, 5, 6, 7, 8, 9, 12, 15, 17};
        System.out.println(binar(spravka, 7, 0, spravka.length-1));
    }
    public static int binar(int[] a, int b, int low, int high){
        if (low > high) return -1;
        int mid = (low + high)/2;
        if (b < a[mid]) return binar( a, b, low, mid - 1);
        if (b > a[mid]) return binar( a, b, mid + 1, high);
        return mid;
    }
}


