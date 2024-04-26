package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;


public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    
    @Override
    public String toString() {
        return "Codigo: " + codigo + ", nome: " + nome + ", fone: " + fone + ", email: " + email;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void inserir (){
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, fone);
        ps.setString(3, email);
        ps.execute();
        }
        catch (Exception e){
        e.printStackTrace();
        }
        }
        public void atualizar (){
            String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            ps.execute();
            }
            catch (Exception e){
            e.printStackTrace();
            }
            }
    
        public void apagar (){
            String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
            }
            catch (Exception e){
            e.printStackTrace();
                }
               }
    //metodo para listar um por vez:
       /*  public void listar (){
            String sql = "SELECT * FROM tb_pessoa";
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            int codigo = rs.getInt("codigo");
            String nome = rs.getString("nome");
            String fone = rs.getString("fone");
            String email = rs.getString("email");
            String aux = String.format(
            "Código: %d, Nome: %s, Fone: %s, Email: %s",
            codigo,
            nome,
            fone,
            email
            );
            JOptionPane.showMessageDialog (null, aux);
            
            }
            }
            catch (Exception e){
            e.printStackTrace();
            }
            }*/
            public void listar() {
                String sql = "SELECT * FROM tb_pessoa";
                ConnectionFactory factory = new ConnectionFactory();
                StringBuilder tabela = new StringBuilder();
                try (Connection c = factory.obtemConexao()) {
                    PreparedStatement ps = c.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        int codigo = rs.getInt("codigo");
                        String nome = rs.getString("nome");
                        String fone = rs.getString("fone");
                        String email = rs.getString("email");
                        
                        tabela.append(String.format("Código: %d, Nome: %s, Fone: %s, Email: %s\n", codigo, nome, fone, email));
                    }
                    JOptionPane.showMessageDialog(null, tabela.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
               

        
           
    
}
