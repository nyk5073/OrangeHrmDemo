public class FindWord {

    public static void main(String[] args) {
        //Create a java program to find the word "java" in a string.
        String sentence = "I am learning java";
        String word = "java";
        int count = 0;
        int index = 0;
        while(index != -1){
            index = sentence.indexOf(word, index);
            if(index != -1){
                count++;
                index++;
                System.out.println(index);
            }
        }

    }

}
