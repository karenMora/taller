/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ARSW.services;

import java.io.IOException;
import org.springframework.stereotype.Service;
import taller.ARSW.httpConnection.ApiPeliculas;

/**
 *
 * @author Karen Mora
 */
@Service("stub")
public class ApiServiceStub implements ApiService{
    
    public ApiPeliculas apiPeliculas;
    
    public ApiServiceStub(){
    }
    
    @Override
    public String getJsonByPelicula(String peli, String year) throws IOException {
        return apiPeliculas.getJson(peli,year);
    }
    
    
}