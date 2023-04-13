# 20 Points

# Selection?

The class below contains a method with the following signature,

```java
public static void selectSmallest(int[] anArray)
```

Implement this method so that the contents of array `anArray` are modified in the following way.

1. Set smallestIndex to -1.
2. Start at the first element in the array.  This is the current element.
3. Compare the current element with the element at index 0.  If current element is
    smaller, then set smallestIndex to the index of the current element.
4. if there is a right neighboring element, then make that the current element
    and goto step 3, otherwise goto step 5.
5. if smallestIndex is greater than 0, then swap the element at index 0 
    with the element at smallestIndex.
6. Stop.    

For example,

```java
int[] myArray = {13,22,15,7,2}
Exam2.selectSmallest(myArray);
```
The result is that the array <span style="font-family: 'courier new', courier;">myArray</span> now looks as follows,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
myArray <br>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
2
</span>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
22
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
15
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
7
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
13
</span>
</p>

<p>Using the resulting <span style="font-family: 'courier new', courier;">myArray</span> from the example above<p/>

```java
Exam2.selectSmallest(myArray);
```

The result is that the array `myArray` does not change because the smallest element
is in the first position.
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
myArray <br>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
2
</span>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
22
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
15
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
7
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
13
</span>


<span style="padding:3px 3px 3px 3px; border-bottom: red solid 1px; color:#ff0000;">Note:</span>
<span style="color:red;">
This should work for an array of length 1 or an array of length 0.  In other words, the method should address those cases and not throw an exception.
</span>