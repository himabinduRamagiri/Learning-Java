class a{
    int method(int n1, int n2){
        return n1+n2;
    }
    
}
class b extends a{
    int method(int n1, int n2){
        return n1-n2;
    }
}

public class methodOverriding {
    public static void main(String []args){
        a object=new a();
        int result = object.method(1,2);
        System.out.println(result);
        b object1=new b();
        int result1 = object1.method(1,2);
        System.out.println(result1);

    }
}
