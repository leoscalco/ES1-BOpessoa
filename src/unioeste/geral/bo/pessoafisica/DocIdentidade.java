
package unioeste.geral.bo.pessoafisica;

import java.io.Serializable;

import java.util.Date;

public class DocIdentidade implements Serializable{

	private int rg;

	private Date dataEmissao;

	private OrgaoEmissor orgaoEmissor;

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public OrgaoEmissor getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(OrgaoEmissor orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }
        
        

}
