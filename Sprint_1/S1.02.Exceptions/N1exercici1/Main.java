import ventaProductos.*;

public class Main {
    public static void main(String[] args) {
        Venda venda1 = new Venda();
        Producte producto1 = new Producte("Cereales", 15);
        venda1.getProducteLista().add(producto1);
        venda1.calcularTotal();
    }
}