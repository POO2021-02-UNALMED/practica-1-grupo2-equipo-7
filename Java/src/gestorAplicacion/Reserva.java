package gestorAplicacion;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Reserva implements Serializable {
    private int numreserva;
    private String fechareserva;
    private int cliente;
	private String horareserva;
    private int cantidadpersonas;
	public static LinkedList<Reserva> reservas = new LinkedList<>();

	public Reserva(int cliente, int numreserva,String fechareserva,String horareserva, int cantidadpersonas) {
	    
		this.cliente = cliente;
		this.numreserva = numreserva;
	    this.fechareserva = fechareserva;
	    this.horareserva = horareserva;
		this.cantidadpersonas = cantidadpersonas;
		  	
	}

	public int getCliente() {
		return cliente;
	}





	public void setCliente(int cliente) {
		this.cliente = cliente;
	}





	public int getNumreserva() {
	return numreserva;
}

    public void setNumreserva(int numreserva) {
	this.numreserva = numreserva;
}

    public String getFechareserva() {
	return fechareserva;
}

    public void setFechareserva(String fechareserva) {
	this.fechareserva = fechareserva;
}

   
		
		public String getHorareserva() {
			return horareserva;
		}


		public void setHorareserva(String horareserva) {
			this.horareserva = horareserva;
		}


		public int getCantidadpersonas() {
			return cantidadpersonas;
		}


		public void setCantidadpersonas(int cantidadpersonas) {
			this.cantidadpersonas = cantidadpersonas;
		}


	
	
	

	@Override
	 public String toString() {
        return "numero de reserva: "+getNumreserva() + "\n" +
                "[ fecha de la reserva: "+ getFechareserva() + "\n" +
                "  cliente: "+ getCliente() + "\n" +
                " hora de la reserva: "+ getHorareserva() + "\n" +
                "  cantidad personsas: "+ getCantidadpersonas()+" ]";
    }

	public static void verReserva() {
	for (Reserva reserva : reservas ) {
		System.out.println(reserva);
	}
	
	}
	public static void crearReserva(int cliente, int numreserva,String fechareserva,String horareserva, int cantidadpersonas) {
	      Reserva newR=new Reserva(cliente, numreserva,fechareserva,horareserva,cantidadpersonas);
	      reservas.add(newR);
	      
	    }

}

