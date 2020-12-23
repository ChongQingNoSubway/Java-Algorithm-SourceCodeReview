public class Bit {

    //print binary representation of a int value
    public static void printBinary(int value) {
        System.out.println(value+ ":");
        StringBuilder bulider = new StringBuilder();
        for(int shift = 31; shift>=0 ;shift--){
            bulider.append((value >>> shift) & 1);
        }
        System.out.println(bulider.toString());
        System.out.println();
    }

    public static void manin(String[] args){
        int a = Integer.MIN_VALUE;
        printBinary(a);
        // 100000 00000 000000 000000

        int b = Integer.MAX_VALUE;
        printBinary(b);
        // 011111 111111 111111 111111

        //error
        //Integer.Max_VALUE + 1 = Integer.MIN_VALUE
        //Integer.MIN_VALUE - 1 = Integer.Max_VALUE

    }
}
