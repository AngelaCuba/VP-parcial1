package ejerciciomock;

public class Reserva {
    Info info= new Info();

    public void setInfo(Info info) {
        this.info = info;
    }
    public String reservar( String destino, int cantidad, int dia, int mes, int gestion){
        if(dia<1||mes<1||gestion<1||dia>31||mes>12||dia>28 ){
            return "Esta fecha no es valida";
        }
        if (cantidad<1){
            return "la cantidad no es valida"
        }

    }
}
