public class Kryptering {
  public static void main (String [] agrs) {
    String message = "HEJ";
    char key = '(';
    String crypt = "";
    for (int i = 0 ; i < message.length() ; i++) {
      System.out.println(Integer.toBinaryString(message.charAt(i)));
      System.out.println("0" + Integer.toBinaryString(key));
      System.out.println(Integer.toBinaryString(message.charAt(i)^key) + "\n");
      crypt += (char)(message.charAt(i)^key);
    }

    System.out.println(crypt);
  }
}
