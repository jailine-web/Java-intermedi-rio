package entidades;

import java.util.function.Consumer;

public class AtualizacaoPreco implements Consumer<Produto>{

	@Override
	public void accept(Produto p) {
		p.setPreco(p.getPreco() * 1.1);
	}

}
