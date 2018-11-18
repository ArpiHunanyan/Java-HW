class HomeWork{
   static int fact(int num ){
        if(num==1){
            return 1;
        } 
        return num * fact(num-1);
    }
    public static void main(String[] args){
        My1Class name = new My1Class("Joe","Poghosian");
        String sent = name.getFullName() + "  " + name.aject();
        System.out.println(sent);
        My2Class b = new My2Class(15, 70);
        System.out.println(b.add());
        System.out.println(b.sub());
        My3Class c = new My3Class(true, false);
        System.out.println(c.oper());
        System.out.println(c.exOr());
        int zz = fact(4);
        System.out.println(zz);


        

        

        }
}