public class Main {
    public static void main(String[] args) {
        System.out.println("iniciou o main");
        a();
        System.out.println("finalizou o main");
    }

    static void a (){
        System.out.println("entrou no A");
        b();
        System.out.println("finalizou  o A");
    }
    static void b (){
        System.out.println("entrou no B");
        c();
        System.out.println("finalizou  o B");
    }
    static void c (){
        System.out.println("entrou no C");
        Thread.dumpStack(); // imprime a pilha de execução
        System.out.println("finalizou  o C");
    }
}
