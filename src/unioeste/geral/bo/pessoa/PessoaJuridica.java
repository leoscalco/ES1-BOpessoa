
package unioeste.geral.bo.pessoa;

import java.io.Serializable;
import unioeste.geral.bo.pessoajuridica.CNPJ;

public abstract class PessoaJuridica extends Pessoa implements Serializable{

	private int idPessoaJuridica;

	private CNPJ cnpf;

    public int getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(int idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public CNPJ getCnpf() {
        return cnpf;
    }

    public void setCnpf(CNPJ cnpf) {
        this.cnpf = cnpf;
    }
        
        

}
