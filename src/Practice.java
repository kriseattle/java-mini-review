public class Practice {

    /**
     * Prints each item from an array on a separate line.
     * 
     * Example:
     * 
     * input:
     * {"welcome", "to", "sdev", "220"}
     * 
     * printed output:
     * welcome
     * to
     * sdev
     * 220
     * 
     * @param items an array of strings to print
     */
    public static void printItems(String[] items) {
        // TODO: Implement this method here!
        //use for loop to loop through every single item and print out
        for (int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }
    }

    /**
     * Returns whether a is more than twice the value of b.
     * 
     * Examples:
     * input:
     *   a: 10, b: 3
     * return:
     *   true
     * 
     * input:
     *   a: 6, b: 4
     * return:
     *   false
     * 
     * input:
     *   a: 4, b: 2
     * return:
     *   false
     * 
     * @param a an int
     * @param b an int
     * @return true if a is strictly more than twice the value of b, false otherwise
     */
    public static boolean moreThanDouble(int a, int b) {
        // TODO: Delete the dummy return statement and implement this method here!
        //use if statement to check if a values twice of b and return true

        if (a > b*2){
            return true;
        } else {
            return false;
        }
        
    }


    /**
     * Returns whether every word in the array starts with the letter A (either
     * upper or lower case).
     * 
     * Examples:
     * input:
     *   {"alligators", "are", "AWESOME"}
     * return:
     *   true
     * 
     * input:
     *   {"apes", "can", "be", "amazing"}
     * return:
     *   false
     * 
     * Edge case: If array is empty, return true.
     * 
     * @param words a array of words
     * @return true if every word starts with A (case-insensitive), false otherwise.
     */
    public static boolean allStartWithA(String[] words) {
        // TODO: Delete the dummy return statement and implement this method here!
        
        //return true if array is empty, or
        if (words == null || words.length == 0){
            return true;
        }
        
        //use for loop to loop through every word to check if the word starts with A whether if it's A or a
        for (String word : words){

            if (!word.toUpperCase().startsWith("A")){
                return false;
            }  
        }
        return true;
       
    }
    

    public static void main(String[] args) {
        System.out.println();
        System.out.println("///// Print items /////");
        System.out.println("Calling printItems(new String[]{\"welcome\", \"to\", \"sdev\", \"220\"})");
        printItems(new String[]{"welcome", "to", "sdev", "220"});
        System.out.println();
        System.out.println("Calling printItems(new String[]{\"hello\", \"world\"})");
        printItems(new String[]{"hello", "world"});

        System.out.println();
        System.out.println("///// More than Double /////");
        System.out.println("moreThanDouble(10, 3): " + moreThanDouble(10, 3));
        System.out.println("moreThanDouble(6, 4): " + moreThanDouble(6, 4));
        System.out.println("moreThanDouble(4, 2): " + moreThanDouble(4, 2));

        System.out.println();
        System.out.println("///// All Start With A /////");
        System.out.println("allStartWithA(new String[]{\"alligators\", \"are\", \"AWESOME\"}): " + allStartWithA(new String[]{"alligators", "are", "AWESOME"}));
        System.out.println("allStartWithA(new String[]{\"apes\", \"can\", \"be\", \"amazing\"}): " + allStartWithA(new String[]{"apes", "can", "be", "amazing"}));
        System.out.println("allStartWithA(new String[]{}): " + allStartWithA(new String[]{}));
        System.out.println();
    }
}