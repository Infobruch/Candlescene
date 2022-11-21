import GLOOP.*;
class Kerze{
    GLZylinder koerper, docht;
    GLLicht flamme;

    Kerze(double x, double y, double z, double scale){
        koerper = new GLZylinder (x,50,0, 40,100);
        koerper.drehe(90,0,0);  
        koerper.setzeFarbe(1,0,0);

        //Docht erstellen
        docht = new GLZylinder (x, 105, 0, 3,10);
        docht.drehe(90,0,0); 
        docht.setzeFarbe(0,0,0);   

        //Flamme erstellen
        flamme = new GLLicht(x,125,0);
        flamme.setzeSichtbarkeit(true);
    
        flamme.setzeFarbe(1,1,0.5);  
    
        flamme.setzeSichtbarkeit(false);
    
        flamme.skaliere(1,2,1);
    }
    public void an(){
    flamme.setzeSichtbarkeit(true);
    }
    
    public void aus(){
    flamme.setzeSichtbarkeit(false);
    }
}
