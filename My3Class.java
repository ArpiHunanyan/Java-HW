class My3Class{
    boolean q ;
    boolean p ;
    My3Class(boolean q,boolean p){
        this.q = q;
        this.p = p;
    }
    String oper(){
        if((!p==!q)==true){
            return "contropositive of q->p";
        } 
        return " " ;
        
    }
    String exOr(){
        if(q!=p){
         return "Exclusive or";
        } else {
            return "false !";
         }
        }
    }
    