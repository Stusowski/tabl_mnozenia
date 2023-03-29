import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    for(int j=1; j<11; j++){
      for(int i=0; i<10; i++){
        int k=(i+1)*j;
        System.out.print("\t"+k);
      }
      System.out.println();
    }
  }
}