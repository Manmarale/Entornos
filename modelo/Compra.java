package modelo;

import java.time.LocalDate;

public class Compra {
    private int id;
    private String nombreCliente;
    private LocalDate fechaCompra;
    private double precioCompra;
    private boolean pagoTarjeta;

    public Compra() {}

    public Compra(int id, String nombreCliente, LocalDate fechaCompra, double precioCompra, boolean pagoTarjeta) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
        this.pagoTarjeta = pagoTarjeta;
    }

    public Compra(String nombreCliente, LocalDate fechaCompra, double precioCompra, boolean pagoTarjeta) {
        this.nombreCliente = nombreCliente;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
        this.pagoTarjeta = pagoTarjeta;
    }

    
}

