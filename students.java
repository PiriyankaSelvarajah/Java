public class students {
    String address="Dummy Address";
    public static void main (String[] args){
        students stu1=new students();
        students stu2=new students();
        students stu3=new students();

        System.out.println(stu1.address);
        System.out.println(stu2.address);
        System.out.println(stu3.address);

        stu2.address="updated  colombo";
        System.out.println(stu1.address);
        System.out.println(stu2.address);
        System.out.println(stu3.address);
    }
}
