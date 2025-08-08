public class co3 {
    int number;
    String item;

    co3(){
       System.out.println(" hello world ");     
    }

    
    void fun1()
    {
        System.out.println(item + " is available again. ");
    }
    
    void fun2()
    {
        System.out.println(item + " is out of stock. ");
    }

    co3(int n, String i)
    {
        number =n;
        item =i;
        System.out.println(item + " inside contructor " + i);
    }


}
