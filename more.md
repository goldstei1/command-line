### 1a. Analyzing code, Loop invariant 1

i. No, it assumes that the value at lb + 1 is less than the pivot and that the last value in the array is greater.

ii. No, when small = large, the loop should stop

iii. vals[small] is supposed to be less than the pivot but it is larger after the first inner loop

iv. vals[large] is small when it is supposed to be larger than the pivot according to the invariant

v. No, because when they increment small and decrement large, they do not know that the values at those elements hold with the invariant.

vi. No, in the inner loops they should be comparing to vals[small + 1] and vals[large - 1] because they already know, according to the invariant, that the values at large and small are in the right place.

vii. Yes, because everything to the right of the element at position small is greater than or equal to pivot and everything at positions less than small is less than the pivot.

