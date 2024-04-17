package marco.U6W1D1.adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Info {

    private String nome;

    private String cognome;

    private Date dataDiNascita;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

}
