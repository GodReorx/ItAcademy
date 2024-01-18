package Clases;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   @Override
   //Coge el hashCode de la variable name, para poder compararla al añadir uno nuevo
   public int hashCode(){
        return Objects.hash(name);
   }
   @Override
   //Modificamos el equals para que nos compare lo que nos interesa.
   //1er if --> mira si son el mismo objeto
   //2o if --> mira si el objeto es null
   //3er if --> mira si las clases de ambos ojetos son diferentes
   //Si no cumple ninguno, devuelve el resultado de comparar el nuevo con los actuales
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Month other = (Month) obj;
        return Objects.equals(name, other.name);
    }
}
