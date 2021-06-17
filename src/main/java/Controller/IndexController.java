package Controller;


import com.example.demo.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    BankAccount account = new BankAccount(500, "Kalle", "Anka", 12345);



    //private final AnnonsRepository repository;
    //int sort = 1;

    /*@Autowired
    public IndexController(AnnonsRepository repository) {
        this.repository = repository;
    }*/

    /*@PostMapping("/query")

    public String query
        (@RequestParam("category") Category category){

            return "index";

    }

    @PostMapping("/sortby")

    public String sort(@RequestParam("category") Category category){
        if (category.equals("HOUSE")){
            sort = 1;
        }
        else if (category.equals("FOREST")){
            sort = 2;
        }
        System.out.println("sortby: " + sort);
        return "index";
    }*/

    @GetMapping("/")

    public String getIndexPage(Model model) {

        System.out.println(account.getBalanceAccount());

        int account1 = account.getBalanceAccount();

        model.addAttribute("balanceAccount", account1);

       /*if (sort==1) {
           model.addAttribute("annonsDTOs", repository.findAllAsDTO());
       }
       else if (sort==2) {
           model.addAttribute("annonsDTOs", repository.sortByPriceDescDTO());
       }
        System.out.println("Getmapping: " + sort);
        System.out.println(repository.findByPerson(1));*/



        return "index";
    }
}
