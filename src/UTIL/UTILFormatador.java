/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

/**
 *
 * @author FERNANDO
 */
public class UTILFormatador {
    public double converterVirgulaParaPontoReturn(String string){
        String retorno = new String();
        int tamanhoString = string.length();
        for(int i = 0; i< tamanhoString; i++){
            if(String.valueOf(retorno.charAt(i)).equals(",")){
                retorno += string.charAt(i);
            }else{
                retorno += ".";
            }
        }
        return Double.parseDouble(retorno);
    }
}
