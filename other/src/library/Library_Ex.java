package library;

import org.apache.commons.lang3.StringUtils;

public class Library_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expression = "1+2-3/4*5=?";
		String[] splitStr = StringUtils.split(expression,"*?/-=+");
		for(int i= 0; i<splitStr.length; i++) {
			System.out.println(splitStr[i]);
		}

	}

}
