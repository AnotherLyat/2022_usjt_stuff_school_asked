public class test {
    public static void main(String[] args) {
        Impressora imp= new Impressora();
        imp.exibir(1);
        imp.exibir(3, 5);
        imp.exibir(2, "hi");
        imp.exibir("hello", 8);
        imp.exibir("one", "two", "three");
        imp.exibir(42, 32, "test");
    }
    
}
