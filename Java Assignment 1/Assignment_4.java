package string;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int max = 0, count = 0;
		char ch = '\0';
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					count++;

				}
			}
			if (count > max) {
				ch = c;
				max = count;

			}
			count = 0;

			if (max == 0) {

				System.out.println("No Repeated Ouccuring Characters ");
				break;
			} else
				System.out.println(
						"The Maximum Occuring Character In A String Is : " + ch + "Occurs" + (max + 1) + "Times");
			sc.close();

		}
/*String str = " welcome in Edubridge family";
		char[] chararray = new char[str.length()];
		int []frequency = new int[str.length()];
		int min, max;
		char minchar = str.charAt(0),  maxchar = str.charAt(0);
		
		
		chararray = str.toCharArray();
		int i,j;
		
		for(i= 0;i<str.length();i++)
		{
			frequency[i]=1;
			for(j = i+1;j<str.length();j++)
			{
				if(chararray[i]==chararray[j] && chararray[i]!='0')
				{
					frequency[i]++;
					chararray[j]='0';
				}	
			}
		}
		min=max=frequency[0];
		
		for(i = 0;i<frequency.length;i++)
		{
			if(min<frequency[i] && frequency[i]!='0')
			{
				min = frequency[i];
			minchar = chararray[i];
	}
		
			if(max<frequency[i])
			{
				max = frequency[i];
				maxchar = chararray[i];
				
			}
		}
		
		System.out.println("minmum char  = "+minchar);
		System.out.println("Maximum char = "+maxchar);  
	
        }
	}*/
	}
}
