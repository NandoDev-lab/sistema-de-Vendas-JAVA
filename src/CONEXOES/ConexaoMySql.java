package CONEXOES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class ConexaoMySql{

    private Connection Con;
    private Statement Statement;
    private ResultSet resultSet;
    /**
     * @return the Con
     */
    public Connection getCon() {
        return Con;
    }

    /**
     * @param Con the Con to set
     */
    public void setCon(Connection Con) {
        this.Con = Con;
    }

    /**
     * @return the Statement
     */
    public Statement getStatement() {
        return Statement;
    }

    /**
     * @param Statement the Statement to set
     */
    public void setStatement(Statement Statement) {
        this.Statement = Statement;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }  
   
    
    public Connection conectar(){
        try {
          String url = "jdbc:mysql://localhost:3306/dbsisvenda?user=root&password=";
            setCon(DriverManager.getConnection(url));
                  } catch (SQLException e) {
                      JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.getCon();
    }
    
    public boolean executarSQL(String pSQL){
        try {
            this.setStatement(getCon().createStatement());
            
            this.setResultSet(getStatement().executeQuery(pSQL));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean executarUpdateDeleteSQL(String pSQL){
        try {
            this.setStatement(getCon().createStatement());            
            this.getStatement().executeUpdate(pSQL);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    
    public int insertSQL(String pSQL){
        int status = 0;
        try {
            this.setStatement(getCon().createStatement());
            
            this.getStatement().executeUpdate(pSQL);
            
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));
            
            while(this.resultSet.next()){
                status = this.resultSet.getInt(1);
            }
                return status;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return status;
            
        }
    }
    
    public boolean fecharConexao(){
        try {
            if((this.getResultSet() != null && (this.getStatement() != null))){
                this.getResultSet().close();
                this.getStatement().close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        return false;
    }


}