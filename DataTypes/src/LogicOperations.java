public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Asignation operators
        System.out.println("a is equal than b? -> " + (a == b));
        System.out.println("a is different than b? -> " + (a != b));

        //Relation operators
        System.out.println("a is greater than b? -> " + (a > b));
        System.out.println("a is smaller than b? -> " + (a < b));
        System.out.println("a is greater or equal than b? -> " + (a >= b));
        System.out.println("a is smaller or equal than b? -> " + (a <= b));

        if (a == b){
            System.out.println("a equals b");
        }else if((a != b) && (a > b)) {
            System.out.println("a is different than b");
        }else if(a > b){
            System.out.println("a is greater than b");
        }else if(a < b){
            System.out.println("a is smaller than b");
        }else if(a <= b){
            System.out.println("a is smaller or equal than b");
        }else if(a >= b){
            System.out.println("a is greater or equal than b");

        }
    }
}
