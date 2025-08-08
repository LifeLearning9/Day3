# Day3: Alphanumeric Palindrome Checker  
Given a string that may contain special characters, your task is to Remove all special characters, keeping only alphanumeric characters (letters and digits). Convert all characters to lowercase.Check whether the resulting string is a palindrome. A palindrome is a string that reads the same forward and backward.

**TestCases:**
1.Input: A man, a plan, a canal: Panama
Output: Yes
2.Input:Hello@World123
Output:No

**Intuition**
1. A palindrome ignores case and non-alphanumeric characters. So, first we filter out everything that’s not a letter or digit.
2. Convert the rest to lowercase so that comparisons are consistent.
3. Then check if the string is equal to its reverse.
**For example:**
"A man, a plan, a canal: Panama"
→ After removing special characters and lowercasing → "amanaplanacanalpanama"

**Algorithm**
1.Read the input string.
2.Create an empty StringBuilder (or string).
3.Loop through each character in the string:
4.If it's a letter or digit, convert it to lowercase and add it to the builder.
5.After processing the full string, check if the cleaned string is equal to its reverse.
6.Print "Yes" if it is a palindrome, otherwise "No".

**Time and Space Complexity Analysis**
      Let N be the length of the input string.
      
**Time Complexity**: O(N)
Loop through each character once to clean the string =O(N)
Reverse and compare = O(N)

**Space Complexity**: O(N)
Stores the cleaned string and reversed string =O(N)
