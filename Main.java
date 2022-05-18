package misClases;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*Stock 
		 * Clases main clientes factura proveedor
		 */
		Scanner entra = new Scanner (System.in);
		Factura cla=null; //llamada a la clase Factura
		 ArrayList<Factura> Lista = new ArrayList<Factura>();
		int id_venta;
		 String descripcion_venta;
		 int precio_venta=0;
		 int cantidad_venta=0;
		 int subtotal_venta=0;
		 int total=0;
		
		 System.out.println("ingrese un ID o cero para terminar: ");
		   id_venta=entra.nextInt();
		   ArrayList<Factura> List = null;
		   
		   while (id_venta !=0){
			  		   
			   System.out.println("Ingrese Descripcion del Producto: ");
			     descripcion_venta = entra.next();
			   cla= new Factura(id_venta,descripcion_venta,precio_venta,cantidad_venta,subtotal_venta); 
			   System.out.println("ingrese precio del producto: ");
			       precio_venta= entra.nextInt();
			   System.out.println("ingrese Cantidad del producto: ");    
			       cantidad_venta=entra.nextInt();
			   cla.insert_id_venta(id_venta);
			   cla.insert_descripcion_venta(descripcion_venta);
			   cla.insert_precio_venta(precio_venta);
			   cla.insert_cantidad_venta(cantidad_venta);
			   subtotal_venta = precio_venta * cantidad_venta;
			   cla.insert_subtotal_venta(subtotal_venta);
			   Lista.add(cla);  // Agregar datos dentro del Array de objetos
			   total= total +subtotal_venta;
		   }
		   for(Factura c:Lista) {
			   System.out.println("************************************************************************************************************************************************************************************************************************");
			   System.out.println("ID del producto: " +"||"+ c.asignar_id_venta()+"||"+"Descripcion del producto: "+ c.asignar_descripcion_venta()+"||"+ "precio del producto: "+"||"+c.asignar_precio_venta()+"||"+"Cantidad: "+ c.asignar_cantidad_venta()+"||" +"subtotal: "+"||");
		}
		   System.out.println("*********************************************************************************************************************************************************************************************************************************");
		   System.out.println("el Total a pagar es: "+total+"$");

	 }

}

