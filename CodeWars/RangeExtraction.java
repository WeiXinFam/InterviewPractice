import java.util.ArrayList;
import java.util.Arrays;




class RangeExtraction {
        public static void main(String[] args) {
        int[] arr = {31,32,34,35,37,39,41,42};
        String ans = rangeExtraction(arr);
        System.out.println(ans);
           

            
        }

		public static String rangeExtraction(int[] arr) {
            //Sort the Array
            Arrays.sort(arr);
            // System.out.println(Arrays.toString(arr));

            //Calculate the difference between each numbers
            ArrayList<Integer> diff = new ArrayList<Integer>();
            for (int i=0;i<arr.length-1;i++){
                // System.out.println(arr[i]);
                int d = Math.abs(arr[i]-arr[i+1]);
                diff.add(i, d);
                //System.out.println("added"+ d);
            }
            // System.out.println(diff);
            // System.out.println(arr.length);
            // System.out.println(diff.size());

            //Return answers
            int c =0;
            int idx =0;
            ArrayList<String> ans = new ArrayList<String>();
            String s="";
            String e="";
            for (int i=0; i<diff.size();i++){
                // System.out.println("Indexing "+i);
                // System.out.println("Difference "+diff.get(i));
                if (diff.get(i)==1){
                    // System.out.println("Counting");
                    c++;
                    if (c==1){
                        s=Integer.toString(arr[i]);
                    }
                    if (c>1){
                        e=Integer.toString(arr[i+1]);
                    }
                    // System.out.println("C is "+c);
                    // System.out.println("S & E "+ s+" "+e);
                    if(i==diff.size()-1 && c>1){
                        System.out.println("Last End with range "+ s);
                        ans.add(idx,s+"-"+e);
                    }
                    else if (i==diff.size()-1){
                        s=Integer.toString(arr[i]);
                        ans.add(idx,s);
                        idx++;
                        s=Integer.toString(arr[i+1]);
                        ans.add(idx,s);
                    }
                }
                else{
                    // System.out.println("Entered S & E & c "+ s+" "+e+" "+c);
                    if (c==0){
                        s=Integer.toString(arr[i]);
                        }
                    if (c==1){
                        // System.out.println("Added Special "+ s);
                        ans.add(idx,s);
                        idx++;
                        s=Integer.toString(arr[i]);
                    }
                    if(c>1){ 
                        s=s+"-"+e;
                        e="";
                    }
                    
                    // System.out.println("Added "+ s);
                    ans.add(idx,s);
                    idx++;
                    if(i==diff.size()-1){
                        s=Integer.toString(arr[i+1]);
                        // System.out.println("Last End "+ s);
                        ans.add(idx,s);
                    }
                    s="";
                    c=0;
                }
                
            }
            
            //Remove brackets
            String f = ans.toString();
            f=f.substring(1,f.length()-1);
            //Remove Whitespace
            f=f.replaceAll("\\s+","");

            
    		return f;
    }
}