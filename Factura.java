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
        return this.id_venta;
    }
    public String asignar_descripcion_venta()
    {
        return this.descripcion_venta;
    }
    public int asignar_precio_venta()
    {
        return this.precio_venta;
    }
    public int asignar_cantidad_venta()   
    {
	return this.cantidad_venta;
    }
    public int asignar_subtotal_venta()
    {
        return this.subtotal_venta;
    }
		  //metodos de inserccion detalle de cliente
		  public void insert_id_cliente(int a)
			{
				this.id_cliente=a;
			}
		  public void insert_nombre_cliente(String b)
		  {
			   this.nombre_cliente=b;
		  }
		  
		  public void insert_apellido_cliente(String c)
		  {
			   this.apellido_cliente=c;
		  }
		  public void  insert_cuil_cliente(int d)
		  {
			  this.cuil_cliente=d;
		  }
		  public void insert_calle_cliente(String e)
		  {
			  this.calle_cliente=e;
		  }
		  public void insert_altura_cliente(int f)
		  {
			  this.altura_cliente=f;
		  }
		  public void insert_localidad_cliente(String g)
		  {
			  this.loc_cliente=g;
		  }
		  //metodo de inserccion de detalle de ventas
		  public void insert_id_venta(int h)
		  {
			  this.id_venta=h;
		  }
		  public void insert_descripcion_venta(String j)
		  {
			  this.descripcion_venta=j;
		  }
		  public void insert_precio_venta(int k)
		  {
			  this.precio_venta=k;
			  
		  }
		  public void insert_cantidad_venta(int l)
		  {
			  this.cantidad_venta=l;
		  }
		  public void insert_subtotal_venta(int m)
		  {
			  this.subtotal_venta=m;
		  }//clase Constructor
		  public Factura(int a, String b, String c, int d, String e, int f, String g, int h, String j, int k, int l, int m)
		  {
			  this.id_cliente=a;
			  this.nombre_cliente=b;
			  this.apellido_cliente=c;
			  this.cuil_cliente=d;
			  this.calle_cliente=e;
			  this.altura_cliente=f;
			  this.loc_cliente=g;
			  this.id_venta=h;
			  this.descripcion_venta=j;
			  this.precio_venta=k;
			  this.cantidad_venta=l;
			  this.subtotal_venta=m;
			//objetos de la clase  con Acceso Permitido en  la clase Main{} 
		  }//Fin de la Clase Constructor
		  
	  }
	 
	
    
  
}

