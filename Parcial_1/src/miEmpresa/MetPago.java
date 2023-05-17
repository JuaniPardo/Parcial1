package miEmpresa;

public class MetPago {
    private String metodo;       //var de instancia de referencia

    //#########################
    //### Getters y Setters ###
    //#########################


    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    //#########################
    //####   Constructor   ####
    //#########################

    public MetPago(String metodo) {     //var local del const.
        this.metodo = metodo;
    }


    @Override
    public String toString() {
        return "Forma Pago: \t" + metodo + "\n";
    }
}
