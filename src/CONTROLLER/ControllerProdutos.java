
package CONTROLLER;

import DAO.DAOProdutos;
import MODEL.ModelProdutos;
import java.util.ArrayList;


public class ControllerProdutos {
    private DAOProdutos daoProdutos = new DAOProdutos(); 
    
    
    
    public int salvarProdutosContoller(ModelProdutos modelProdutos){
        return  this.daoProdutos.salvarProdutosDAO(modelProdutos);
    }    
    public boolean excluirProdutoController(int Codigo){
       return this.daoProdutos.excluirProduto(Codigo);
    }
    public boolean alterarProdutoController(ModelProdutos modelProdutos){
        return this.daoProdutos.alterarProdutoDAO(modelProdutos);
    }
    public ModelProdutos retornarProdutosController(int Codigo){
        return  this.daoProdutos.retornarprodutosDAO(Codigo);
    }
    public ArrayList <ModelProdutos> retornarListaProdutosController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }    
}
