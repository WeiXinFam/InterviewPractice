package HackerRank;

import java.util.*; 

class SockMerchant {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int ans = sockMerchant(9, arr);
        System.out.println(ans);
    }

    static int sockMerchant(int n, int[] ar) {

        //Sort the array
        Arrays.sort(ar);

        //Create Dictionary to store
        Dictionary<Integer,Integer> dict = new Hashtable<Integer, Integer>();

        for (Integer i : ar){
            if (dict.get(i)==null){
                dict.put(i,1);
            }
            else{
                int a = (int) dict.get(i)+1;
                dict.put(i,a);
            }
        }
        System.out.println("New Dictionary is: " + dict); 

        int p=0;

        //Calculate the pairs
        for (Enumeration i = dict.elements(); i.hasMoreElements();){
            int v = (int) i.nextElement();
            int c = v/2;
            System.out.println("C is "+c);
            p=p+c;
        }

        System.out.println("Pairs: " + p); 
    

        return n;
    }
}