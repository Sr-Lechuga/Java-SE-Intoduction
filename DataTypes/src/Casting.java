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
    }

}
