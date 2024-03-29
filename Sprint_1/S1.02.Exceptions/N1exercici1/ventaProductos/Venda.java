package ventaProductos;

import java.util.ArrayList;

public class Venda {
    private ArrayList <Producte> producteLista;
    private double vendaTotal;

    public Venda(){
        this.producteLista = new ArrayList<Producte>();
    }

    public ArrayList<Producte> getProducteLista() {
        return producteLista;
    }
    public double getVendaTotal() {
        return vendaTotal;
    }

    public void setProducteLista(ArrayList<Producte> producteLista) {
        this.producteLista = producteLista;
    }
    public void setVendaTotal(double vendaTotal) {
        this.vendaTotal = vendaTotal;
    }

    public void calcularTotal() {
        try {
            checkVacio(this.producteLista);
            for (int i = 0; i < this.producteLista.size(); i++) {
                this.vendaTotal = this.vendaTotal + this.producteLista.get(i).getPrecio();
            }
            System.out.println("La venta total es " + this.vendaTotal);
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
    }

    public void printProducts(String[] products){
        try{
            for (int i = 0; i <= products.length; i++) {
                System.out.println(products[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: Fuera de rango");
        }
    }

    private void checkVacio (ArrayList<Producte> producteLista) throws VendaBuidaException {
        if(producteLista.size() <= 0){
            throw new VendaBuidaException("ERROR: Per fer una venda primer has d’afegir productes");
        }

    }
}
