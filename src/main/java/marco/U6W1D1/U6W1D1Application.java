package marco.U6W1D1;

import marco.U6W1D1.adapter.Info;
import marco.U6W1D1.adapter.InfoAdapter;
import marco.U6W1D1.adapter.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class U6W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U6W1D1Application.class, args);

        Info info = new Info();
        info.setNome("Marco");
        info.setCognome("Gigi");
        info.setDataDiNascita(new Date(1990, 0, 1));

        InfoAdapter adapter = new InfoAdapter(info);


        UserData userData = new UserData();


        userData.setNomeCompleto(adapter.getNomeCompleto());
        userData.setEta(adapter.getEta());


        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }


}
