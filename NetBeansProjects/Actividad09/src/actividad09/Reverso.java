/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package actividad09;
//
//import java.util.*;
//
//class ReverseBuffer {
//    private StringBuilder soFar;
//    public ReverseBuffer() {
//        soFar = new StringBuilder();
//    }
//
//    public void add(char ch) {
//        soFar.append(ch);
//    }
//
//    public String getReversedString() {
//        String str = soFar.toString();
//        soFar.setLength(0);
//        return str;
//    }
//}
//
//public class Reverso {
//    public static String[] getReversedWords(String sentence) {
//        ArrayList < String > strings = new ArrayList < String >();
//        ReverseBuffer rb = new ReverseBuffer();
//        for(int i = 0;i < sentence.length();i++) {
//            char current = sentence.charAt(i);
//            if(current == ' ') {
//                strings.add(rb.getReversedString());
//            }
//            else {
//               rb.add(current);
//            }
//        }
//        strings.add(rb.getReversedString());
//        Collections.reverse(strings);
//        return (String[])strings.toArray(new String[0]);
//    }
//
//    public static void main(String[] args) {
//        String cSentence = "Hello World, How are you? We Fine.";
//        String words[] = Reverso.getReversedWords(cSentence);
//        for(String word : words) {
//            System.out.println(word);
//        }
//    }
//}
