package net.proselyte.springbootdemo.controller;

import net.proselyte.springbootdemo.model.Storages;
import net.proselyte.springbootdemo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StorageController {
    private final StorageService storageService;

    @Autowired
    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/storages")
    public String findAll(Model model) {
        List<Storages> storages = storageService.findAll();
        model.addAttribute("storages", storages);

        return "storage-list";
    }

    @GetMapping("/storage-create")
    public String createStorageForm(Storages storages) {
        return "storage-create";
    }

    @PostMapping("/storage-create")
    public String createStorage(Storages storages) {
        storageService.saveStorage(storages);
        return "redirect:/storages";
    }
@GetMapping("storage-delete/{id}")
    public String deleteStorage(@PathVariable("id") Long id){
        storageService.deleteById(id);
        return "redirect:/storages";
    }
    @GetMapping("storage-update/{id}")
    public String updateStoragFrom(@PathVariable("id") Long id,Model model){
        Storages storages=storageService.findById(id);
        model.addAttribute("storages",storages);
        return "/storage-update";
    }
    @PostMapping("/storage-update")
    public String updateStorage(Storages storages){
        storageService.saveStorage(storages);
        return "redirect:/storages";
    }
}
