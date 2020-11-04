import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static <string> void main(String[] args) {

        /*
        int[] arr = {3,5,1,2,7,9,8,13,25,32}; int sum = 0; for (int i = 0; i <
        arr.length; i ++){ ArrayList<Integer> newarr = new ArrayList<Integer>(); int
        obj = arr[i]; if (arr[i]<10){ } else { newarr.add(obj);
        System.out.println(newarr); } sum += arr[i]; } System.out.println(sum);
        

        ArrayList<String> people = new ArrayList<String>();
        people.add("Nancy");
        people.add("Jinichi");
        people.add("Fujibayashi");
        people.add("Momochi");
        people.add("Ishikawa");

        Collections.shuffle(people);
        System.out.println(people);
        
        
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char ch = 'a'; ch <= 'z'; ++ch){
            alphabet.add(ch);
        }
        Collections.shuffle(alphabet);
        System.out.println(alphabet);


        for(int i = 0; i < 10; i++){
            int randNum = (int) (Math.random() * 101)+55;
            System.out.println(randNum);

        }*/

        String chars[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int i = 0; i < 5; i++){
            ArrayList<String> rndString = new ArrayList<String>(5);
        rndString.add(chars[new Random().nextInt(chars.length)]);
        System.out.println(rndString);
        }
        
    }

}


