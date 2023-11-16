public class CondicionOR extends Condicion {
    
        private Condicion c1;
        private Condicion c2;
    
        public CondicionOR(Condicion c1, Condicion c2){
            this.c1=c1;
            this.c2=c2;
        }
    
        public boolean cumple(Planta p){
            return c1.cumple(p)|| c2.cumple(p);
        }
}
    

