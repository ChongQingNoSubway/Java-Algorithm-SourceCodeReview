package AdString;

public class CharReplacement {
    // Example "student" -> "stuxxt" (den-> XX)
    // slow : all letters to the left hand side of slow are the result to return
    // fast: fast index to scan the whole string


    //Example: wwww.yahoo.com/?q=flower_market#flower_store
    // Step1: scan the input from left to right to find all occurrence of s1 -> twice
    // Step2: precalculate the new size = n + 2*(s2.size()- s1.size())
    //          extend the length of the input by 4 letters
    // Step3: use two pointers
    //      slow: all letters to the right-hand side of slow are the final result to return
    //      fast: current index from right to left
    //wwww.yahoo.com/?q=flower_market#flower_store____
    //                                           j   i




    // solution:
    // case1: if s1.length() >= s1.length()
    // Step1: finde every single occurrence of s1 in the original string, and just replace s1 with s2, until we are done
    //
    // case2 : if s1.length() < s2.length()
    //  de -> xxx
    //  1:count how many times s1 show up in the original string.
    //  2: 2x(s2.size - s1.size)
    //
}
