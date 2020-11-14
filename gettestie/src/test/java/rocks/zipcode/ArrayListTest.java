package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    @Test
    public void arrayListAddTest() {
        // Given
        Person jeff = new Person("John", 1974);
        Person sam = new Person("Sam", 1984);
        Person lori = new Person("Lori", 1975);
        Person[] jeffAndSam = {jeff, sam};

        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(jeffAndSam));
        actual.add(lori);

        // When
        Person[] all = {jeff, sam, lori};

        // Then
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListRemoveTest() {
        // Given
        Person jeff = new Person("John", 1974);
        Person sam = new Person("Sam", 1984);
        Person lori = new Person("Lori", 1975);
        Person[] all = {jeff, sam, lori};

        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(all));
        actual.remove(lori);

        // When
        Person[] jeffAndSam = {jeff, sam};

        // Then
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(jeffAndSam));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListIndexOfTest() {
        // Given
        Person jeff = new Person("John", 1974);
        Person sam = new Person("Sam", 1984);
        Person lori = new Person("Lori", 1975);
        Person[] all = {jeff, sam, lori};

        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(all));

        // When
        int indexActual = actual.indexOf(sam);

        // Then
        int expected = 1;
        Assert.assertEquals(expected, indexActual);
    }

    @Test
    public void ArrayListReplaceTest() {
        // Given
        Person jeff = new Person("John", 1974);
        Person sam = new Person("Sam", 1984);
        Person lori = new Person("Lori", 1975);
        Person todd = new Person("Todd", 1993);
        Person[] jeffSamLori = {jeff, sam, lori};

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(jeffSamLori));
        expected.set(2, todd);

        // When
        Person[] all = {jeff, sam, todd};

        // Given
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(all));
        Assert.assertEquals(expected, actual);

    }


}
