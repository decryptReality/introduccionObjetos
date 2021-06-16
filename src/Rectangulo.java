import java.util.Scanner;

class Rectangulo
{
    private int ancho;
    private int largo;

    Rectangulo()
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ingrese los datos de un rectangulo");
        System.out.println("ingrese el ancho");
        int ancho = scanner1.nextInt();
        System.out.println("ingrese el largo");
        int largo = scanner1.nextInt();

        if (ancho != largo)
        {
            this.ancho = ancho;
            this.largo = largo;
        }
        else
        {
            System.out.println("no es un rectangulo (ancho = largo)");
        }
    }
    Rectangulo(int ancho, int largo)
    {
        if (ancho != largo)
        {
            this.ancho = ancho;
            this.largo = largo;
        }
        else
        {
            System.out.println("largo y ancho son iguales");
        }
    }

    void calcularArea()
    {
        int area = ancho * largo;
        System.out.println("area: " + area);
    }
    void calcularPerimetro()
    {
        int perimetro = 2 * largo + 2 * ancho;
        System.out.println("perimetro: " + perimetro);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}

