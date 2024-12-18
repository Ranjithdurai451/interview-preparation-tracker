# Java Code Notes

## 1. **isDigit** Method

Checks if a character is a digit (0-9).

```java
public static void isDigit(char c) {
    if (c >= '0' && c <= '9') {
        System.out.println(c + " is a digit");
    }
}
```

## 2. **isUpperCase** Method

Checks if a character is uppercase or lowercase.

```java
public static void isUpperCase(char c) {
    if (c >= 'A' && c <= 'Z') {
        System.out.println(c + " is uppercase");
    } else {
        System.out.println(c + " is lowercase");
    }
}
```

## 3. **isDivisible** Method

Checks if a number is divisible by 3, 5, or both.

```java
public static void isDivisible(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
        System.out.println("The number is divisible by 3 and 5");
    } else if (n % 3 == 0) {
        System.out.println("The number is divisible by 3");
    } else {
        System.out.println("The number is divisible by 5");
    }
}
```

## 4. **isLeap** Method

Checks if a year is a leap year.

```java
public static void isLeap(int y) {
    if ((y % 4 == 0 || y % 400 == 0) && y % 100 != 0) {
        System.out.println("Leap Year");
    } else {
        System.out.println("Not a leap year");
    }
}
```

## 5. **input** Method

Reads digits from user input and calculates their sum.

```java
public static void input() {
    int sum = 0;
    Scanner in = new Scanner(System.in);
    while (true) {
        System.out.println("Enter");
        char c = in.next().charAt(0);
        if (c >= '0' && c <= '9') {
            sum = sum + (c - 48);
        } else {
            break;
        }
    }
    System.out.println("The total: " + sum);
}
```

## 6. **dateToDay** Method

Converts a number (1-7) to its corresponding weekday.

```java
public static void dateToDay(byte n) {
    switch (n) {
        case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        case 3: System.out.println("Wednesday"); break;
        case 4: System.out.println("Thursday"); break;
        case 5: System.out.println("Friday"); break;
        case 6: System.out.println("Saturday"); break;
        case 7: System.out.println("Sunday"); break;
        default: System.out.println("Not a valid date");
    }
}
```

## 7. **characterType** Method

Classifies a character as a vowel, number, or consonant.

```java
public static void characterType(char c) {
    switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("vowels");
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            System.out.println("numbers");
            break;
        default:
            System.out.println("consonants");
    }
}
```

## 8. **isVowel** Method

Checks if a character is a vowel (case-insensitive).

```java
public static boolean isVowel(char c) {
    c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}
```

## 9. **range** Method

Prints all integers in the specified range.

```java
public static void range(int start, int end) {
    for (int i = (start < end ? start : end); i <= (start < end ? end : start); i++) {
        System.out.println(i);
    }
}
```

## 10. **isPrime** Method

Checks if a number is prime.

```java
public static boolean isPrime(int n) {
    for (int i = 3; i <= n / 2; i = i + 2) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```

## 11. **nPrimes** Method

Prints the first `n` prime numbers.

```java
public static void nPrimes(int n) {
    for (int i = 1; i <= n / 2; i++) {
        if (isPrime(i)) {
            System.out.print(i + " ");
        }
    }
}
```

## 12. **countDigits** Method

Counts the number of digits in an integer.

```java
public static int countDigits(int n) {
    int count = 0;
    while (n != 0) {
        count++;
        n = n / 10;
    }
    return count;
}
```

## 13. **reverseNumber** Method

Reverses the digits of an integer.

```java
public static int reverseNumber(int n) {
    int rev = 0;
    while (n != 0) {
        rev = (rev * 10) + (n % 10);
        n = n / 10;
    }
    return rev;
}
```

## 14. **isPalindrome** Method

Checks if a number is a palindrome.

```java
public static void isPalindrome(int n) {
    if (n == reverseNumber(n)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not palindrome");
    }
}
```

[Other problems](https://iridescent-scent-e9c.notion.site/DSA-160ba1a40a84801483f6cc739010c610)
