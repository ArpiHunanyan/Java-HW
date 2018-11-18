class My1Class{
    String name;
    String fName;
    My1Class(String name,String fName) {
        this.name = name;
        this.fName = fName;
    }
    String getFullName(){
        return this.name + " " + this.fName;
    }
    String aject(){
        return "is awesome!!!";
    }
}