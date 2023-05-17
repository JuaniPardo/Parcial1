package empresaTest;

import miEmpresa.*;

public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(             //var de ref. local del método main
                "Lo de Carlitos",
                44445555,
                "Mitre 264",
                "CABA",
                "empresacarlitos@gmail.com",
                "30-99.345.735-2");
        MetPago tarjeta = new MetPago("Tarjeta");   //var de ref. local del método main
        MetPago efectivo = new MetPago("Efectivo"); //var de ref. local del método main
        Cliente cliente1 = new Cliente(                    //var de ref. local del método main
                "Juan",
                "Perez",
                "20/02/1990",
                "juanperez@gmail.com",
                0,
                "nuevo");
        Cliente cliente2 = new Cliente(         //var de ref. local del método main
                "Luis",
                "Gomez",
                "25/12/1995",
                "luisgomez@gmail.com",
                0,
                "Nuevo");
        Vendedor vendedor1 = new Vendedor(      //var de ref. local del método main
                "Raul",
                "Lopez",
                "30/06/2000",
                "raullopez@gmail.com",
                0.02,
                "Permanente",
                empresa);

        Compra compra1 = new Compra(            //var de ref. local del método main
                "\"Varios\"",
                vendedor1,
                cliente1,
                12990,
                tarjeta);


        System.out.println(compra1);
        System.out.println("DATOS EMPRESA:\n"+ empresa);
        System.out.println("==================================");
        System.out.println("DATOS VENDEDORES:\n"+ vendedor1);
        System.out.println("==================================");
        System.out.println("DATOS CLIENTE 1:\n"+ cliente1);
        System.out.println("==================================");
        System.out.println("DATOS CLIENTE 2:\n"+ cliente2);
        System.out.println("==================================");
    }
}
