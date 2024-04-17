package marco.U6W1D1.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
