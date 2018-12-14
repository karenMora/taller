/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ARSW.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taller.ARSW.services.ApiService;

/**
 *
 * @author Karen Mora
 */
@RestController
@RequestMapping(value="/peliculas")
public class ApiController {
    
    @Autowired
    @Qualifier("stub")
    ApiService apiService;
    
    @GetMapping("/{peli}/{year}")
    public ResponseEntity<?> GetJsonAlpha(@PathVariable String peli,@PathVariable String year){
        try{
            return new ResponseEntity<>(apiService.getJsonByPelicula(peli,year),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            return new ResponseEntity<>("Error 404"+ex,HttpStatus.NOT_FOUND);
        }
    }
}
