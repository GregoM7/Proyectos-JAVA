package JuegoArcade;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posx, int posy, String direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }
}
