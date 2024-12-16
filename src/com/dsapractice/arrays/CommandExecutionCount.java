package com.dsapractice.arrays;

public class CommandExecutionCount {
    public static void main(String[] args) {
        /*
        input[] = {"ls","cp","mv","mv","1!","3!","6!"};
        output[] = freq count of [cp, ls, mv]
        => {1, 3, 4}
         */
        String inps[] ={"ls","cp","mv","mv","mv","!1","!3","!6"};
        String inps1[] = {"ls","cp","mv","!3","mv","!1","!6"};
        int freqcount [] = findFrequencyOfCommands(inps1);
        for(int i: freqcount){
            System.out.println(i);
        }
    }

    private static int[] findFrequencyOfCommands(String[] inps) {
        int freqarr[] = new int[3];
        for(int i=0; i<inps.length; i++){
            String s = inps[i];
            if(s.startsWith("!")){
                s=s.replace("!","");
                int index = Integer.parseInt(s);
                s = inps[index-1];
                inps[i] = s;
            }
            if(s.equals("cp")){
                freqarr[0]++;
            }
            if(s.equals("ls")){
                freqarr[1]++;
            }
            if(s.equals("mv")){
                freqarr[2]++;
            }
        }
        return freqarr;
    }
}
