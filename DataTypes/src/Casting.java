public class Casting {
    public static void main(String[] args) {
        //In a year I give homes to 30 dogs
        //How many dog I relocate each month
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimated
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exact
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        //Autocast
        //double c = a/b; = 2.0
        double c = (double)a/b; //2.5
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI); //Valor ASCII 49

        short nS = (short) n; //char es mas grande que short
        System.out.println(nS);
    }

}
