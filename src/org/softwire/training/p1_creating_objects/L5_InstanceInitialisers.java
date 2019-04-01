package org.softwire.training.p1_creating_objects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class L5_InstanceInitialisers {

    public static void main(String[] args) {

        Elephant e = new Elephant();
        System.out.println("The elephant's age is... " + e.age);

    }
}

// the only time to use an instance initialiser is when you are initilising something particularly complicated however this could be done in a constructor
class Elephant {

    public int age;

    {
        // They say elephants never forget.
        // That's because they keep a really good diary
        String diary = L5Utils.readFile("C:\\Work\\New starter training\\Code\\ExamPrep\\src\\org\\softwire\\training\\p1_creating_objects\\L5_diary.txt");

        String searchFor = "birthday party";

        age = 0;
        for (int i = 0; i < diary.length(); i++) {
            if (L5Utils.substring(diary, i, searchFor.length()).equals(searchFor)) {
                age = age + 1;
            }
        }

    }

}


























class L5Utils {
    static String readFile(String filename) {
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException ignored) {
            return null;
        }
    }

    static String substring(String input, int beginIndex, int length) {
        int endIndex = Math.min(beginIndex + length, input.length());
        return input.substring(beginIndex, endIndex);
    }
}