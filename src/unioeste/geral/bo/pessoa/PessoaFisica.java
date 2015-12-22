
package unioeste.geral.bo.pessoa;

import java.io.Serializable;
import unioeste.geral.bo.pessoafisica.CPF;
import unioeste.geral.bo.pessoafisica.DocIdentidade;
import unioeste.geral.bo.pessoafisica.Sexo;

public abstract class PessoaFisica extends Pessoa implements Serializable{

	private int idPessoaFisica;

	private CPF cpf;

	private Sexo sexo;

	private DocIdentidade docIdentidade;

    public int getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(int idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }
        
        

}
