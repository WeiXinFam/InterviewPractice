package HackerRank;

class CountValley{
    public static void main(String[] args) {
        int ans = countingValleys(8, "DDUUUUDD");
        System.out.println(ans);
        }

    static int countingValleys(int n, String s) {

        int v = 0;  //Number of valley
        int lvl = 0; //Current sea level
        for (char c: s.toCharArray()){
            if (c=='U') lvl++;
            if (c=='D') lvl--;

            if(lvl==0&c=='U') v++;
        }

        return v;
    }

    //Found explanation of the question in the discussion. Idea is that it is a valley whenever we are travelling up to the sea level/below to the sea level.
}