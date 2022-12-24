package negocios;

/**
 *
 * @author Fabian
 */
public class Calcula {
    private Double tInicial;
    private Double tFinal;
    private Double distancia;
    private Double vel;
    private Double tTotal;

    public Calcula() {
    }

    public Calcula(Double tInicial, Double tFinal, Double distancia, Double vel, Double tTotal) {
        this.tInicial = tInicial;
        this.tFinal = tFinal;
        this.distancia = distancia;
        this.vel = vel;
        this.tTotal = tTotal;
    }
    
    

    public Double gettInicial() {
        return tInicial;
    }

    public void settInicial(Double tInicial) {
        this.tInicial = tInicial;
    }

    public Double gettFinal() {
        return tFinal;
    }

    public void settFinal(Double tFinal) {
        this.tFinal = tFinal;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double gettTotal() {
        return tTotal;
    }

    public void settTotal(Double tTotal) {
        this.tTotal = tTotal;
    }
    
    
    
    
// convierte los parametros de String a numeros    
    public Calcula(String tini,String tfin, String dist) {
        tInicial=Double.parseDouble(tini);
        tFinal=Double.parseDouble(tfin);
        distancia=Double.parseDouble(dist);
          
    }
    
    public void velocidad () {
        vel=distancia - (tFinal-tInicial);
    }
     public void tiempoTotal () {
        tTotal= (tFinal-tInicial);
    }
    
    public Double getVel () {
        return vel;
    } 
    
    public Double getTiempo(){
        return tTotal;
    }
}
