package com.clinica;

import com.clinica.DAO.MedicoDAO;
import com.clinica.DAO.RecepcionistaDAO;
import com.clinica.bean.Medico;
import com.clinica.bean.Recepcionista;

public class Main {

    public static void main(String[] args) throws Exception {

        MedicoDAO mdao = new MedicoDAO();
        Medico m1 = new Medico();
        
        m1.setNome("Vinicius");
        m1.setTelefone("1234-3232");
        m1.setSenha("12345");
        m1.setCrm("SP-1234");
        m1.setEspecialidade("Cardiologista");
        mdao.create(m1);


       mdao.read();

        RecepcionistaDAO rdao = new RecepcionistaDAO();
        var r1 = new Recepcionista();

        r1.setNome("Maria");
        r1.setCpf("12345678911");
        r1.setTelefone("12345-3453");
        r1.setSenha("123456789");
        rdao.create(r1);

        rdao.read();
    }
}