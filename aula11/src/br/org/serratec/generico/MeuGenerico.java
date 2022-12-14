package br.org.serratec.generico;

public class MeuGenerico<T> {
	private T valor;

	public MeuGenerico(T valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "MeuGenerico [valor=" + valor + "]";
	}

	public T getValor() {
		return valor;
	}

}
