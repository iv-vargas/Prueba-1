package logica;

public class CuentaBancaria {
	    private double saldo;

	    public CuentaBancaria(double saldoInicial) { this.saldo = saldoInicial; }
	    public double getSaldo() { return saldo; }

	    public void depositar(double monto) throws Exception {
	        if (monto <= 0) throw new Exception("Monto invalido");
	        saldo += monto;
	    }

	    public void retirar(double monto) throws Exception {
	        if (monto > saldo) throw new Exception("Fondos insuficientes");
	        saldo -= monto;
	    }

	    public boolean esVip() { return saldo >= 1000000; }

	    public double proyectarSaldo(int meses, double tasa) {
	        double s = saldo;
	        for (int i = 0; i < meses; i++) s = s * (1 + tasa);
	        return s;
	    }
}


