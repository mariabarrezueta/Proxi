// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("imagen1.jpg");
        Image image2 = new ProxyImage("imagen2.jpg");

        // La imagen 1 se cargará desde el disco
        image1.display();
        // La imagen 1 se mostrará desde la memoria
        image1.display();
        // La imagen 2 se cargará desde el disco
        image2.display();
        // La imagen 2 se mostrará desde la memoria
        image2.display();
    }
}