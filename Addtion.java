public class Addition {
    int x;
    int y;
    int z;
    Addition(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
     void Sum(){
        System.out.print(x + y + z);
    }
    public static void main(String args[]) {
         Addition s1 = new Addition(5,2,-1);
            s1.Sum();
    }
}
