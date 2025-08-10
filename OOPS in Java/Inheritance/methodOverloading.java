class one{
    int method(int n1, int n2){
        return n1+n2;
    }
    int method(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class methodOverloading {
    public static void main(String []args){
        one object=new one();
        int result = object.method(1,2);
        System.out.println(result);

    }
}
