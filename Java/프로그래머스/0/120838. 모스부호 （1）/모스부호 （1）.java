import java.util.*;

class Solution {
    public String solution(String letter) {
        char[] engArr = new char[26];
        for(int i=0; i<engArr.length; i++)
            engArr[i] = (char) ('a'+i);
        
        String[] morseArr = new String[26];
        morseArr[0] = ".-";    
        morseArr[1] = "-...";  
        morseArr[2] = "-.-.";  
        morseArr[3] = "-..";   
        morseArr[4] = ".";     
        morseArr[5] = "..-.";  
        morseArr[6] = "--.";   
        morseArr[7] = "....";  
        morseArr[8] = "..";    
        morseArr[9] = ".---";  
        morseArr[10] = "-.-";  
        morseArr[11] = ".-.."; 
        morseArr[12] = "--";   
        morseArr[13] = "-.";   
        morseArr[14] = "---";  
        morseArr[15] = ".--."; 
        morseArr[16] = "--.-"; 
        morseArr[17] = ".-.";  
        morseArr[18] = "...";  
        morseArr[19] = "-";    
        morseArr[20] = "..-";  
        morseArr[21] = "...-"; 
        morseArr[22] = ".--";  
        morseArr[23] = "-..-"; 
        morseArr[24] = "-.--"; 
        morseArr[25] = "--..";
        
        StringBuilder sb = new StringBuilder();
        String[] arr = letter.split(" ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<morseArr.length; j++){
                if(arr[i].equals(morseArr[j]))
                    sb.append(engArr[j]);
            }
        }
        return sb.toString();
    }
}