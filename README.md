Development
# String-Reverse
Here's a brief description of the problem-solving approach of this code:

The main method defines a sentence as a string "Mpumelelo" and calls the reverseWords method to reverse the words in the sentence.

The reverseWords method takes the input sentence and splits it into an array of words using the split method with the regex "\b". The "\b" regex is used to match word boundaries, effectively splitting the sentence into words.

It then initializes a StringBuilder named reversedSentence to store the reversed sentence.

The method iterates through each word in the words array, calling the reverseString method on each word to reverse its characters.

The reverseString method takes a word as input and initializes an empty string reversedWord.

It then iterates through the characters of the input word in reverse order and appends each character to the reversedWord.

After reversing the characters of a word, the reverseWords method appends the reversed word to the reversedSentence.

Finally, the reverseWords method returns the reversedSentence as a string.

The reversed sentence is then printed in the main method.

The code utilizes two helper methods: split to separate the sentence into words and reverseString to reverse the characters of each word. The result is that the code prints the reversed sentence, with the characters in each word reversed while preserving the order of the words in the original sentence.
