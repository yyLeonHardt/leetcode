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

public class __318MaximumProductOfWordLengths {
	
    public int maxProduct(String[] words) {
        int len = words.length;
        int ret = 0;
        for(int i = 0; i < len; i++) {
        	for(int j = i + 1; j < len; j++) {
        		int flag = 1;
        		int l = words[i].length();
        		for(int k = 0; k < l; k++) {
        			if(words[j].contains(String.valueOf(words[i].charAt(k)))) {
        				flag = -1;
        				break;
        			}
        		}
        		if(flag > 0 && words[i].length() * words[j].length() > ret) {
        			ret = words[i].length() * words[j].length();
        		}
        	}
        }
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
