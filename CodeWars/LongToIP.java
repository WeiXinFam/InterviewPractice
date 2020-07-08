package CodeWars;

class LongToIP {
    public static void main(String[] args) {
        long n = 32L;
        String ans = longToIP(n);
        System.out.println(ans);
        }


    public static String longToIP(long ip) {
        // Java doesn't have uint32, so here we use long to represent int32
        String bin = Long.toBinaryString(ip);
        final StringBuilder sb = new StringBuilder();
        if (bin.length() != 32){
            System.out.println("In here");
            int toFill = 32 - bin.length();
            for (int i=0;i<toFill;i++){
                bin="0"+bin;
            }
        }
        System.out.println("String of binary " +bin);
        for (int i=0; i<bin.length()-1;i+=8){
            String p = bin.substring(i, i+8);
            // System.out.println("String to change to " +p);
            int n = Integer.parseInt(p,2);
            // System.out.println("Number check " +n);
            sb.append(n).append(".");
        }
            return sb.deleteCharAt(sb.length() - 1).toString(); // do it!
        }
}