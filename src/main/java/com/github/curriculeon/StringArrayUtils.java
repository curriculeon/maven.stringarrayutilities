package com.github.curriculeon;

import java.awt.*;
import java.lang.reflect.Array;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for(String item: array){
            if (item.equals(value) )return  true;
        }
        return false ;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length] ;
        int count =0;
        for( int i = array.length-1; i>=0; i--){
           result[count] = array[i];
           count++;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        for (int i =0;i<array.length;i++){
            if(!array[i].equals(array[array.length-i-1])){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array)
    {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                        'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String currentWord = "" ;
        int count =0;
        for(String item : array){
            for(int i =0;i<item.length();i++){
                for(int j = 0;j<alpha.length;j++){
                    if(item.toLowerCase().charAt(i) == alpha[j]){
                        alpha[j] = '\0' ;
                        count++;
                    }
                }

            }
        }

        return  count== 26 ? true:false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count =0;
        for (int i =0;i< array.length;i++){
            if (value.equals(array[i])) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO


    public static String[] removeValue(String[] array, String valueToRemove) {

        String[] result = new String[array.length-1];
        int currentIndex=0;
        for (int i =0;i<array.length;i++){
            if(!valueToRemove.equals(array[i])){
                result[currentIndex] = array[i];
                currentIndex++;
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] temp = new String[array.length];
        String currentWord = array[0]; ;
        temp[0] = array[0];
        int currentIndex =1;
        for(int i = 0; i< array.length;i++)
        {
                 if(temp[i] == null & !currentWord.equals(array[i])  ){currentWord = array[i];
                    temp[currentIndex] = currentWord;
                    currentIndex++;

                }
        }
       String[] result = new String[currentIndex];

        for(int i =0;i< result.length;i++){
            result[i] = temp[i];

        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] temp = new String[array.length];
        String currentWord = "" ;

        String duplicates ="";
        int currentIndex =0;
        for(int i = 0; i< array.length;i++)
        {
            if( currentWord.equals(array[i])  ){
                currentWord = array[i];
                temp[currentIndex-1] += currentWord;
            }
            else {
                temp[currentIndex] = array[i];
                currentWord = array[i];
                currentIndex++;
            }
        }
        String[] result = new String[currentIndex];

        for(int i =0;i< result.length;i++){
            result[i] = temp[i];

        }
        return result;
    }


}
