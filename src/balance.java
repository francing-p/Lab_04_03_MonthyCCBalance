public class balance {
    public static void main(String[] args){
        double INIT_BALANCE = 5000;
        double INT_RATE = .17;
        double eq1= (1+(INT_RATE/12));
        //Since exponents don't exist, have to complete the exponent part separately
        //Month one does not need to be put to the power of anything because it is put to the power of one
        double secondMon=Math.pow(eq1,2);
        double mon1= (INIT_BALANCE*eq1)-INIT_BALANCE;
        double mon2= (INIT_BALANCE*secondMon)-INIT_BALANCE;

        //unsure of how to round; should be $70.83 and $142.67
        System.out.println("The interest in month one is: $" + mon1);
        System.out.println("The interest in month two is: $" + mon2);

    }
}
