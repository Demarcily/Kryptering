public class Kryptering {
  public static void main (String [] agrs) {
    String message = "Something is something and I want something";
    char[] LetterKeys = {'n', 'v', ')', 'a', 'm', 'i'};
    char[] key = new char[message.length()];
    char[] crypt = message.toCharArray();

    for (int i = 0; i < key.length; i++) {
      key[i] = LetterKeys[(int) Math.round(Math.random()*5)];
    }

    for (int i = 0; i < crypt.length; i++) {
      crypt[i] ^= key[i];
      System.out.print(crypt[i]);
    }

    System.out.println("\n");

    for (int i = 0; i < crypt.length; i++) {
      crypt[i] ^= key[i];
      System.out.print(crypt[i]);
    }

    System.out.println("Keys for each letter, in order");
    for (int i = 0; i < key.length; i++) {
      System.out.println("Key nr " + i + " " + key[i]);
    }


  }
}
