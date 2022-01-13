public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);//4
        //Postfix
        lives--; //Decrement
        System.out.println(lives);//3

        lives++; //Increment
        System.out.println(lives);//4

        //Prefix
        int gift = 100 + lives++; //Postfix
        /*It print before increment the variable*/
        System.out.println(gift);
        System.out.println(lives);

        gift = 100 + ++lives; //Prefix
        System.out.println(gift);
    }
}
