package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;
        
public class JogadorDAO {
    public boolean inserir(Jogador jogador){
        Boolean retorno;
        String sql = "INSERT INTO jogador(login,senha,email,imagem) VALUES(?,?,?,?)"; //monta o sql de insert na tabela
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            pst.setString(1,jogador.getLogin());
            pst.setString(2,jogador.getSenha());//insere os parametros
            pst.setString(3,jogador.getEmail());
            pst.setBytes(4, jogador.getImagem());
            pst.executeUpdate();//executa o sql no banco
            retorno = true;         

        } catch (SQLException ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<Jogador> listar(){
        List<Jogador> lista = new ArrayList<Jogador>(); //cria a lista de jogadores
        String sql = "SELECT * FROM jogador";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            ResultSet res = pst.executeQuery();//executo o sql e jogo num ResultSet
            while(res.next()){ //enquanto tiver registro eu vou relacionar com minha classe Jogador e adicionar na lista
                Jogador j = new Jogador();
                j.setLogin(res.getString("login"));
                j.setSenha(res.getString("senha"));
                j.setEmail(res.getString("email"));
                j.setImagem(res.getBytes("imagem"));
                lista.add(j);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return lista;
    }
    
    public boolean excluir(Jogador jogador){
        Boolean retorno;
        String sql = "DELETE FROM jogador WHERE login = ?"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            pst.setString(1,jogador.getLogin());           
            pst.executeUpdate();
            retorno = true;         

        } catch (SQLException ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public boolean atualizar(Jogador jogador){
        Boolean retorno;
        String sql = "UPDATE jogador SET senha = ?, email = ? WHERE login = ?"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            pst.setString(1,jogador.getSenha());
            pst.setString(2,jogador.getEmail());
            pst.setBytes(3, jogador.getImagem());
            pst.setString(4,jogador.getLogin());
             pst.executeUpdate();
            retorno = true;         

        } catch (SQLException ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public Jogador login(Jogador j){
        Jogador retorno = null;
        String sql = "SELECT * FROM jogador WHERE login = ? AND senha = ?";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            pst.setString(1,j.getLogin());
            pst.setString(2,j.getSenha());
            ResultSet res = pst.executeQuery();

            if(res.next()){
                retorno = new Jogador();
                retorno.setLogin(res.getString("login"));
                retorno.setSenha(res.getString("senha"));
                retorno.setEmail(res.getString("email"));
                retorno.setImagem(res.getBytes("imagem"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return retorno;
    }
    
    public Boolean igual(String login){
        List<Jogador> lista = new ArrayList<Jogador>();
        Boolean retorno = false;
        String sql = "SELECT * FROM jogador";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            ResultSet res = pst.executeQuery();
            while(res.next()){ 
                Jogador j = new Jogador();
                j.setLogin(res.getString("login"));
                j.setSenha(res.getString("senha"));
                j.setEmail(res.getString("email"));
                j.setImagem(res.getBytes("imagem"));
                lista.add(j); 
                
                for (Jogador jogador : lista) {
                    if(jogador.getLogin() == login){
                        retorno = true;
                        break;
                    }
                    else{
                        retorno = false;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return retorno;
    }
    
  
  
}
