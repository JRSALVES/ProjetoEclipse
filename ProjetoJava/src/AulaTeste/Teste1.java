package AulaTeste;

public class Teste1 {

    public static void main(String[] args) {
        System.out.println("Meu primeiro programa em Java\n");

        // Create a Pessoa object
        Pessoa jeruso = new Pessoa();

        // Set attributes
        jeruso.setName("Jeruso Alves Nascimento");
        jeruso.setAge(57);
        jeruso.setEmail("jerusoalves@gmail.com");

        // Output the attributes
        System.out.println("Nome: " + jeruso.getName());
        System.out.println("Idade: " + jeruso.getAge());
        System.out.println("Email: " + jeruso.getEmail());
        
        
        Produto produto1 = new Produto();
        
        produto1.setDescricao("Laranja");
        produto1.setValor(0.50);
        produto1.setDisponivel(true);
        
        
        System.out.println("Comprou: " + produto1.getDescricao() +", pagou "+ produto1.getValor() + ", Ainda tem?  "+produto1.getDescricao()+" = "+ produto1.isDisponivel());
    }
}
