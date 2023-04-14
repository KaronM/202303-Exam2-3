import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exam2Test {

    public static String toString(int[] anArray){
        String result = "{";
        for(int index = 0; index < anArray.length-1; index++){
            result += anArray[index]+", ";
        }
        if (anArray.length > 0){
            result += anArray[anArray.length-1];
        }
        result += "}";
        return result;
    }

    @Test
    @DisplayName("[6] test selectSmallest_1")
    void selectSmallest_1() {
        int[] a = {};
        int[] expected = {};
        Exam2.selectSmallest(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[6] test selectSmallest_2")
    void selectSmallest_2() {
        int[] a = {-2,9};
        int[] expected = {-2,9};
        Exam2.selectSmallest(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[6] test selectSmallest_3")
    void selectSmallest_3() {
        int[] a = {9,-2};
        int[] expected = {-2,9};
        Exam2.selectSmallest(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[6] test selectSmallest_4")
    void selectSmallest_4() {
        int[] a = {6,9,3,1,2};
        int[] expected = {1,9,3,6,2};
        Exam2.selectSmallest(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[6] test selectSmallest_5")
    void selectSmallest_5() {
        int[] a = {2,9,3,6,1};
        int[] expected = {1,9,3,6,2};
        Exam2.selectSmallest(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

}