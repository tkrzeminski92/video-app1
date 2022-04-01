package pl.tk.videoapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tk.videoapp.dao.entity.VideoCassette;
import pl.tk.videoapp.manager.VideoCassetteManager;
import pl.tk.videoapp.model.GitUsersModel;

import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteApi {


    private VideoCassetteManager videoCassettes;

    @Autowired
    public VideoCassetteApi(VideoCassetteManager videoCassettes) {
        this.videoCassettes = videoCassettes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return videoCassettes.findAll();
    }

    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long index) {
        return videoCassettes.findById(index);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.save(videoCassette);
    }

    @GetMapping("/user")
    public GitUsersModel getData(@RequestParam(name="login") String login){
        GitUsersModel gitUsersModel = new GitUsersModel().test(login);
        return gitUsersModel;

    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long index) {
        videoCassettes.deleteById(index);
    }
}
