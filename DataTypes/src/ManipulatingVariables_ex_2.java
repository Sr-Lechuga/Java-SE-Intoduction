public class ManipulatingVariables_ex_2 {
    public static void main(String[] args) {
        char c = 'z';
        int cConverted = c;

        int i = 250;
        long iL = 250L;
        short sL = (short) iL;

        double d = 301.067;
        long dL = (long)d;

        int i2 = 100;
        float i2F = 100 + 5000.66F;

        int i3 = 737;
        i3 *= 100;
        byte i3B = (byte)i3;

        double d2 = 298.638;
        long d2L = (long) d2/25;

        System.out.println(cConverted);
        System.out.println(iL);
        System.out.println(sL);
        System.out.println(dL);
        System.out.println(i2F);
        System.out.println(i3B);
        System.out.println(d2L);
    }
}
