

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegxDemo{
	
	public static void main(String[] args){
		
		String chan = "SIP/HP-010203040506-16636@aws.com--22332232-222-1";
		String pattern = "SIP/.+-(\\d+)@aws.+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(chan);
		m.find();

		System.out.println(m.groupCount());
		System.out.println(m.group(1));
	}

}