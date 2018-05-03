
/**
 * Implementa la parte de Modelo de Datow
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
        if (buscarProducto(p.getCodigo()) == null){
            lista.add(p);
            return true;
        }
        else{
            return false;
        }

    }
 
    public boolean borrarProducto ( int codigo ){
        Producto aux = buscarProducto(codigo);
        if (aux != null){
            lista.remove(aux);
            return true;
        }
        else{
            return false;
        }
    }
    
    public Producto buscarProducto ( int codigo) {
        for (Producto aux: lista){
            if (aux.getCodigo() == codigo){
                return aux;
            }
        }
        return null;
    }
    
    public void listarProductos (){
        for (Producto aux: lista){
            System.out.println(aux.toString());
            System.out.println(" ");
        }
        
    }
    
    public boolean modificarProducto (Producto nuevo){
       return false;
    }

    public void listarPocoStock(){
        for (Producto aux : lista){
            if (aux.getStock() < aux.getStock_min()){
                System.out.println(aux.toString());
            }
        }

    }
    
    
}    
