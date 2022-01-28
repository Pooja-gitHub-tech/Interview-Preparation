public class DecimalToBinary {

    public static String dToB(int n) {
        int q = n;
        StringBuilder r = new StringBuilder();
        while(q!=0) {
            r.append(q%2);
            q /= 2;
        }
        return r.reverse().toString();
    }

    public static void main(String args[]) {
        System.out.println(dToB(70));
    }
}
