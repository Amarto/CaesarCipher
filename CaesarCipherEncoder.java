
public class CaesarCipherEncoder 
{
	

	int value;
	char letter;
	
	char[] letters;
	int[] values;
	
	
	public CaesarCipherEncoder (String s)
	{
		letters = new char [s.length()];
		
		for (int i = 0; i < s.length(); i++)
		{
			letters [i] = s.charAt(i);
		}
		
		values = new int [s.length()];
		
		for (int i = 0; i < s.length(); i++)
		{
			values[i] = letterToValue(letters[i]);
		}
	}
	
	public int letterToValue(char ch)
	{
		if (Character.toLowerCase(ch) == 'a') value = 1;
		else if (Character.toLowerCase(ch) == 'b') value = 2;
		else if (Character.toLowerCase(ch) == 'c') value = 3;
		else if (Character.toLowerCase(ch) == 'd') value = 4;
		else if (Character.toLowerCase(ch) == 'e') value = 5;
		else if (Character.toLowerCase(ch) == 'f') value = 6;
		else if (Character.toLowerCase(ch) == 'g') value = 7;
		else if (Character.toLowerCase(ch) == 'h') value = 8;
		else if (Character.toLowerCase(ch) == 'i') value = 9;
		else if (Character.toLowerCase(ch) == 'j') value = 10;
		else if (Character.toLowerCase(ch) == 'k') value = 11;
		else if (Character.toLowerCase(ch) == 'l') value = 12;
		else if (Character.toLowerCase(ch) == 'm') value = 13;
		else if (Character.toLowerCase(ch) == 'n') value = 14;
		else if (Character.toLowerCase(ch) == 'o') value = 15;
		else if (Character.toLowerCase(ch) == 'p') value = 16;
		else if (Character.toLowerCase(ch) == 'q') value = 17;
		else if (Character.toLowerCase(ch) == 'r') value = 18;
		else if (Character.toLowerCase(ch) == 's') value = 19;
		else if (Character.toLowerCase(ch) == 't') value = 20;
		else if (Character.toLowerCase(ch) == 'u') value = 21;
		else if (Character.toLowerCase(ch) == 'v') value = 22;
		else if (Character.toLowerCase(ch) == 'w') value = 23;
		else if (Character.toLowerCase(ch) == 'x') value = 24;
		else if (Character.toLowerCase(ch) == 'y') value = 25;
		else if (Character.toLowerCase(ch) == 'z') value = 26;
	
			
		return value;
	}
	
	public char valueToLetter(int val)
	{
		if (val == 1) letter = 'a';
	else if (val == 2) letter = 'b';
	else if (val == 3) letter = 'c';
	else if (val == 4) letter = 'd';
	else if (val == 5) letter = 'e';
	else if (val == 6) letter = 'f';
	else if (val == 7) letter = 'g';
	else if (val == 8) letter = 'h';
	else if (val == 9) letter = 'i';
	else if (val == 10) letter = 'j';
	else if (val == 11) letter = 'k';
	else if (val == 12) letter = 'l';
	else if (val == 13) letter = 'm';
	else if (val == 14) letter = 'n';
	else if (val == 15) letter = 'o';
	else if (val == 16) letter = 'p';
	else if (val == 17) letter = 'q';
	else if (val == 18) letter = 'r';
	else if (val == 19) letter = 's';
	else if (val == 20) letter = 't';
	else if (val == 21) letter = 'u';
	else if (val == 22) letter = 'v';
	else if (val == 23) letter = 'w';
	else if (val == 24) letter = 'x';
	else if (val == 25) letter = 'y';
	else if (val == 26) letter = 'z';
		return letter;
	}
	
	public int[] encode(int n)
	{
		for (int i = 0; i < values.length; i++)
		{
			values[i] = values[i] + n;
			
		}
		return values;
	}
	
	public char[] decode(int[] values)
	{
		for (int i = 0; i < values.length; i++)
		{
			letters [i] = valueToLetter(values[i]);
		}
		
		
		
		return letters;
	}
	


}
