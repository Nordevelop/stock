package misClase;
import java.utils.*;
public class Factura {
   /*
    *objetos de la clase Factura emcapsulado.con Acceso Denegado en clase Main()
    *@Author Nordevelop
    *Factura
    */ 
    //detalle del Cliente_-.....Atencion!! estos objetos no deben iterar!
	
    private int id_cliente;
    private String nombre_cliente;
    private String apellido_Cliente;
    private int cuil_cliente;	
    private String calle_cliente;
    private int altura_cliente;
    private String loc_cliente;
    //detalle de la venta.......Atencion!! estos objetos deben iterar!
    private int id_venta;
    private String descripcion_venta;
    private int precio_venta;
    private int cantidad_venta;
    private int subtotal_venta;	
    public int asignar_id_cliente()
	{
		return this.id_cliente; //devolver
	}
	public String asignar_nombre_cliente()  //metodo 
	{
		return this.nombre_cliente;
	}
  public String asignar_apellido_cliente()
  {
    return this.apellido_cliente;
  }
  public String asignar_calle_cliente()
  {
    return this.calle_cliente;
  }
  public int asignar_altura_cliente()
  {
    return this.altura_cliente;
  }
  public int asignar_loc_cliente()
  {
    return this.loc_cliente; 
  }
  public int asignar_id_venta()
  {
    return this.
  }
	
    
  
}

