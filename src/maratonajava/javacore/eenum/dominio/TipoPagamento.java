package src.maratonajava.javacore.eenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };
    // Feito somente para ser sobrescrito.
    public abstract double calcularDesconto(double valor);

}
