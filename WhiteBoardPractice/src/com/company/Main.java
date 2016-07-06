package com.company;

public class Main {

    public static String main(String[] args) {
        //
        // Given a string, return a string where for every char in the original, there are two chars.

        public String doubleChar  (String str){
            String word = "";
            for (int i = 0; i < str.length(); i++) {
                String word2 = Character.toString(str.charAt(i));
                word += word2 + word2;
            }
            return word;

        }
    }

    //When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.

        public boolean cigarParty(int cigars, boolean isWeekend) {
            return (cigars >= 40 && (cigars <= 60 || isWeekend));
        }

    //Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public int[] rotateLeft3(int[] nums) {
        int[] anotherThing = new int[3];
        for (int i = 0; i < nums.length; i++)
            anotherThing[i] = nums[(i + 1) % 3];
        return anotherThing;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        }
        return nums;

    }

    }

