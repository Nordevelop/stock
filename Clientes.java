package misClases;

import java.util.*;

public class Clientes {
	/*Author Nordevelop
	 * 
	 *Repositorio https://github.com/Nordevelop/Stock/Clientes.java
	  *Clase clientes
	 *objetos de la clase Factura emcapsulado.con Acceso Denegado en clase Main()
     *detalle del Cliente_-...
     */
    private int id_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private int cuil_cliente;	
    private String calle_cliente;
    private int altura_cliente;
    private String loc_cliente;
    //metodos de asignacion del detalle info del Cliente
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
  public String asignar_loc_cliente()
  {
    return this.loc_cliente; 
  }
//metodos de inserccion detalle de info de cliente
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
  public Clientes (int a, String b, String c, int d, String e, int f, String g) { //Clase Constructor
	  
  this.id_cliente=a;
  this.nombre_cliente=b;
  this.apellido_cliente=c;
  this.cuil_cliente=d;
  this.calle_cliente=e;
  this.altura_cliente=f;
  this.loc_cliente=g;
  }

}
