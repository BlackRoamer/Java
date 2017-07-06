package kit;

/**
 * The {@code NaturalNumberTuple} class encapsulates one or more natural numbers
 * (excluding 0) organized as a tuple. This means:
 * <ul>
 * <li>encapsulated numbers are ordered, and</li>
 * <li>the same number may appear more than once.</li>
 * </ul>
 * 
 * @version 1.2
 */
public class NaturalNumberTuple {
private int[] tuple;

/**
 * Constructs a new tuple comprising the given {@code numbers} in the same
 * order.
 * <p>
 * All values in {@code numbers} that are smaller or equal to 0 are ignored.
 * 
 * @param numbers
 *        the numbers to initialize this tuple
 */
public NaturalNumberTuple(int[] numbers) {
int counter = 0;
// Here we check if array is empty
if (numbers.length != 0) {
// Here we count the positive numbers
for (int i = 0; i < numbers.length; i++) {
if (numbers[i] > 0) {
counter++;
}
}
if (counter > 0) {
this.tuple = new int[counter];
int k = 0;
for (int i = 0; i < numbers.length; i++) {
if (numbers[i] > 0) {
// Here we add positive numbers to the Array
this.tuple[k] = numbers[i];
k++;
}
}
}
} else { // if for example all numbers are negative
// we create empty array
this.tuple = new int[0];
}
}

/**
 * @return the smallest number stored in this tuple; -1 if this tuple is empty.
 */
public int min() {
if (this.tuple.length == 0) { // Check if array is empty
return -1;
}
// We take the minimum with maxValue
int min = Integer.MAX_VALUE;

for (int i = 0; i < this.tuple.length; i++) {
if (min > this.tuple[i]) {
// because min is maxValue it's goint to be
// the larges number , so all numbers are < than it
// so if there is no numbers , that are bigger than
// min , that's the minimum
min = this.tuple[i];
}
}
return min;

}

/**
 * 
 * @return the largest number stored in this tuple; -1 if this tuple is empty.
 */
public int max() {
if (this.tuple.length == 0) {
return -1;
}
int max = Integer.MIN_VALUE;
for (int i = 0; i < this.tuple.length; i++) {
if (this.tuple[i] > max) {
// Same logic as minimum , but it's inversed
max = this.tuple[i];
}
}
return max;

}

/**
 * Inserts the specified {@code number} at the end of the (resulting) tuple. If
 * {@code number} is smaller or equal to 0, this method has no effect. The
 * original tuple is not affected.
 * 
 * @param number
 *        the number to be inserted
 * @return the tuple resulting from inserting the specified {@code number}. If
 *         {@code number} is smaller or equal to 0, this tuple is returned
 *         without any modifications.
 */
public NaturalNumberTuple insert(int number) {
// TODO implement method
NaturalNumberTuple insertTuple = new NaturalNumberTuple(this.tuple);
// we create a new Array with size +1 , because we are goint to
// insert numbers
int[] storeValues = new int[this.tuple.length + 1];
// here we set the number at last position
storeValues[this.tuple.length] = number;
for (int i = 0; i < this.tuple.length; i++) {
if (number > 0) {
storeValues[i] = this.tuple[i];
} else {
this.tuple = new int[0];
}
}
insertTuple.tuple = storeValues;
return insertTuple;
}

/**
 * Removes any occurrence of the specified {@code number} in the (resulting)
 * tuple. If {@code number} is not contained in this tuple, this method has no
 * effect. The original tuple is not affected.
 * 
 * @param number
 *        the number to be removed
 * @return the tuple resulting from removing the specified {@code number}. If
 *         {@code number} is not contained in this tuple, this tuple is returned
 *         without any modifications.
 */
public NaturalNumberTuple remove(int number) {
NaturalNumberTuple newTuple = new NaturalNumberTuple(this.tuple);
int counter = 0;
// Here we count the occurrence of number
for (int i = 0; i < this.tuple.length; i++) {
if (this.tuple[i] == number) {
counter++;
}
}
// we make array with size like tuple - occurence of number
int[] coppieTuple = new int[this.tuple.length - counter];
int j = 0;
for (int k = 0; k < this.tuple.length; k++) {
// here we copy the array
if (this.tuple[k] != number) {
coppieTuple[j] = this.tuple[k];
j++;
}
}

newTuple.tuple = coppieTuple;
return newTuple;
}

/**
 * @param number
 *        the number whose index is to be returned. The first number in this
 *        tuple has index 0.
 * @return the index of the first occurrence of the specified {@code number} in
 *         this tuple; -1 if this tuple does not contain the {@code number}.
 */
public int indexOf(int number) {
int storeIndex = -1; // default value
for (int i = 0; i < this.tuple.length; i++) {
// check if the number is equal to a number at
// position i , if yes we take the value of i
if (number == this.tuple[i]) {
storeIndex = i;
}
}
return storeIndex;
}

/**
 * Counts the occurrences of {@code number} in this tuple.
 * 
 * @param number
 *        the number to count
 * @return how often the specified {@code number} is contained in this tuple
 */
public int countNumbers(int number) {
int counter = 0;
// here we count how many times the number at position
// i is the same as number
for (int i = 0; i < this.tuple.length; i++) {
if (this.tuple[i] == number) {
counter++;
}
}
return counter;
}

/**
 * Swaps the numbers stored at positions {@code firstPosition} and
 * {@code secondPosition}. The original tuple is not affected.
 * <p>
 * Notice that the first number in this tuple has index 0.
 * 
 * @param firstPosition
 *        the first index
 * @param lastPosition
 *        the second index
 * @return the tuple resulting from swapping the numbers stored at the specified
 *         positions. If either {@code firstPosition} or {@code secondPosition}
 *         is an invalid index, this method return this tuple without any
 *         modifications.
 */
public NaturalNumberTuple swap(int firstPosition, int lastPosition) {

NaturalNumberTuple swapNums = new NaturalNumberTuple(this.tuple);
int[] storeSwapedNums = new int[this.tuple.length];
for (int i = 0; i < this.tuple.length; i++) {
storeSwapedNums[i] = this.tuple[i];
}
// here we check if the index is in range
// that mean it should be from 0 (start) to end (array.length)
if ((firstPosition >= 0 && firstPosition < storeSwapedNums.length)
&& (lastPosition >= 0 && lastPosition < storeSwapedNums.length)) {
int helpToSwap = 0;
// here we use helpVariable to swap values
helpToSwap = storeSwapedNums[firstPosition];
// we store the value of number on 1st positon
// than we say , that number ot 1st postion is the same like the
// number
// on last position and now both are same
// than we use stored value to give it to number
// on the last position
storeSwapedNums[firstPosition] = storeSwapedNums[lastPosition];
storeSwapedNums[lastPosition] = helpToSwap;

}

swapNums.tuple = storeSwapedNums;
return swapNums;
}

/**
 * Returns a <i>copy</i> of this tuple that contains every number stored in this
 * tuple exactly once. This method has no effect on this tuple.
 * 
 * @return a copy of this tuple without any repeated occurrence of any number
 */
public NaturalNumberTuple toSet() {
NaturalNumberTuple copiedTuple = new NaturalNumberTuple(this.tuple);
// here we copy the array
int[] tempArr = new int[this.tuple.length];
for (int k = 0; k < this.tuple.length; k++) {
tempArr[k] = this.tuple[k];
}
// we use one additional method , that sort values
sort(tempArr);
// here we use another additional method, that remove duplicates
copiedTuple.tuple = removeDuplicates(tempArr);
return copiedTuple;
}

/**
 * Additional method to sort the array
 * 
 * @param nums
 */
private void sort(int[] nums) {
for (int i = 0; i < nums.length; i++) {
for (int j = i + 1; j < nums.length; j++) {
// here we use simle method to sort
// if 1st number is bigger than the second
// we send it to the previous position
// we do this with helpVariable
// the logic with helpVariable is the same
// as in the previous method
if (nums[i] > nums[j]) {
int temp = 0;
temp = nums[i];
nums[i] = nums[j];
nums[j] = temp;
}
}
}

}

/**
 * Additional method to remove duplicates
 * 
 * @param nums
 * @return
 */
private int[] removeDuplicates(int[] nums) {
int counter = 0;
int j = 1;
// Here we use counter to count the occurrence of the same numbers
for (int i = 0; i < nums.length - 1; i++) {
if (nums[i] == nums[j]) {
counter++;
}
j++;
}
// here we use addition check to count occurrence , because of the
// last position ( we can't reach it with for loop)
if (nums[nums.length - 2] == nums[nums.length - 1]) {
counter++;
}
// here we make new array , that is with the length from nums
// but we substitute the occurrence of the same numbers
int[] arrayWithoutDuplicates = new int[nums.length - counter];
int q = 0; // helping index
for (int t = 0; t < nums.length - 1; t++) {
if (nums[t] != nums[t + 1]) {
// we can make this check , because
// the numbers are sorted
// so if the 2 numbers are different
// we save them
arrayWithoutDuplicates[q] = nums[t];
q++;
}

}
// here us addition method to save the value of numbers
// when they are at last position , because again we can't
// use the for loop
if (nums[nums.length - 2] != nums[nums.length - 1]) {
arrayWithoutDuplicates[q] = nums[nums.length - 1];
}
return arrayWithoutDuplicates;
}

/**
 * Indicates if this tuple is equal to the specified {@code tuple}. Two tuples
 * are considered equal if they contain the same sequence of numbers.
 * 
 * @param tuple
 *        the other tuple with which to compare
 * @return {@code true} if this tuple is the same as the specified
 *         {@code tuple}; {@code false} otherwise
 */
public boolean equals(NaturalNumberTuple tuple) {
// first we check if it's not empty
if (tuple == null) {
return false;
}
if (this != tuple) {
return false;
}
// Now check length
if (this.tuple.length != tuple.tuple.length) {
return false;
}
// Here we check numbers on positons
for (int i = 0; i < this.tuple.length; i++) {
if (this.tuple[i] != tuple.tuple[i]) {
return false;
}
}
return true;
}

@Override
public String toString() {
String result = "";
for (int i = 0; i < this.tuple.length; i++) {
result += this.tuple[i];
// - 1 , because we don't need comma after the last element
if (i < this.tuple.length - 1) {
result += ",";
}
}
return result;
}

/**
 * Prints this tuple to the console. Therefore this method outputs a single line
 * of numbers representing this tuple. Numbers are separated by a comma, without
 * any whitespace before or after the comma.
 * 
 * @since 1.1
 */
public void print() {

System.out.println(toString());
}
}
