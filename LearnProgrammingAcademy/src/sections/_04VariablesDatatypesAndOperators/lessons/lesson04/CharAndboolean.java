package sections._04VariablesDatatypesAndOperators.lessons.lesson04;

public class CharAndboolean {
	public static void main(String[] args) {
		// char has a width of 16 (2 bytes)
		char myChar = '\u00A9';
		System.out.println("Unicode output was: " + myChar);
		
		boolean myBoolean = false;
		boolean isMale = true;
		
		char myUnicode = '\u00AE';
		System.out.println("Variable: myUnicode contains: " + myUnicode);
	}

}