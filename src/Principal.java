class Principal
{
    public static void main(String[] args) {
        new Principal().principal();
    }
    public void principal()
    {
        System.out.println("\nEjercicio 1 , contador");
        Contador contador1 = new Contador();
        Contador contador2 = contador1;
        contador2.incrmentar(13);
        contador2.decrementar(5);
        System.out.println("contador: " + contador2.getCuenta());

        System.out.println("\nEjercicio 2, cuadrado");
        Cuadrado cuadrado1 = new Cuadrado(1);
        Cuadrado cuadrado2 = cuadrado1;
        cuadrado2.setLado(3);
        cuadrado1.calcularArea();
        cuadrado1.calcularPerimetro();

        System.out.println("\nEjercicio 3, circulo");
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = circulo1;
        circulo2.setRadio(2);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        System.out.println("\nEjercicio 4, rectangulo");
        Rectangulo rectangulo1 = new Rectangulo(7,3);
        Rectangulo rectangulo2 = rectangulo1;
        rectangulo2.setAncho(5);
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();

        System.out.println("\nEjercicio 5, contador");
        Contador contador3 = new Contador();
        Contador contador4 = contador3;
        contador4.setCuenta(23);
        System.out.println("contador: " + contador4.getCuenta());

        System.out.println("\nEjercicio 6, libro");
        Libro libro1 = new Libro("Ecuaciones Diferenciales","Dennis G. Zill");
        Libro libro2 = libro1;
        libro2.setAutor("Stewart");
        libro2.setNombre("Calculo");
        libro1.mostrarInformacion();

        System.out.println("\nEjercicio 7, fraccion");
        Fraccion fraccion1 = new Fraccion(1,3,7,13);
        Fraccion fraccion2 = fraccion1;
        fraccion2.setNumerador1(6);
        fraccion2.setDenominador1(13);
        fraccion1.sumar();
        fraccion1.restar();
        fraccion1.dividir();
        fraccion1.multiplicar();
    }
}
