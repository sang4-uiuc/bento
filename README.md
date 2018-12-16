1. The program recursively adds files to an ArrayList. Prints the files sorted by file size at the end.

javac PrintDirectory.java
java PrintDirectory [Directory Address]

2. The program loops through the array, sorts each word and puts it into a hashmap with key being the hashcode of the sorted word and value being a list with the original word and previous words with the same hashcode.
At the end, it goes through the hashmap and prints out all lists with size greater than 1, meaning there's an anagram match.

javac FindAnagrams.java
java FindAnagrams