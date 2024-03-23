package Factory;

import Components.ButtonMac;
import Components.FrameMac;

public class MacFactory implements FactoryComposants{
    public static MacFactory instance ;
    public static MacFactory getInstance(){
        if (instance== null){
            instance = new MacFactory() ;
        }
        return instance ;

    }

    public ButtonMac createButton(String nom, double taille){
        return new ButtonMac(nom,taille);}

    public FrameMac createFrame(String nom, double taille) {
        return new FrameMac(nom, taille);
    }
}
