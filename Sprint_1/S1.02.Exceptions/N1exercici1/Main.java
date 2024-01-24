import ventaProductos.*;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Col", "Pimiento", "Patata"};
        Venda venda1 = new Venda();
        venda1.calcularTotal();
        Producte producto1 = new Producte("Cereales", 15);
        venda1.getProducteLista().add(producto1);
        venda1.calcularTotal();
        venda1.printProducts(products);
    }
}