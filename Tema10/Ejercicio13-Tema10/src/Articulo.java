/**
 *
 * @author alber
 */
public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioDeCompra;
    private double precioDeVenta;
    private int stock;
    
    public Articulo (String cod, String des, double pdc, double pdv, int sto){
        this.codigo = cod;
        this.descripcion = des;
        this.precioDeCompra = pdc;
        this.precioDeVenta = pdv;
        this.stock = sto;
    }
    
    public Articulo (String cod){
        this.codigo = cod;
    }
    
    public String getCodigo (){
        return this.codigo;
    }
    
    public void setCodigo (String cod){
        this.codigo = cod;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getPrecioDeCompra(){
        return this.precioDeCompra;
    }
    
    public void setPrecioDeCompra(double pdc){
        this.precioDeCompra = pdc;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public double getPrecioDeVenta(){
        return this.precioDeVenta;
    }
    
    public void setPrecioDeVenta(double pdv){
        this.precioDeVenta = pdv;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public void setStock(int sto){
        this.stock = sto;
    }
    
    @Override
    public String toString(){
        String cadena = "------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nDescripción: " + this.descripcion;
        cadena += "\nPrecio de compra: " + this.precioDeCompra;
        cadena += "\nPrecio de venta: " + this.precioDeVenta;
        cadena += "\nStock: " + this.stock + " unidades";
        cadena += "\n------------------------------------------";
        return cadena;
    }
}
