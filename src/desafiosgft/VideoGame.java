package desafiosgft;

public class VideoGame extends Produto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame(String nome, double pre�o, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, pre�o, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isIsUsado() {
        return isUsado;
    }

    public void setIsUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }

    public void calculaImposto() {
        if (this.isIsUsado()) {
            double imp = this.getPre�o() * 0.25d;
            System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " usado, R$ " + imp + ".");
        } else {
            double imp = this.getPre�o() * 0.45d;
            System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + ", R$ " + imp + ".");
        };
    }
    
    @Override
    public String toString() {
        return "Video-game: " + this.getModelo() + ", pre\u00e7o: " + this.getPre�o() + ", quantidade: " + this.getQtd() + " em estoque.";
    }
}
