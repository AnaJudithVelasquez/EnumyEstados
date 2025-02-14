public class Automovil {
        String marca;
        int modelo;
        int velocidadMaxima;
        int velocidadActual = 0;
        public enum tipoCom {
            GASOLINA,
            BIOETANOL,
            DIESEL,
            GAS_NATURAL,
            BIODIESEL
        }
       tipoCom tipoCombustible;

        enum tipoAuto{
            CIUDAD,
            COMPACTO,
            SUBCOMPACTO,
            SUV,
            EJECUTIVO
        }
    tipoAuto tipoAutomovil;

    public Automovil(String marca, int modelo, int velocidadMaxima, Automovil.tipoCom tipoCombustible,
            Automovil.tipoAuto tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    void acelerar (int incremento){
        if ((velocidadActual + incremento) < velocidadMaxima) {
            velocidadActual = velocidadActual +  incremento;

        } else {
            System.out.println("No puede acelerar por encima de la velocidad máxima");
        }
    }

    void desacelerar (int drecremento){
        if ((velocidadActual - drecremento) > 0) {
            velocidadActual = velocidadActual - drecremento;
        } else {
            System.out.println("No se puede decrementar por debajo de cero");
        }
    }
    void frenar(){
        velocidadActual = 0;
     }

    double calcularTiempoLlegada(int distancia){
        return distancia / velocidadActual;
    }

    void mostrar(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Velocidad Actual = " + velocidadActual);
        System.out.println("Velocidad Maxima = " + velocidadMaxima);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automovil = " + tipoAutomovil);
    }

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Toyota", 2023, 280, tipoCom.DIESEL, tipoAuto.CIUDAD);
        auto1.mostrar();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
    }


}