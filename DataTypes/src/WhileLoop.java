public class WhileLoop {
    static  boolean isLampTurnedOn = false;
    public static void main(String[] args) {
        turnOnOffLight();

        while (isLampTurnedOn){
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isLampTurnedOn = (isLampTurnedOn) ?  false : true;
        return  isLampTurnedOn;
    }
}
