package Clase4;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel= 0;
    }

    public void aumentarPuntaje(){
        this.puntaje += 1;
        System.out.println("Su nuevo puntaje es de: " +puntaje);
    }

    public  void subirNivel(){
        this.nivel +=1;
        System.out.println("Estas en el nivel: " +nivel);
    }

    public void bonus(int valor){
        this.puntaje+= valor;
        System.out.println("El nuevo puntaje con el bonus es de : " +puntaje);
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
