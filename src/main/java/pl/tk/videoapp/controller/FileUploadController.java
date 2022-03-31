package pl.tk.videoapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import pl.tk.videoapp.interfaces.StorageService;

import java.util.stream.Collectors;

@Controller
public class FileUploadController {
    private final StorageService storageService;

    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/")
    public String listUploadedFiles(Model model){
//        Model model1 = model.addAttribute("files", storageService.loadAll().map(path -> MvcUriComponentsBuilder.fromMethod(FileUploadController.class, "serveFile", path.getFileName().toString()).build().toUri().toString()).collect())

        return null;
    }
}
