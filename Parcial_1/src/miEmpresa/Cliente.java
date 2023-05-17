package miEmpresa;

public class Cliente {
    private String nombre;           //var de instancia de referencia
    private String apellido;         //var de instancia de referencia
    private String fecha_nac;        //var de instancia de referencia
    private String email;            //var de instancia de referencia
    private double totalCompras;     //var de instancia primitiva
    private String estado;           //var de instancia de referencia

    //#########################
    //### Getters y Setters ###
    //#########################


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



    //#########################
    //####   Constructor   ####
    //#########################

    public Cliente(String nombre,       //acá adentro son var locales
                   String apellido,
                   String fecha_nac,
                   String email,
                   double totalCompras,
                   String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.email = email;
        this.totalCompras = totalCompras;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente:\n-----------\n" +
                "Nombre: \t" + nombre + "\n" +
                "Apellido: \t" + apellido + "\n" +
                "Fecha Nac: \t" + fecha_nac + "\n" +
                "Email: \t\t" + email + "\n" +
                "Total Comp: " + totalCompras + "\n" +
                "Estado: \t" + estado + "\n";
    }
}
