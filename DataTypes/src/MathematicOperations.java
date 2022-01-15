public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI); //Number Phi
        System.out.println(Math.E); //Number Euler

        System.out.println(Math.ceil(x)); //Return upper rounded integer
        System.out.println(Math.floor(x)); //Return lower rounded integer

        System.out.println(Math.pow(x,y)); //Return one number raised the other

        System.out.println(Math.max(x,y)); //Return the greatest number of both

        System.out.println(Math.sqrt(y)); //Return the square root of number

        System.out.println(Math.PI * Math.pow(y,2)); //Area of circle

        System.out.println(4 * Math.PI * Math.pow(y,2));//Area of a sphere

        System.out.println(4/3 * Math.PI * Math.pow(2,y));//Volume of a sphere
    }
}
