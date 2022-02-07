import java.io.*;

public class Kryptering {
  public static void main (String [] agrs) {
    String filenameTxt = "Text.txt";
    int NoN = 10;

    try {
      PrintWriter txtOut = new PrintWriter(new BufferedOutputStream(new FileOutputStream(filenameTxt)));
      txtOut.println("Hello Suffering");
      txtOut.flush();
      txtOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    File f = new File("Text.txt");
    NoN = (int) f.length();


    try {
      char[] Message = new char[NoN];
      System.out.println("Text data");
      BufferedReader txtIn = new BufferedReader(new FileReader(filenameTxt));
      for (int i = 0 ; i < NoN ; i++) {
        Message[i] = (char) txtIn.read();
        System.out.println(Message[i]);
      }
      txtIn.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

    /// Edit the shit above
  /*
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

    System.out.println("\n\nKeys for each letter, in order");
    for (int i = 0; i < key.length; i++) {
      System.out.println("Key nr " + i + " " + key[i]);
    }

   */
  }
}
