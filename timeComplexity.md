# Department of Computing
# ITEC625 Fundamentals of Computer Science
## Workshop - Time Complexity
# Learning outcomes

By the end of this session, you will have learnt the basics about time complexity.

## Questions
### 1. What are the degrees of the following polynomials?

5x^3 +3x − 7 (1)

5x−2x^6 (2)

### 2. What are the time complexities of the following codes?

```java
int x = 1;
if(x % 2 == 0) {
    x ++;
}
else {
    x - -;
}
```
```java
for(int i =0; i < 100; i ++) {
    System . out . print (i+ " ");
}
```
```java
for(int i =0; i < n; i ++) {
    System . out . print (i+ " ");
}
```
```java
for(int i =0; i < n; i +=2) {
    if(i %3 == 0) {
        System . out . print (i+ ". ");
    }
    else {
        if(i %5 == 0) {
            System . out . print (i+ "! ");
        }
        else {
            System . out . print (i+ "? ");
        }
    }
}
```
```java
for(int i =1; i < n; i *=2) {
    System . out . print (i+ " ");
}
```
```java
for(int i =0; i < n; i += n /5) {
    System . out . print (i+ " ");
}
```
```java
for(int i =6; i < n /2; i ++) {
    System . out . print (i+ " ");
}
```
```java
for(int i=n /3; i < n /2; i +=4) {
    System . out . print (i+ " ");
}
```
```java
for(double i =1; i*i <=n; i ++) {
    System . out . print (i+ " ");
}
```
```java
for(int i =0; i < n; i ++) {
    for(int k =0; k < n; k ++) {
        System . out . println (i+" ");
    }
}
```
```java
for(int i =0; i < n; i ++) {
    for(int k =0; k < n; k ++) {
        if(i %3 == 0) {
            System . out . print (i+ ". ");
        }
        else {
            if(i %5 == 0) {
                System . out . print (i+ "! ");
            }
            else {
                System . out . print (i+ "? ");
            }
        }
    }
}
```
```java
for(int i=n; i > 0; i -=2) {
    for(int k =1; k <= n; k +=3) {
        if(i %3 == 0) {
            System . out . print (i+ ". ");
        }
        else {
            if(i %5 == 0) {
                System . out . print (i+ "! ");
            }
            else {
                System . out . print (i+ "? ");
            }
        }
    }
}
```
```java
for(int i =0; i < n; i ++) {
    for(int k =1; k <= n; k *=2) {
        if(i %3 == 0) {
            System . out . print (i+ ". ");
        }
        else {
            if(i %5 == 0) {
                System . out . print (i+ "! ");
            }
            else {
                System . out . print (i+ "? ");
            }
        }
    }
}
```
```java
for(int i =1; i < n /2; i *=2) {
    for(int k =1; k < n /2; k *=2) {
        if(i %3 == 0) {
            System . out . print (i+ ". ");
        }
        else {
            if(i %5 == 0) {
                System . out . print (i+ "! ");
            }
            else {
                System . out . print (i+ "? ");
            }
        }
    }
}
```
```java
for(double i =1; i <= n; i +=1.0/ n) {
    System . out . print (i+ " ");
}
```
### 3. What are the time complexities for the method foo in each of the following codes?

```java
void foo (int n) {
    for(int i =0; i < n; i++) {
        System . out . print (i+ " ");
    }
}
```
```java
int foo (int n) {
    int result = 0;
    for(int i =0; i < n; i++) {
        result += bar (n);
    }
    return result ;
}
    
int bar (int n) {
    return n %2;
}
```
```java
int foo (int n) {
    int result = 0;
    for(int i=n; i > 0; i--) {
        result += bar (i);
    }
    return result ;
}
    
int bar (int n) {
    return n %2;
}
```
```java
int foo (int n) {
    int result = 0;
    for(int i=n; i > 0; i--) {
        result += bar (i);
    }
    return result ;
}

int bar (int n) {
    int total = 0;
    for(int i =1; i <= n; i+=2) {
        total += i;
    }
    return total ;
}
```
```java
int foo (int[] arr ) {
    for(int i =1; i < arr . length ; i++) {
        if( arr [i] < arr [i -1]) {
            return false;
        }
    }
    return true;
}
```
### 4. Write a piece of code with O(log2n) time complexity.
### 5. Write a piece of code with a best case time complexity of O(n) and worst case time complexity of O(n^2).
### 6. Is it possible to have a code with a best case time complexity of O(n^2) and worst case time complexity of O(n ∗ log2n)?
