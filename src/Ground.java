import GLOOP.*;
class Ground{
    GLQuader table;
    
    Ground(){
        table  = new GLQuader(0,0,-10, 600,20,600);
        table.setzeTextur("src/Holzboden.jpg");
    }
}
