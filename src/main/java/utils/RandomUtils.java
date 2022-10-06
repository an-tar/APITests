package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUtils {

    public static String getRandomString(int count) {
        return "aqa" + RandomStringUtils.randomNumeric(count);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
