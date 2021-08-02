package DAO;

import CONEXOES.ConexaoMySql;
import MODEL.ModelProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAOProdutos extends ConexaoMySql {

    public int salvarProdutosDAO(ModelProdutos modelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("insert into tbl_produtos("
                    + "prod_nome,"
                    + "prod_valor,"
                    + "prod_estoque"
                    + ")VALUES("
                    + "'" + modelProdutos.getProdNome() + "',"
                    + "'" + modelProdutos.getProdValor() + "',"
                    + "'" + modelProdutos.getProEstoque() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return 0;

        } finally {
            this.fecharConexao();
        }

    }

    public boolean excluirProduto(int idProduto) {

        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM tbl_produtos WHERE id_prod = '" + idProduto + "'");
          

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            this.fecharConexao();
        }
        
    }

    public boolean alterarProdutoDAO(ModelProdutos modelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tbl_produto SET"
                    + "prod_nome = '" + modelProdutos.getProdNome() + "',"
                    + "prod_nome = '" + modelProdutos.getProdValor() + "',"
                    + "prod_nome = '" + modelProdutos.getProEstoque() + "',"
                    + "where id_prod = '" + modelProdutos.getIdProduto() + "'"
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    public ModelProdutos retornarprodutosDAO(int idProduto ){
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
            + "id_prod, "
            + "prod_nome, "
            + "prod_valor, "
            + "prod_estoque "
            + "FROM tbl_produtos WHERE id_prod = '"+ idProduto +"'"           
            );
            
            while(this.getResultSet().next()){
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));
            }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }
    public ArrayList<ModelProdutos> retornarListaProdutosDAO(){
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
            + "id_prod, "
            + "prod_nome, "
            + "prod_valor, "
            + "prod_estoque "
            + "FROM tbl_produtos;");
          while(this.getResultSet().next()){
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));
                listaModelProdutos.add(modelProdutos);
            }   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }finally{
            this.fecharConexao();
        }
        return listaModelProdutos;
    }
}
