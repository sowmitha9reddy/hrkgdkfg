// for compliation command is-syntax( javac file name)-"javac code.java"
// for runn the code wherever run method is prsernt that class should //be given as command- "java demo".
class car{
private String name;
public void setname(String name){
this.name=name;
}
public String getname(){
return name;
}

}
class demo{
public static void main(String[] args){
car c1=new car();
//c1.setname("sowmitha");
System.out.println(c1.getname());
}
}
