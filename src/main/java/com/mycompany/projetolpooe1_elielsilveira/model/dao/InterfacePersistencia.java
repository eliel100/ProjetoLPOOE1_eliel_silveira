/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projetolpooe1_elielsilveira.model.dao;

/**
 *
 * @author spiec
 */

    public interface InterfacePersistencia {
    public Boolean conexaoAberta();
    public void fecharConexao();
    public void persist(Object o) throws Exception;
   
}
