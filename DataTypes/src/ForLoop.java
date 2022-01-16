public class ForLoop {
    static  boolean isLampTurnedOn = false;

    public static void main(String[] args) {
        if(turnOnOffLight()){
            for (int i = 1; i <= 100 ; i++) {
                printSOS();
            }
        }

    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        //isLampTurnedOn = (isLampTurnedOn) ?  false : true;
        isLampTurnedOn = !isLampTurnedOn;
        return  isLampTurnedOn;
    }
}
