import GLOOP.*;
class Kerzenszene{
    GLKamera kamera;  
    GLLicht licht;
    GLTastatur kb;

    
    Kerzenszene(){
       
        licht = new GLLicht();
        kamera = new GLEntwicklerkamera(800,600);
        kb = new GLTastatur();
        kamera.setzePosition(0,300,500);    
        
        boolean k1=false,k2=false,k3=false,k4=false;
        
        Kerze Kerze1 = new Kerze(100,50,0,20,100);
        Kerze Kerze2 = new Kerze(0,50,0,50,10);
        Kerze Kerze3 = new Kerze(-100,50,0,50,30);
        Kerze Kerze4 = new Kerze(200,50,0,50,100);
        Untergrund Tisch = new Untergrund();
        
        while(!kb.esc()){
            
        if(kb.istGedrueckt('1')){
            if(k1){
            Kerze1.aus();
            k1 = false;
            }else{
            Kerze1.an();
            k1 = true;
            }
        }

        if(kb.istGedrueckt('2')){
            if(k2){
                Kerze2.aus();
                k2 = false;
            }else{
                Kerze2.an();
                k2 = true;
            }
        }

        if(kb.istGedrueckt('3')){
            if(k3){
                Kerze3.aus();
                k3 = false;
            }else{
                Kerze3.an();
                k3 = true;
            }
        }

        if(kb.istGedrueckt('4')){
            if(k4){
            Kerze4.aus();
            k4 = false;
        }else{
            Kerze4.an();
            k4 = true;
            }

        }
        
        }
    }
}
