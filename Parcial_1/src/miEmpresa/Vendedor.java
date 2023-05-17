package miEmpresa;

public class Vendedor {
    private String nombre;           //var de instancia de referencia
    private String apellido;         //var de instancia de referencia
    private String fecha_nac;        //var de instancia de referencia
    private String email;            //var de instancia de referencia
    private double comision;         //var de instancia primitiva
    private String tipoEmp;          //var de instancia de referecnia
    private Empresa empresa;         //var de instancia de referecnia

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

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    //#########################
    //####   Constructor   ####
    //#########################

    public Vendedor(String nombre,      //var locales del const.
                    String apellido,
                    String fecha_nac,
                    String email,
                    double comision,
                    String tipoEmp,
                    Empresa empresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.email = email;
        this.comision = comision;
        this.tipoEmp = tipoEmp;
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return  "Vendedor:\n-----------\n" +
                "Nombre: \t" + nombre + "\n" +
                "Apellido: \t" + apellido + "\n" +
                "Fecha Nac: \t" + fecha_nac + "\n" +
                "Email: \t\t" + email + "\n" +
                "Comision: \t" + (comision*100) + "%\n" +
                "Tipo Emp: \t" + tipoEmp + "\n" +
                "Empresa: \t" + empresa.getNombre() + "\n";
    }
}
