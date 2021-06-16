class Libro
{
    private String nombre;
    private String autor;
    private boolean prestado;

    Libro ()
    {
        prestado = false;
        System.out.println("manipule el nombre y el autor del libro usando los getters y setters");
    }

    public Libro(String nombre, String autor)
    {
        this.nombre = nombre;
        this.autor = autor;
        prestado = false;
    }

    void prestamo()
    {
        prestado = true;
    }
    void devolucion()
    {
        prestado = false;
    }
    void mostrarInformacion()
    {
        System.out.println("nombre: " + nombre);
        System.out.println("autor: " + autor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}


