

class Cuadrado
{
    private int lado;

    Cuadrado(int lado)
    {
        this.lado = lado;
    }
    void calcularArea()
    {
        int area = lado * lado;
        System.out.println("area: " + area);
    }
    void calcularPerimetro()
    {
        int perimetro = 4 * lado;
        System.out.println("perimetro: " + perimetro);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
