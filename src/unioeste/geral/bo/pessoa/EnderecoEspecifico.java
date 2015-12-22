
package unioeste.geral.bo.pessoa;

import java.io.Serializable;
import unioeste.geral.bo.endereco.Endereco;

public class EnderecoEspecifico {

	private int idEnderecoEspecifico;

	private int nroEndereco;

	private String ComplementoEndereco;

	private Endereco endereco;

    public int getIdEnderecoEspecifico() {
        return idEnderecoEspecifico;
    }

    public void setIdEnderecoEspecifico(int idEnderecoEspecifico) {
        this.idEnderecoEspecifico = idEnderecoEspecifico;
    }

    public int getNroEndereco() {
        return nroEndereco;
    }

    public void setNroEndereco(int nroEndereco) {
        this.nroEndereco = nroEndereco;
    }

    public String getComplementoEndereco() {
        return ComplementoEndereco;
    }

    public void setComplementoEndereco(String ComplementoEndereco) {
        this.ComplementoEndereco = ComplementoEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
        
        

}
