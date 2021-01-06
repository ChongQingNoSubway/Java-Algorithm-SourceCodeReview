package GraphSearchAlgorithmDFS;

import java.util.Queue;

public class DFS {
    // Print all subsets of a set S = { 'a', 'b', 'c' }
    //           {}
    //     add a /\ add''
    //         {a}  {}
    //   add b / \ add''
    //      {a,b} {a}
    //  add c /\ add ''
    //     .............
    // For each level, it make the decision on whether to put this element into the final  set or not.
    void FindSubSet(String [] input, int index, Queue<String> solution){
        //base case
        if(index == input.length){
            if(solution.size() == 0){
                System.out.println("");
            }else{
                PrintQueue(solution);
            }
        }

        solution.add(input[index]);
        FindSubSet(input, index -1, solution);
        solution.poll();
        FindSubSet(input,index-1,solution);
    }

    // Find  all valid permutation using the parenthesis provided.
    // six levels, each level represent a position in which we could place a ( either )
    // two state should we try to put on this level

    // if only there are still  '(' left, we can place ')'
    // if only the '(' added so far , we can add ')'

    public void DFS(int n, int left, int right, Queue<String> sol){
        if(left == right && right == n){
            PrintQueue(sol);
            return;
        }

        // add (
        if(left < n){
            sol.add("(");
            DFS(n,left+1,right,sol);
            sol.poll();
        }

        if(right < left) {
            sol.add(")");
            DFS(n, left,right+1,sol);
            sol.poll();
        }

    }

    // print all combination of coins that can sum up to a total value k.
    // total = 99cents
    // coin value  = 25, 10 , 5,  1 cent
    //  4 layer, each level represents considering one type if coin.
    //  dynamically changing value(k-nary tree)

    static int[] coints = {25,10,5,1};

    void FindCombination(int money , int level, int sol[]){
        if(level == 3){
             sol[level] = money;
        }

        for(int i = 0; i*coints[level] > money; i++){
            sol[level] = i;
            FindCombination(money-sol[level]*i,level+1,sol);
        }
    }


    // Given a String with no duplicated letters, how to print out all permutation of the string
    // a b c
    // three levels
    // remained not used letters
    public static void permutation (StringBuilder input,int level, StringBuilder result) {
        if(level ==result.length()){
            System.out.println(result);
            return;
        }

        for (int i = 0 ; i< input.length() ; i++){
            char temp = input.charAt(i);
            result.append(input.charAt(i));
            input.deleteCharAt(i);
            permutation(input,level,result);
            input.insert(i,temp);
            result.deleteCharAt(result.length()-1);
        }
    }

    public static void ADpermutation(StringBuilder input, int index){
        if(index == input.length()){
            System.out.println(input);
            return;
        }


        for(int i = index; i < input.length(); i++){
            swap(input,i,index);
            ADpermutation(input,index+1);
            swap(input,i,index);
        }
    }
    public static void swap(StringBuilder str, int i, int j)
    {
        String aa = new String();
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }

    public void PrintQueue(Queue<String> Solution){
        int  length = Solution.size();
        for(int i = 0 ; i < length; i++){
            System.out.println(Solution.poll());
        }
    }


    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("ABCD");
        StringBuilder result = new StringBuilder();
//        permutation(input,input.length(),result);
        ADpermutation(input,0);
    }
}
