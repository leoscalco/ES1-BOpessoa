
package unioeste.geral.bo.pessoa;

import java.io.Serializable;
import java.util.List;
import unioeste.geral.bo.telefone.Fone;

public abstract class Pessoa implements Serializable{

	private int idPessoa;

	private NomePessoa nomePessoa;

	private List<Fone> fone;

	private List<EnderecoEspecifico> enderecoEspecifico;

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public NomePessoa getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(NomePessoa nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public List<Fone> getFone() {
        return fone;
    }

    public void setFone(List<Fone> fone) {
        this.fone = fone;
    }

    public List<EnderecoEspecifico> getEnderecoEspecifico() {
        return enderecoEspecifico;
    }

    public void setEnderecoEspecifico(List<EnderecoEspecifico> enderecoEspecifico) {
        this.enderecoEspecifico = enderecoEspecifico;
    }

   
    
        
        

}
