/*Compare two version numbers version1 and version2.
*If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
*
*You may assume that the version strings are non-empty and contain only digits and the . character.
*The . character does not represent a decimal point and is used to separate number sequences.
*For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
*/


package leetCodeEasyPart;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _165CompareVersionNumbers {
	

	public int compareVersion(String version1, String version2) {
		
		int flag = 0;
		int partVer1 = 0;
		int partVer2 = 0;

		
		while(version1.startsWith("0") && !version1.startsWith("0.")){
				version1 = version1.substring(1);

		}
		while(version2.startsWith("0") && !version2.startsWith("0.")){
				version2 = version2.substring(1);
		}
		
		Pattern pattern = Pattern.compile("[\\d]+");
		Matcher matcher1 = pattern.matcher(version1);
		Matcher matcher2 = pattern.matcher(version2);
		while(matcher1.find()){
			partVer1 = Integer.parseInt(matcher1.group(0));
			if(matcher2.find()){
				partVer2 = Integer.parseInt(matcher2.group(0));
			}else{
				partVer2 = 0;
			}
			if(partVer1 > partVer2){
				flag = 1;
				return flag;
			}else if(partVer1 < partVer2){
				flag= -1;
				return flag;
			}else{
				flag = 0;
			}
		}
		
		if(matcher2.find()){
			if(Integer.parseInt(matcher2.group(0)) != 0){
				flag = -1;
			}
		}		
		return flag;
	}


	public static void main(String[] args) {
		
		_165CompareVersionNumbers c = new _165CompareVersionNumbers();
		int flag = c.compareVersion("1", "1.0");
		System.out.println(flag);

	}

}
