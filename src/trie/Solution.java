package trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the function below.
     */
    private static  Map<String, String> morseAlphabetMap = new HashMap<>();



    static void doIt(String[] input) {

        for(int i=0; i< 36; i++){
            String[] str = (input[i].trim()).split("\\s+");
            if(i!=26){
                morseAlphabetMap.put(str[1], str[0]);
            }
        }

        List<String> context = new ArrayList<String>();
        int i = 37;
        while(!input[i].equals("*") ){
            context.add(input[i]);
            i++;
        }
        List<String> data = new ArrayList<String>();
        i++;
        while(!input[i].equals("*") ){
            String[] str = (input[i].trim()).split("\\s+");
            for(String s: str){
                data.add(s);

            }

            i++;
        }

        for(String s: data){
            List<String> decodings = transalation(s, context);
            List<String> phrases = new ArrayList<>();
            for(String decoding: decodings){
                boolean b = context.stream().anyMatch(x -> x.startsWith(decoding));
                if(b){
                    phrases = SegmentString(decoding, context);
                }

            }

            if(!phrases.isEmpty())
                System.out.println(phrases.get(0));
            else{
                System.out.println("Not Matched");
                // here goes logic for manipulation
            }
        }

    }


    static List<String> transalation(String input, List<String> context){
        boolean b = context.stream().anyMatch(x -> x.startsWith(input));
        if(b){
            return new ArrayList<String>();
        }
        List<String> ans = new ArrayList<>();
        if(morseAlphabetMap.containsKey(input)){
            ans.add(morseAlphabetMap.get(input));
        }

        int length = input.length();

        for(int i =1; i < length; i++){
            String prefix = input.substring(0,i);
            if(morseAlphabetMap.containsKey(prefix)){
                String suffix = input.substring(i, length);
                List<String> translations = transalation(suffix, context);

                if(!translations.isEmpty()){
                    String letter = morseAlphabetMap.get(prefix);
                    if(letter.length() > 0){
                        for(String tr: translations){
                            if(tr.length() > 0){
                                ans.add(letter + tr);
                            }

                        }
                    }

                }
            }

        }

        return ans;
    }

    static List<String> SegmentString(String input, List<String> wordList){
        List<String> ans = new ArrayList<>();

        if(wordList.contains(input)){
            ans.add(input);
        }

        int length = input.length();
        for(int i =1; i < length; i++){
            String prefix = input.substring(0,i);
            if(wordList.contains(prefix)){
                String suffix = input.substring(i, length);
                List<String> expansions = SegmentString(suffix, wordList);

                if(!expansions.isEmpty()){

                    for(String ex: expansions){
                        if(ex.length() > 0){
                            ans.add(prefix+" "+ ex);
                        }

                    }
                }
            }

        }
        return ans;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        doIt(_input);

    }
}

