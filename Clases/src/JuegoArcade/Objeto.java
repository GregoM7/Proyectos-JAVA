package JuegoArcade;

public class Objeto {
    private int posx;
    private int posy;
    private String direccion;

    public Objeto(int posx, int posy, String direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
    public void irA(int x, int y, String direccion){
        System.out.println("la posicion de la nave es "+ x + y + "con direccion a: "+ direccion);
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
