
package unioeste.geral.bo.pessoafisica;

import java.io.Serializable;
import unioeste.geral.bo.endereco.Uf;

public class OrgaoEmissor implements Serializable{

	private int idOrgaoEmissor;

	private String siglaOrgaoEmissor;

	private String nomeOrgaoEmissor;

	private Uf uf;

    public int getIdOrgaoEmissor() {
        return idOrgaoEmissor;
    }

    public void setIdOrgaoEmissor(int idOrgaoEmissor) {
        this.idOrgaoEmissor = idOrgaoEmissor;
    }

    public String getSiglaOrgaoEmissor() {
        return siglaOrgaoEmissor;
    }

    public void setSiglaOrgaoEmissor(String siglaOrgaoEmissor) {
        this.siglaOrgaoEmissor = siglaOrgaoEmissor;
    }

    public String getNomeOrgaoEmissor() {
        return nomeOrgaoEmissor;
    }

    public void setNomeOrgaoEmissor(String nomeOrgaoEmissor) {
        this.nomeOrgaoEmissor = nomeOrgaoEmissor;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }
        
        

}
