public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bonus $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50 discount
        salary = salary - 50;
        System.out.println(salary);

        //2 extra hours $30 each
        //Food: $45
        salary = salary +(30*2) -45;
        System.out.println(salary);

        //Update text chains
        String employeeName = "Carlos Montero";
        employeeName = employeeName + " Montelongo";
        System.out.println(employeeName);

        employeeName = "Roberto " + employeeName;
        System.out.println(employeeName);
    }
}
