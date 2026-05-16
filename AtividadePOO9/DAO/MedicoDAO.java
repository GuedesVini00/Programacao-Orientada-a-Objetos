package com.clinica.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.clinica.BD.ConexaoSQL;
import com.clinica.bean.Medico;

public class MedicoDAO {
    private Connection conexao;

    public MedicoDAO(){
        try {
            conexao = ConexaoSQL.conectar();
            System.out.println("Conectado com Sucesso!");

             String sql = """
            CREATE TABLE IF NOT EXISTS medico (
                codigo INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                nome TEXT NOT NULL,
                telefone TEXT ,
                senha TEXT,
                crm TEXT UNIQUE NOT NULL,
                especialidade TEXT
            )""";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        } catch (SQLException e) {
            System.out.println("Erro ao se conectar no banco!");
             e.printStackTrace();
        }

    }

    public void create(Medico obj) throws SQLException{
        String sql = "insert into medico(nome, telefone, senha, crm, especialidade) values(?,?,?,?,?)";
        PreparedStatement comandoSql = conexao.prepareStatement(sql);
        comandoSql.setString(1, obj.getNome());
        comandoSql.setString(2, obj.getTelefone());
        comandoSql.setString(3, obj.getSenha());
        comandoSql.setString(4, obj.getCrm());
        comandoSql.setString(5, obj.getEspecialidade());
        comandoSql.executeUpdate();
        System.out.println("Médico cadastrado com sucesso!");
    }

    public void read() throws SQLException{
        String sql = "SELECT * FROM medico";
        PreparedStatement comandoSQL = conexao.prepareStatement(sql);
        ResultSet resultado = comandoSQL.executeQuery();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            String telefone = resultado.getString("telefone");
            String senha = resultado.getString("senha");
            String crm = resultado.getString("crm");
            String especialidade = resultado.getString("especialidade");
            
        System.out.println("---------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
        }

        resultado.close();
        comandoSQL.close();
    }
}
