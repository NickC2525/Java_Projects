package FirstJavaProject;

public class WordCapitalization {

    public static void main(String[] args) {

        String sentence = "hello, how are you?";
        for (int index = 0; index < sentence.length(); index++) {


            char currentLetter = sentence.charAt(index);

            if (currentLetter == ' ') {
                //capitalize NEXT currentLetter, with index = index + 1
                char nextLetter = sentence.charAt(index + 1);
                nextLetter = Character.toUpperCase(nextLetter);
                sentence = sentence.substring(0,index + 1) + nextLetter + sentence.substring(index + 2);
                //System.out.println(sentence);

            } else if ((index == 0)) {
                // capitalize currentLetter
                currentLetter = Character.toUpperCase(currentLetter);
                sentence = currentLetter + sentence.substring(1);
            }


        }
        System.out.println(sentence);
    }
}

