public class staticvariable {
    public static String Myclass="satic variable or class variable";


   // public void mymethod(){
       // String myvar="Local Variable";
       // System.out.println(myvar);

  //  }
    public static void main(String[] args){
        System.out.println(Myclass);
        Myclass="updated";
        System.out.println(Myclass);
    }


}
