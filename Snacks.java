public class Snacks extends Producto{
    
    private String sabor;
    private String tamanno;
    private int gramos;

    public Bebidas(String nombre, String estado, int id, int cant_disp, int cant_vend, int precio, String sabor, String tamanno, int gramos){
        super(nombre, estado, id, cant_disp, cant_vend, precio);
        this.sabor = sabor;
        this.tamanno = tamanno;
        this.gramos = gramos;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public void setTamanno(String tamanno){
        this.tamanno = tamanno;
    }

    public void setGramos(int gramos){
        this.gramos = gramos;
    }

}