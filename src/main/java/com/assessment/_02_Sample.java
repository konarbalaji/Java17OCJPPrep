package com.assessment;

public class _02_Sample {

    public static void main(String... args) {

        int moon = 9, star = 2+2*3;
        float sun = star > 10 ? 1 : 3 ; //3
        double jupiter = (sun + moon) - 1.0f; //11
        int mars = --moon <=8 ? 2 : 3; //2

        System.out.println(sun + ", " + jupiter + ", " + mars);

    }

    /**
     * This is special javaoc comment
     * @param a : int value is namesake & only meant to demo javadoc comment
     * return int int value that can be consumed by the consumer
     *
     *
     * */
    public int javadoccmnt(int a){
        return 10;
    }

    /* Elephant */
    /*
    */

}
