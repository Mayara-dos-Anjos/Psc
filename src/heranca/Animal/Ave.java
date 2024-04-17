package src.folha.heranca.Animal;

public class Ave extends Oviparo {

    boolean voa;

    public Ave(String habitat, boolean voa) {
        super(true, habitat);
        this.voa = voa;
    }
    
}
