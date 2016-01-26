package AdvancedLevel;

public class passwordGenerator {

	public static void main(String[] args) {
		char allowedSymbols[][] = new char[3][];
        allowedSymbols[0] = new char[10];
        allowedSymbols[1] = new char[26];
        allowedSymbols[2] = new char[26];
        for (int a = 0; a < 10; a++)
                allowedSymbols[0][a] = (char) (a + 48);
        for (int a = 0; a < 26; a++)
                allowedSymbols[1][a] = (char) (a + 65);
        for (int a = 0; a < 26; a++)
                allowedSymbols[2][a] = (char) (a + 97);
        char password[] = new char[15];

        for (int a = 0; a < password.length; a++) {
                int temp = (int) (Math.random() * 3);
                int tmp;
                if (temp == 0)
                        tmp = (int)( Math.random() * 10);
                else
                        tmp = (int)( Math.random() * 26);
                password[a] = allowedSymbols[temp][tmp];
        }
        for(char a: password)System.out.print(a);

	}

}
