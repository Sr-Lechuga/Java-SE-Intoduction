public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 0;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Achive sended.");
            int i = 0;
            i++;
        }else {
            fileSended--;
            System.out.println("Please turn on your Bluethoot, to start transference");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
        //System.out.println(i); i is out of scope
    }
}
