# Department of Computing
# ITEC625 Fundamentals of Computer Science
## Workshop - Variables and Operators
# Learning outcomes

This weeks workshop is about understanding variables and operators.

## 1. Twos complement

Convert the following negative decimal numbers to binary assuming storage is in 1 byte and the first bit is used for sign:

* -50

* -8

* -99

## 2. Storage

Can the following values be stored correctly in the data type assigned to them? If so, state the complete bit-pattern that the following variables are stored as, in the memory.

```java
short b = 28;
int c = 53;
byte a = 130;
long d = 65536;
short e = -203;
```
## 3. Number systems

Convert each of the following decimal numbers into binary, quinary (base-5) and nonary (base-9)

* 8

* 29

* 52

## 4. Converting to power of source base

In the lectures, we demonstrated a way to convert an integer n from base-p to base-q when q = p^k (k being an integer more than 1).

```
EXAMPLE 1:

n = 11101010, p = 2, q = 8

q = 2^3, therefore, k = 3

Split n in groups of 3 (starting from right side)

11 101 010

Pad the first group if incomplete with 0s.

011 101 010

Convert each group to decimal individually.

3 5 2

Put it together. That’s the number in base 8.

Hence, 11101010 in base-2 = 352 in base-8.

EXAMPLE 2:

n = 10201221

p = 3

q = 9

q = 3^2, therefore, k = 2

Split n in groups of 2 (starting from right side)

10 20 12 21

Pad the first group if incomplete with 0s - not applicable

Convert each group to decimal individually.

3 6 5 7

Put it together. That’s the number in base 9.

Hence, 10201221 in base-3 = 3657 in base-9.
```
Convert the following numbers (source and destination bases provided):

* 11100010 in base-2 to base-4

* 11100010 in base-2 to base-8

* 11100010 in base-2 to base-16

* 120100121 in base-3 to base-9

* 310223201 in base-4 to base-16

## 5. Converting from power of destination base

Now we’ll do the opposite - convert an integer n from base-q to base-p when q = p^k (k being an integer more than 1).

```
EXAMPLE 1:

n = e8f2

q = 16

p = 2

q = 2^4, therefore, k = 4

Convert each symbol to decimal and then to base p.

e 8 f 2

14 8 15 2

1110 1000 1111 10

Pad with leading zeroes to make groups of size k (4)

1110 1000 1111 0010

Put it together

1110100011110010

That’s your number in base-p (2)

Hence, e8f2 in base-16 = 1110100011110010 in base-2.
```
Convert the following numbers (source and destination bases provided):

* 5073 in base-9 to base-3

* abc123 in base-16 to base-2

## 6. Expressions

An expression is an operation evaluating to a specific value.

What are the values of the following arithmetic expressions?

* 17/5

* 1.0 + 16/5

* (1.0 + 16)/5

* 3 * ((2 + 5) / (4 - 1) + 17 % 5)

## 7. Boolean expressions

What are the values of the following boolean expressions?

* true && false

* true && (false || true)

* true || false

* false || !(true || false)

* (5 >= 0 && (5 <= 2 || 5 <= 10))

## 8. Bitwise operations

An expression is an operation evaluating to a specific value.

What are the values of the following bitwise operations?

* 21 & 19

* 21 | 19

* 21 ˆ 19

* 12 << 2

* 12 >> 2

## 9. Java program

Consider the following scenario:

*John takes 5 hours to paint 3 square meters while Jenny takes 15 hours to paint 7 square meters.*

If they work together, how much time will they need to paint a wall whose area is 56 square meters? Also determine how much area John paints and how much area Jenny paints.

First devise a solution on paper and verify your solution by ensuring that:

`(area painted by john in determined time) +`

`(area painted by jenny in the same determined time) = total area (56)`

Then, write a java program in Eclipse that solves the following problem.

**IMPORTANT**: Think about the types you’ll use to store these values?
