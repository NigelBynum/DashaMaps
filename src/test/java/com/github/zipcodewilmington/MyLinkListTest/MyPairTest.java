package com.github.zipcodewilmington.MyLinkListTest;
import com.github.zipcodewilmington.MyLinkedList.MyPair;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
public class MyPairTest {

    @Test
    public void testSetValue() {
        //Given
        Integer expectedValue = 19;
        MyPair pair = new MyPair("no", 3); // original

        //When
        pair.setValue(expectedValue); // expecting "19"
        Integer actualKey = pair.getValue(); // Getting value after you set it , no matter what it is, it changes to whatever you set it to 

        //Then
        Assert.assertEquals(expectedValue, actualKey); // both should be 19
    }

    @Test
    public void testSetKey() {
        //Given
        String expectedKey = "pain";
        MyPair pair = new MyPair("no", 3);

        //When
        pair.setKey(expectedKey);
        String actualKey = pair.getKey();

        //Then
        Assert.assertEquals(expectedKey, actualKey);
    }
}
