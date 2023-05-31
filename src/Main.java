public class Main {
    public static void main(String[] args) {
        new FacadeVendaPacoteViagem()
            .venderPacote(
                "Brasil", 
                "Canadá", 
                "28/04/23", 
                "5/5/23", 
                10_000
            );
    }
}