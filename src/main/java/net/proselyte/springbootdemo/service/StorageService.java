package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.Storages;

import net.proselyte.springbootdemo.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageService {

    private final StorageRepository storageRepository;

    @Autowired
    public StorageService(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    public Storages findById(Long id){
        return storageRepository.getOne(id);
    }

    public List<Storages> findAll(){
        return storageRepository.findAll();
    }

    public Storages saveStorage(Storages storages){
        return storageRepository.save(storages);
    }

    public void deleteById(Long id){
        storageRepository.deleteById(id);
    }

}
