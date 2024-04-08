package Bank;

import java.util.Date;
import java.util.UUID;

import javax.xml.crypto.Data;

// faça uma classe cliente

public class Cliente{
    
    private String id = UUID.randomUUID().toString(); //gera um ID único para cada cliente
    private String cpf;
    private String name;
    private Date birthdate;

    public Cliente (String cpf){
        this.id = UUID.randomUUID().toString();
        this.cpf = cpf;
    }

    public Cliente (String cpf, String name){
        this(cpf);
        this.name = name;
    }

    public Cliente getId(){
        return id;
    }
}

