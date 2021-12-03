
package com.misiontic.sergio.cacharrero.repositories;

import com.misiontic.sergio.cacharrero.crudRepository.CloneCrud;
import com.misiontic.sergio.cacharrero.model.Clone;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Nico
 */
public class CloneRepository {
    
    @Autowired
    private CloneCrud repository;
    
    public List<Clone> getAll(){
        return (List<Clone>) repository.findAll();
    }
    
    public Clone save(Clone clone){
        return repository.save(clone);
    }
    
    public void deleteById(Integer id){
        repository.deleteById(id);
    }
    
    public Optional<Clone> getCloneByName(String name){
        return repository.findByName(name);
    }
    
    public Optional<Clone> getCloneById(Integer id){
        return repository.findById(id);
    }
    
}
