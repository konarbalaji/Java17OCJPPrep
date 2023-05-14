package com.assessment;

public class _01_Sample {



    public static void main(String[] args) {

        _02_Sample sam2 = new _02_Sample();
        sam2.javadoccmnt(2);

        final int score1 = 8, score2 = 3;
        char myScore = 7;

        var goal = switch (myScore){

            default -> {
                if(10>score1)
                    yield "unknown";
                else yield "Known";
            }

            case score1 -> "great";
            case 2,4,6 -> "good";
            case score2, 0 -> "bad";
        };

        System.out.println(goal);

    }
}
