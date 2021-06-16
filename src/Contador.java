
class Contador
{
    private int cuenta;

    Contador()
    {
        cuenta = 0;
    }
    Contador(int numero)
    {
        cuenta = numero;
    }
    Contador(Contador contador1)
    {
        cuenta = contador1.getCuenta();
    }

    void incrmentar(int numero)
    {
        if (numero > 0)
        {
            cuenta = cuenta + numero;
        }
    }
    void decrementar(int numero)
    {
        if (numero > 0)
        {
            cuenta = cuenta - numero;
        }
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
}
