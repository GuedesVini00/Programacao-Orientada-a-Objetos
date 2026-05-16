package com.clinica.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clinica.BD.ConexaoSQL;
import com.clinica.bean.Recepcionista;

public class RecepcionistaDAO {

    private Connection conexao;

    public RecepcionistaDAO(){

        try{
            conexao = ConexaoSQL.conectar();
            System.out.println("Conectado com Sucesso!");
            String sql = """
            CREATE TABLE IF NOT EXISTS recepcionista (
                codigo INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                nome TEXT NOT NULL,
                cpf TEXT UNIQUE NOT NULL,
                telefone TEXT,
                senha TEXT
            )""";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.execute();
        }
        catch (SQLException e) {
            System.out.println("Erro ao se conectar no banco!");
             e.printStackTrace();
        } 
    }

    public void create(Recepcionista obj) throws SQLException{
        String sql = "INSERT INTO recepcionista (nome, cpf, telefone, senha) VALUES (?,?,?,?)";
        PreparedStatement comandoSQL = conexao.prepareStatement(sql);
        comandoSQL.setString(1, obj.getNome());
        comandoSQL.setString(2, obj.getCpf());
        comandoSQL.setString(3, obj.getTelefone());
        comandoSQL.setString(4, obj.getSenha());
        comandoSQL.executeUpdate();
        System.out.println("Recepcionista cadastrada com sucesso!");

    }

    public void read() throws SQLException{
        String sql = "SELECT * FROM recepcionista";
        PreparedStatement comandoSQL = conexao.prepareStatement(sql);
        ResultSet resultado = comandoSQL.executeQuery();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            String cpf = resultado.getString("cpf");
            String telefone = resultado.getString("telefone");
            String senha = resultado.getString("senha");
            
        System.out.println("---------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
        }

        resultado.close();
        comandoSQL.close();

    }

}
