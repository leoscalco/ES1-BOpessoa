
package unioeste.geral.bo.pessoafisica;

import java.io.Serializable;

public class Sexo implements Serializable{

	private char siglaSexo;

	private String nomeSexo;

    public char getSiglaSexo() {
        return siglaSexo;
    }

    public void setSiglaSexo(char siglaSexo) {
        this.siglaSexo = siglaSexo;
    }

    public String getNomeSexo() {
        return nomeSexo;
    }

    public void setNomeSexo(String nomeSexo) {
        this.nomeSexo = nomeSexo;
    }
        
        

}
