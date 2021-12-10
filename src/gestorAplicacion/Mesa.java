package gestorAplicacion;

public class Mesa {

    private int idunico;
    private String zona;
    private int numero;

    public Mesa(int idunico, String zona, int numero) {
        this.idunico = idunico;
        this.zona = zona;
        this.numero = numero;
    }

    public int getIdunico() {
        return idunico;
    }

    public void setIdunico(int idunico) {
        this.idunico = idunico;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
