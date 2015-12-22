package unioeste.geral.bo.pessoafisica;

import java.io.Serializable;

public class CPF implements Serializable{

	private int nroCPF;

	private String nroFormatado;

    public int getNroCPF() {
        return nroCPF;
    }

    public void setNroCPF(int nroCPF) {
        this.nroCPF = nroCPF;
    }

    public String getNroFormatado() {
        return nroFormatado;
    }

    public void setNroFormatado(String nroFormatado) {
        this.nroFormatado = nroFormatado;
    }
        
        

}
