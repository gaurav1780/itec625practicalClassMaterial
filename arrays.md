# Department of Computing
# ITEC625 Fundamentals of Computer Science
## Workshop - Arrays
# Learning outcomes

This week's workshop is about understanding how to create and use arrays.

## 1. Creating arrays

Create arrays that can hold values for,

* number of cars sold by each of the 8 employess.

* GPAs of 50 students.

* number of days it rained in each month.

* the state of each of the 100 switches in the house (whether it's on or off).

## 2. Memory representation

Based on the convention used in the lecture, draw a memory diagram for the following code:

```java
int[] a = {20, 50, 30, 80, 10, 60};
int[] b = {a[0], a[2], a[4]};
int[] c = b;
```
## 3. Tracing code involving arrays - 1 

What is the state of the array `arr` when the following code is executed?

```java
int[] arr = new int[8];
for(int i = 0; i < arr.length/2; i++) {
    arr[i] = 2*i+1;
}
for(int i = arr.length/2; i < arr.length; i++) {
    arr[i] = 2*(arr.length - 1) - 1;
}
```
## 4. Tracing code involving arrays - 2 

What is the state of the array `arr` at the end of each iteration of the outer loop in the following code?

```java
int[] arr = {12, 30, 8, 2, 7, 15};
for(int i=0; i < arr.length; i++) {
    int dodo = i;
    for(int k=i+1; k < arr.length; k++) {
        if(arr[k] < arr[dodo ]) {
                dodo = k;
        }
    }
    int temp = arr[i];
    arr[i] = arr[dodo ];
    arr[dodo] = temp;
    //arr = ???
}
```
## 5. Basic operations on an array 

Assume that there is an array `data` that has at least one item. Write a piece of code that stores the number of negative integers in the array.

## 6. Methods operating on arrays 

Complete the following method’s definition based on the javadoc.

```java
public class ArrayService {
    /**
    * @param arr
    * @param min
    * @param max: assume max >= min
    * @return true if there is any value in array arr that lies
    * in the range [min , max], false otherwise
    * for example ,
    * if arr = {10, 70, 20, 90}, min = 30, max = 70, return true
    * if arr = {10, 70, 20, 90}, min = 30, max = 60, return false
    */
    public static boolean contains(int[] arr , int min , int max) {
        return false; //to be completed
    }
}
```
Test your code using the following JUnit test case:

```java    
@Test
public void testContains () {
    int[] a = {20, -50, 30, -40, 90};
    assertTrue( ArrayService .contains(a, 10, 20));
    assertTrue( ArrayService .contains(a, 30, 50));
    assertTrue( ArrayService .contains(a, -60, -20));
    assertTrue( ArrayService .contains(a, -50, -45));
    assertTrue( ArrayService .contains(a, -45, -40));

    assertFalse ( ArrayService .contains(a, -49, -41));
    assertFalse ( ArrayService .contains(a, 31, 89));
    assertFalse ( ArrayService .contains(a, -39, 19));
}
```
## 7. Method operating on arrays - 2 

Complete the following method’s definition based on the javadoc.

``` java
public class ArrayService {
    /**
    * @param a
    * @param b
    * @return true if a and b are identical , false otherwise
    * for example ,
    * if a = {10, 70, 20}, b = {10, 70, 20}, return true
    * if a = {10, 70, 20}, b = {10, 70, 20, 90}, return false
    * if a = {10, 70, 20, 90}, b = {10, 70, 20}, return false
    * if a = {10, 70, 20}, b = {10, 70, 30}, return false
    * if a = {10, 70, 20}, b = {30, 70, 20}, return false
    */
    public static boolean areIdentical (int[] a, int[] b) {
        return false; //to be completed
    }
}
```
Test you code using the following JUnit test case:

```java
@Test
public void testAreIdentical () {
    int[] a = {20, -50, 30};
    int[] b = {20, -50, 30};
    assertTrue( ArrayService . areIdentical (a, b));

    int[] c = {20, -50, 30};
    int[] d = {20, -50, 30, 60};
    assertFalse ( ArrayService . areIdentical (c, d));

    int[] e = {20, -50, 30, 60};
    int[] f = {20, -50, 30};
    assertFalse ( ArrayService . areIdentical (e, f));

    int[] g = {20, -50, 30};
    int[] h = {20, -50, 40};
    assertFalse ( ArrayService . areIdentical (g, h));

    int[] i = {20, -50, 30};
    int[] j = {10, -50, 30};
    assertFalse ( ArrayService . areIdentical (i, j));
}
```
## 8. Methods returning arrays

Define a method `getPositiveItems` that when passed an integer array, returns an array containing the positive items from that array. For example,

* if the array passed = `{-6, 0, 5, -2, -9, 1, 0, 0, 3}`, return the array `{5, 1, 3}`.

* if the array passed = `{-6, 0, -2, -9, 0, 0}`, return the array `{}`.

## 9. (Advanced)

* Define a method that when passed two arrays (assume that all items within an array are different), returns an array containing items that exist in both arrays, in the order they exist in the first of the two arrays.

* Define a method that when passed an array, returns an array holding the longest streak of items that are in ascending order.
