class Fraccion
{
    int numerador1, denominador1, numerador2, denominador2;

    public Fraccion(int numerador1, int denominador1, int numerador2, int denominador2)
    {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

    void sumar()
    {
        double reslutado = numerador1 / (denominador1 * 1.0) + numerador2 / (denominador2 * 1.0);
        System.out.println("suma: " + reslutado);
    }
    void restar()
    {
        double reslutado = numerador1 / (denominador1 * 1.0) - numerador2 / (denominador2 * 1.0);
        System.out.println("resta: " + reslutado);
    }
    void multiplicar()
    {
        double reslutado = numerador1 / (denominador1 * 1.0) * numerador2 / (denominador2 * 1.0);
        System.out.println("multiplicacion: " + reslutado);
    }
    void dividir()
    {
        double reslutado = numerador1 / (denominador1 * 1.0) / numerador2 / (denominador2 * 1.0);
        System.out.println("division: " + reslutado);
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }
}


