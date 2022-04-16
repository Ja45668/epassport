package com.wipro.epassport.Service;

import com.wipro.epassport.Model.Epassport;
import com.wipro.epassport.Dao.EpassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EpassportService {
    @Autowired
    private EpassportRepository epassportRepository;
    public void epassportRegistration(Epassport epassport){
        epassportRepository.save(epassport);

    }
}
