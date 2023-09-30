package legion.alpha.ssd_shop.controller;

import legion.alpha.ssd_shop.domain.FormFactor;
import legion.alpha.ssd_shop.domain.Product;
import legion.alpha.ssd_shop.domain.ProductService;
import legion.alpha.ssd_shop.domain.search.ProductSearchParams;
import legion.alpha.ssd_shop.domain.search.SortParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductsController {
    private final ProductService service;

    @Autowired
    public ProductsController(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/products/search";
    }

    @GetMapping("products/update/{id}")
    public String update(@PathVariable(name = "id") Long id, Model model) {
        final Optional<Product> optionalProduct = service.findById(id);
        if (optionalProduct.isPresent()) {
            model.addAttribute("product", optionalProduct.get());
            model.addAttribute("formFactors", FormFactor.values());
            return "update-product";
        }
        return "not-found";
    }

    @PostMapping("products/update")
    public String update(@ModelAttribute("product") Product product) {
        service.createOrUpdate(product);
        return "redirect:/products/search";
    }

    @GetMapping("products/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("formFactors", FormFactor.values());
        return "update-product";
    }

    @GetMapping("products/search")
    public String search(@ModelAttribute ProductSearchParams searchParams, Model model) {
        final List<Product> products = service.get(searchParams);
        model.addAttribute("products", products);
        model.addAttribute("formFactors", FormFactor.values());
        model.addAttribute("sortParams", SortParams.values());
        model.addAttribute("searchParams", searchParams);
        return "products";
    }

    @GetMapping("products/delete/{id}")
    public String delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "redirect:/products/search";
    }
}