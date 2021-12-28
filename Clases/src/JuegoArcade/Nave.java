package JuegoArcade;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, String direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }
    @Override
    public void irA (int x, int y, String direccion){
        System.out.println("la posicion de la nave es "+ getPosx()+" En X" + getPosy()+ " En Y " + "con direccion a: "+ getDireccion());
        if (getDireccion()!= direccion){
            girar(direccion);
        }
        setPosx(x);
        setPosy(y);
        setDireccion(direccion);
        System.out.println("La nave viajo hacia la posicion: "+ getPosx()+" En x "+ getPosy()+ " En y, con direccion a "+ getDireccion() );
    }
    public void girar(String direccion){
        setDireccion(direccion);
    }


    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


}
