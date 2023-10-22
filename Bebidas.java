public class Bebidas extends Producto{
    
    private String tipo;
    private int mililitros;

    public Bebidas(String nombre, String estado, int id, int cant_disp, int cant_vend, int precio, String tipo, int mililitros){
        super(nombre, estado, id, cant_disp, cant_vend, precio);
        this.tipo = tipo;
        this.mililitros = mililitros;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setMil(int mililitros){
        this.mililitros = mililitros;
    }

}