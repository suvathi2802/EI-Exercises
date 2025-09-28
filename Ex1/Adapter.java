interface ModernPrinter {
 void print(String text);
}

//Adaptee Class
class LegacyPrinter {
 void printText(String text) {
     System.out.println("Legacy Printer: " + text);
 }
}

//Adapter Class
class PrinterAdapter implements ModernPrinter {
 private LegacyPrinter legacyPrinter = new LegacyPrinter();

 @Override
 public void print(String text) {
     legacyPrinter.printText(text);
 }
}

//Main Class
public class Adapter {
 public static void main(String[] args) {
     ModernPrinter printer = new PrinterAdapter();
     printer.print("Hello, Adapter!");
 }
}
