
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
import java.util.Map;

public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }

    public boolean insertarProducto ( Producto p){
    	if (lista.containsKey(p.getCodigo())){
    		return false;
    	}
    	else{
    		lista.put(p.getCodigo(), p);
            return true;
    	}
    }
 
    public boolean borrarProducto ( int codigo ){
    	for (Map.Entry aux: lista.entrySet()){
    		if (codigo == (int)aux.getKey()){
    			lista.remove(aux);
    			return true;
    		}
    	}      
      	return false;

    }
    
    public Producto buscarProducto ( int codigo) {
    	for (Map.Entry aux: lista.entrySet()){
    		if (codigo == (int)aux.getKey()){
    			return (Producto)aux.getValue();
    		}
    	}
        return null;
    }
    
    public void listarProductos (){
    	for (Map.Entry aux : lista.entrySet()){
    		System.out.println(aux.toString());
    		System.out.println("");
    	}
        
    }
    
    public boolean modificarProducto (Producto nuevo){
       return false;
    }

    public void listarPocoStock(){
    	for (Producto aux : lista.values()){
    		if (aux.getStock() < aux.getStock_min()){
    			System.out.println(aux.toString());
    			System.out.println(" ");
    		}
    	}
        
    }
    
    
    
}
