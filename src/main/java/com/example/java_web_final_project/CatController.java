package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {

        this.catService = catService;
    }

    @GetMapping
    public List<Cat> getCats() {
        return catService.getAll();
    }

    @PostMapping
    public void addCat(@RequestBody Cat cat) {
        catService.add(cat);
    }

    @PutMapping
    public void updateCat(@RequestParam(value = "id") Integer id, @RequestBody Cat cat) {
        catService.update(cat, id);
    }

    @DeleteMapping
    public void deleteCat(@RequestParam(value = "id") Integer id) { // /api/cats/?id=1
        catService.delete(id);
    }

    /*
   @DeleteMapping("/{id}")
    public void deleteCat(@PathVariable(value = "id") Integer id) {
        catService.delete(id);
    }

     */
}
