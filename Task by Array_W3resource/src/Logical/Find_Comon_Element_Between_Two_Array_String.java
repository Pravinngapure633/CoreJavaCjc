package Logical;

public class Find_Comon_Element_Between_Two_Array_String {

	public static void main(String[] args) {

		String[] array1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL", "ABC" };

		String[] array2 = { "MySQL", "SQL", "SQLite", "C#", "Oracle", "PostgreSQL", "PHP", "DB2", "JAVA", "ABC" };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					System.out.println("Common: " + array1[i]);
				}
			}
		}
	}

}
