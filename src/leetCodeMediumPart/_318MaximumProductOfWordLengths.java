/*Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words.

Follow up:
Could you do better than O(n2), where n is the number of words?*/

package leetCodeMediumPart;

public class _318MaximumProductOfWordLengths {
	
    public int maxProduct(String[] words) {
    	int max = 0;
    	int len = words.length;
    	int[] temp = new int[len];
    	for(int i = 0; i < len; i++) {
    		for(int j = 0; j < words[i].length(); j++) {
    			temp[i] |= 1 << (words[i].charAt(j) - 'a');
    		}
    	}
    	for(int i = 0; i < len; i++) {
    		for(int j = i + 1; j < len; j++) {
    			if((temp[i] & temp[j]) == 0) {
    				max = Math.max(max, words[i].length() * words[j].length());
    			}
    		}
    	}
    	return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
