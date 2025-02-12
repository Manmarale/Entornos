package modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String password;
    private int edad;
    private String email;


    public Usuario(){}
    public Usuario(int id, String nombre, String password, int edad, String email){
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.email = email;
    }

    public Usuario(String nombre, String password, int edad, String email) {
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.email = email;
    }

}
