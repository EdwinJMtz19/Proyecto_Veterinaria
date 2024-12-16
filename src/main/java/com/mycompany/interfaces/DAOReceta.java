/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Receta;
import java.util.List;

/**
 *
 * @author 52951
 */
public interface DAOReceta{
    
    public List<Receta> listarReceta ()throws Exception; 
    
    public void registrar (Receta rec) throws Exception;
    
    
}
