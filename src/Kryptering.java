public class Kryptering {
  public static void main (String [] agrs) {
    String message = "HEJ";
    char key = '(';
    char[] crypt = message.toCharArray();

    for (int i = 0 ; i < crypt.length ; i++) {
      System.out.println(Integer.toBinaryString(crypt[i]));
      System.out.println("0" + Integer.toBinaryString(key));
      System.out.println(Integer.toBinaryString(crypt[i]^key) + "\n");
      crypt[i] ^= key;
    }

    System.out.println(crypt);


  }
}
