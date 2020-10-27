package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer value = " + myMinIntValue);
        System.out.println("Maximum Integer value = " + myMaxIntValue);
        System.out.println("busted max value = " + (myMaxIntValue + 1));
        System.out.println("busted min value = " + (myMinIntValue - 1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte minimum value = " +myMinByteValue);
        System.out.println("byte maximum value = " +myMaxByteValue);

        byte myNewByte = (byte)(myMinByteValue / 2);
        System.out.println(myNewByte);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " +myMinShortValue);
        System.out.println("Short maximum value = " +myMaxShortValue);

        short myNewShort = (short)(myMinShortValue / 2);
        System.out.println(myNewShort);

        long myLong = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " +myMinLongValue);
        System.out.println("Long maximum value = " +myMaxLongValue);


        byte myByteChallenge = 50;
        short myShortChallenge = 1000;
        int myIntChallenge = 694282952;
        long myLongChallenge = 50000L + (10L * (myByteChallenge + myShortChallenge + myIntChallenge));

        System.out.println(myLongChallenge);





    }
}
