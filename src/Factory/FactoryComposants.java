package Factory;

import Components.Button;
import Components.Frame;

public interface FactoryComposants {
    public Button createButton(String nom , double taille) ;
    public Frame createFrame(String nom , double taille) ;
}
