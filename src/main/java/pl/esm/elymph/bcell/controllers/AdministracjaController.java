package pl.esm.elymph.bcell.controllers;

import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.esm.elymph.bcell.entities.*;
import pl.esm.elymph.bcell.repositories.*;

import java.io.IOException;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class AdministracjaController {
    @Autowired
    private SlownikiRepository slownikiRepository;

    @Autowired
    private StanyRepository stanyRepository;
    @Autowired
    private WzorKompRepository defSlownikiRepository;
    @Autowired
    private TowarRepository towarRepository;
    @Autowired
    private GrupaTowRepository grupaTowRepository;
    @Autowired
    private KomponZakRepository komponZakRepository;
    @Autowired
    private PowSlowRepository powSlowRepository;

    @PostMapping(path="/addSlowniki") // Map ONLY POST Requests
    public @ResponseBody String addSlowniki() {
            //(@RequestParam String name
     //       , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        return slownikiRepository.prDodajSlow("TWZK","NIOMA","HALA1",1.5,2,"PLN",1,1,1,"rodzaj","kolor","wielkosc","rozmiar","1");
    }

    @PostMapping(path="/usunSlowniki") // Map ONLY POST Requests
    public @ResponseBody String usunSlowniki() {
        //(@RequestParam String name
        //       , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        return slownikiRepository.prUsunSlow("TWZK","NIOMA","HALA1");
    }
/*
    @GetMapping
    public Page<Slowniki> getAll(
            @And({
                    @Spec(path = "firstName", spec = Equal.class),
                    @Spec(path = "lastName", spec = Equal.class),
                    @Spec(path = "status", spec = Equal.class)
            }) Specification<Slowniki> customerSpec,
            Pageable pageable) {

        return customerRepo.findAll(customerSpec, pageable);
    }
    @QuerydslPredicate
   // specification-arg-resolver
   @EnableSpringDataWebSupport
*/
    @PostMapping("/form")
    public String handleFormUpload(@RequestParam("name") String name,
                                   @RequestParam("file") MultipartFile file) throws IOException {

        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            // store the bytes somewhere
            return "redirect:uploadSuccess";
        }
        return "redirect:uploadFailure";
    }


    @GetMapping(path="/slowniki")
    public @ResponseBody Iterable<Slowniki> getAllSlowniki(@QuerydslPredicate(root = Slowniki.class) Predicate predicate, Pageable pageable) {
        // This returns a JSON or XML with the users
        return slownikiRepository.findAll(predicate, pageable);
    }

    @GetMapping(path="/wzorkomp")
    public @ResponseBody Iterable<WzorKomp> getAllWzk(@QuerydslPredicate(root = WzorKomp.class) Predicate predicate, Pageable pageable) {
        // This returns a JSON or XML with the users
        return defSlownikiRepository.findAll(predicate, pageable);
    }
    @GetMapping(path="/stany")
    public @ResponseBody Iterable<Stany> getAllStany(@QuerydslPredicate(root = Stany.class) Predicate predicate, Pageable pageable) {
        // This returns a JSON or XML with the users
        return stanyRepository.findAll(predicate, pageable);
    }
    @GetMapping(path="/towar")
    public @ResponseBody Iterable<Towar> getAllTowar(@QuerydslPredicate(root = Towar.class) Predicate predicate, Pageable pageable) {
        // This returns a JSON or XML with the users
        return towarRepository.findAll(predicate, pageable);
    }
    @GetMapping(path="/grupatow")
    public @ResponseBody Iterable<GrupaTow> getAllGrupa(@QuerydslPredicate(root = GrupaTow.class) Predicate predicate, Pageable pageable) {
        // This returns a JSON or XML with the users
        return grupaTowRepository.findAll(predicate, pageable);
    }

    @GetMapping(path="/komponzak")
    public @ResponseBody Iterable<KomponZak> getAllKompon(@QuerydslPredicate(root = KomponZak.class) Predicate predicate, Pageable pageable) {
        // This returns a JSON or XML with the users
        return komponZakRepository.findAll(predicate, pageable);
    }

    @GetMapping(path="/powslow")
    public @ResponseBody Iterable<PowSlow> getAllPowSlow(@QuerydslPredicate(root = PowSlow.class) Predicate predicate, Pageable pageable) {
        // This returns a JSON or XML with the users
        return powSlowRepository.findAll(predicate, pageable);
    }

}