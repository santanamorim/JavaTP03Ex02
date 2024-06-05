public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(1, "João", "Silva", 3000, 0.1);
        Vendedor vendedor2 = new Vendedor(2, "Maria", "Santos", 2500, 0.15);

        System.out.println("Vendedor 1:");
        System.out.println("Nome formatado: " + vendedor1.exibirNomeFormatado());
        System.out.println("Salário com comissão: R$" + String.format("%.2f", vendedor1.calcularSalarioComComissao()));
        System.out.println();

        System.out.println("Vendedor 2:");
        System.out.println("Nome formatado: " + vendedor2.exibirNomeFormatado());
        System.out.println("Salário com comissão: R$" + String.format("%.2f", vendedor2.calcularSalarioComComissao()));
    }
}

class Vendedor {
    private int matricula;
    private String nome;
    private String sobrenome;
    private double salario;
    private double comissao;

    public Vendedor(int matricula, String nome, String sobrenome, double salario, double comissao) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.comissao = comissao;
    }

    public double calcularSalarioComComissao() {
        return salario + (salario * comissao);
    }

    public String exibirNomeFormatado() {
        return sobrenome + ", " + nome;
    }
}