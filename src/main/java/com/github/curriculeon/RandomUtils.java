package com.github.curriculeon;

import java.awt.*;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Leon on 2/4/2017.
 */
public final class RandomUtils {
    private static volatile Random random = new Random();

    public static void main(String[] args){

    }
    private RandomUtils() {
        /** This class is uninstantiable */
    }


    /**
     * @return true with the likelihood of specified percentage
     */
    public static Boolean createBoolean(float percentage) {

        return percentage > 33.2 ? true : false;
    }

    /**
     * @return a random character between the specified min and max character range
     */
    public static Character createCharacter(char min, char max) {
        String st = "abcdefghijklmnopqrstuvwxyz";
        String newSt = st.substring(st.indexOf(min),st.indexOf(max));
        char result  = newSt.charAt(random.nextInt(newSt.length()));

        return result;
    }

    /**
     * @return a random double between the specified min and max numeric range
     */
    public static Float createFloat(float min, float max)
    {

        return min + random.nextFloat() * (max - min);
    }

    /**
     * @return a random float between the specified min and max numeric range
     */
    public static Double createDouble(double min, double max) {
        return random.nextDouble() *(max-min) + min;
    }

    /**
     * @return a random integer between the specified min and max numeric range
     */
    public static Integer createInteger(int min, int max) {

        return random.nextInt(max + 1 - min) + min;
    }

    /**
     * @return a random long between the specified min and max numeric range
     */
    public static Long createLong(long min, long max) {

        return (long) (random.nextDouble() *(max-min) + min);
    }

    /**
     * @return a random string of the specified length containing characters in the specified range
     */
    public static String createString(char min, char max, int stringLength)
    {
        String st = "abcdefghijklmnopqrstuvwxyz";
        String newSt = st.substring(st.indexOf(min),st.indexOf(max));

        String chars ="";
        for(int i =0; i< stringLength;i++){
          chars += newSt.charAt(random.nextInt(newSt.length()));

        }

        return chars;
    }

    /**
     * @return an array of random string objects of the specified length containing characters in the specified range
     */
    public static String[] createStrings(char min, char max, int stringLength, int stringCount) {


        String[] newString = new String[stringCount];
        for(int i=0; i<stringCount;i++){
            newString[i]=createString(min,max,stringLength);

        }
        return newString;
    }

    /**
     * @param minYear minimum year-value to be generated
     * @param maxYear maximum year-value to be generated
     * @return a random Date value within the specified min and max year
     */
    public static Date createDate(Number minYear, Number maxYear) {
        return null;
    }

    /**
     * @param minDate minimum Date to be returned
     * @param maxDate minimum Date to be returned
     * @return random date between the specified `minDate` and `maxDate`
     */
    public static Date createDate(Date minDate, Date maxDate)
    {

        long date = createLong(minDate.getTime(),maxDate.getTime());

        return new Date(date);
    }

    /**
     * @param array     an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(AnyType[] array) {
        return array[random.nextInt(array.length)];
    }

    /**
     * @param list      an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(List<AnyType> list) {
        return list.get(random.nextInt(list.size()));
    }

    /**
     * @return specified string value with random upper and lower casing assigned to each character
     */
    public static String shuffleCasing(String str) {
        return null;
    }

    /**
     * @return shuffles the specified string array
     */
    public static <AnyType> AnyType[] shuffleArray(AnyType[] array) {
        return null;
    }

    /**
     * @return a random color with the specified maximum rgb values
     */
    public static Color createColor(int maxRed, int maxGreen, int maxBlue) {
        return null;
    }
}