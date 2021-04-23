import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava{
    public static void sumAndGreaterThan(int[] arr){
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            sum += arr[i];
        }

        System.out.println(sum);

        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i =0 ; i<=arr.length-1; i++){
            if(arr[i] > 10){
                newArr.add(arr[i]);
            }

        }
        System.out.println(newArr);
    }
    public static void arrayJapanese(ArrayList<String> Japanese){
        Collections.shuffle(Japanese);
        System.out.println(Japanese);

        ArrayList<String> newJapanese = new ArrayList<String>();
        for(int i = 0; i<Japanese.size(); i++){
            if(Japanese.get(i).length() > 5){
                newJapanese.add(Japanese.get(i));
            }
        }
        System.out.println(newJapanese);
    }
    public static void arrayAlpha(){
        ArrayList<Character> newAlphabet = new ArrayList<Character>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < alphabet.length; i++){
            newAlphabet.add(alphabet[i]);
        }
        System.out.println(newAlphabet);
        Collections.shuffle(newAlphabet);
        System.out.println(newAlphabet);
        System.out.println(newAlphabet.get(newAlphabet.size()-1));
        System.out.println(newAlphabet.get(0));
        if(newAlphabet.get(0) == 'a' || newAlphabet.get(0) == 'e'|| newAlphabet.get(0) == 'i'|| newAlphabet.get(0) == 'o'|| newAlphabet.get(0) == 'u'|| newAlphabet.get(0) == 'y'){
            System.out.println("The first character is a vowel");
    }
}
    public static void getRandom(){
        int[] array = new int[10];
        Random randy = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = randy.nextInt(100 - 55 + 1) + 55;
    }
        System.out.println(Arrays.toString(array));
}
    public static ArrayList<Integer> getRandomSort(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        Random randy = new Random();
        int max = 55;
        int min = 101;

        for(int i = 0; i<10; i++){
            int num = randy.nextInt(100 - 55 + 1) + 55;
            newArray.add(num);
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        Collections.sort(newArray);
        System.out.println("The minimum random number is: " + min);
        System.out.println("The maximum random number is: " + max);
        return newArray;
    }
    public static StringBuilder randomString(){
        String allCharacters = "ABCDEFGHIJKLMNOPRSTUVWXYZ" + "012345678" + "abcdefhhijklmnopqrstuvwxyz";
        StringBuilder newString = new StringBuilder(5);
        for(int i = 0; i<5; i++){
            int index = (int) (allCharacters.length() * Math.random());
            newString.append(allCharacters.charAt(index));
        }
        System.out.println(newString);
        return newString;
    }
    public static ArrayList<StringBuilder> randomStringArray(){
        ArrayList<StringBuilder> newArray = new ArrayList<StringBuilder>();
        String allCharacters = "ABCDEFGHIJKLMNOPRSTUVWXYZ" + "012345678" + "abcdefhhijklmnopqrstuvwxyz";
        for(int j = 0; j<11; j++){
        StringBuilder newString = new StringBuilder(5);
        for(int i = 0; i<5; i++){
            int index = (int) (allCharacters.length() * Math.random());
            newString.append(allCharacters.charAt(index));
            
        }
        newArray.add(newString);
    }

        System.out.println(newArray);
        return newArray;
    }
}