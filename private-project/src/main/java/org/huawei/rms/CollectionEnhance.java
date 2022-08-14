package org.huawei.rms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionEnhance {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        List<String> wrapRmsEmps = new ArrayList<>(Arrays.asList("3Banjipeng", "Cuiweijie", "Wangwenya", "Weishanyuan"));
        wrapRmsEmps.add("Sujiao");
        System.out.println(wrapRmsEmps);
//        wrapRmsEmps.removeIf(name -> Character.isDigit(name.charAt(0)));
//        System.out.println(wrapRmsEmps);

        wrapRmsEmps.replaceAll(name -> Character.toLowerCase(name.charAt(0)) + name.substring(1));
        System.out.println(wrapRmsEmps);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        new CollectionEnhance().indexOfDigit(wrapRmsEmps);
    }

    /**
     * 寻找指定字符的下标
     */
    private int[] indexOfDigit(List<String> names){
//        int[] indexes = new int[names.size()];
        names.forEach(
                name -> Stream.of(name.toCharArray()).peek(System.out::println)
        );
        return null;
    }
}
