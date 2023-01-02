
package com.portfolio.eze.Interface;

import com.portfolio.eze.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(long id);
    
    public Persona findPersona(Long id);
}
