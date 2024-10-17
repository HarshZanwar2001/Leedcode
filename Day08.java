public class Day08 {
    public int maximumSwap(int num) {

        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;

        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[arr[i] - '0'] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 9; j > arr[i] - '0'; j--) {
                if (last[j] > i) {
                    char temp = arr[i];
                    arr[i] = arr[last[j]];
                    arr[last[j]] = temp;
                    return Integer.parseInt(new String(arr));

                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Day08 obj = new Day08();
        System.out.println(obj.maximumSwap(2736));
    }

}
