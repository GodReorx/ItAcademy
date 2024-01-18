package ventaProductos;

import java.util.ArrayList;

public class Venda {
    private ArrayList <Producte> producteLista;
    private double vendaTotal;

    public Venda() {
        this.producteLista = new ArrayList<Producte>();
        this.vendaTotal = 0;
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
            /*for (Producte producte : this.producteLista) {
                this.vendaTotal = this.vendaTotal + producte.getPrecio();
            }*/
            System.out.println("La venta total es " + this.vendaTotal);
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Fuera de rango");
        }
    }

    private void checkVacio (ArrayList<Producte> producteLista) throws VendaBuidaException {
        if(producteLista.size() <= 0){
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }

    }
}
