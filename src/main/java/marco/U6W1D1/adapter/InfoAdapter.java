package marco.U6W1D1.adapter;

import java.time.LocalDate;

public class InfoAdapter implements DataSource {
    private Info infoData;

    @Override
    public String getNomeCompleto() {
        return infoData.getNome() + " " + infoData.getCognome();
    }

    @Override
    public int getEta() {
        int eta;
        eta = LocalDate.now().getYear() - infoData.getDataDiNascita().getYear();
        return eta;
    }
}
