import java.util.Arrays;
public class House {
    //deiniendo instancias:
    private int floorsNumber;//numero de pisos
    private String adress;//direccion
    private String[] residentsNames;//matriz de residentes

    //Getters e Setters
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getAdress(){
        return adress;
    }
    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }
    public int getFloorsNumber(){
        return floorsNumber;
    }
    public void setResidentsNames(String[] residentsNames){
        this.residentsNames = residentsNames;
    }
    public String[] getResidentsNames(){
        return residentsNames;
    }

    @Override
    public String toString() {
        return "Direccion: "+adress+"\nPisos: "+floorsNumber+"\nResidentes: "+Arrays.toString(residentsNames);
    }
}
