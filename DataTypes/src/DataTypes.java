public class DataTypes {
    public static void main(String[] args) {
        //Integers
        byte nB = 127; //Byte, from -128 to 127
        short nS = 32767; //Short, from -32,768 to 32,767
        int n = 1234567890; //Integer, until 2,147,483,647 4 byte
        long nL = 12345678901L; //Long 8 byte

        //Floating point
        float nF = 123.456F;//float, from 1.4 e-45 to 3.4 e+38
        double nD = 123.4567890;

        //Since Java 10
        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Diego Rivera";
        System.out.println("Employee: " + employeeName + "\nSalary: " + totalSalary);
    }
}
