package com.dsapractice.strings;

public class RemoveAllOccurancesOfSubString {
    public static void main(String[] args) {
        /*
        Input: s = "daabcbaabcbc", part = "abc"
Output: "dab"
Explanation: The following operations are done:
- s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
- s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
- s = "dababc", remove "abc" starting at index 3, so s = "dab".
Now s has no occurrences of "abc".
         */
        String s ="daabcbaabcbc", part = "abc";
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        System.out.println(s);
    }
}
