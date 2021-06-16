class Circulo
{
    private double radio;

    Circulo(int radio)
    {
        this.radio = radio;
    }
    void calcularArea()
    {
        double area = 3.1416 * radio * radio;
        System.out.println("area: " + area);
    }
    void calcularPerimetro()
    {
        double perimetro = 2 * 3.1416 * radio;
        System.out.println("perimetro: " + perimetro);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}


