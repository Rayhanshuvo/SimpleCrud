package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CrudController {
	@Autowired
	private CrudService crudService;
	
	@GetMapping("/ryan")
    public String greeting(Model model) {
		Crud c =new Crud();
		model.addAttribute("crud", c);
		
        return "home";
        
      
    }
	
	@PostMapping("/save")
	public String save(Crud crud){
		crudService.save(crud);
		return "redirect:/ryan";
		
	}
	
	@GetMapping("/showlist")
	public String showList(Model model){
		model.addAttribute("list", crudService.list());
		return "list";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		crudService.delete(id);
		return "redirect:/showlist";
	}
	
	@GetMapping("/edit/{id}")
	
	public String edit(@PathVariable int id,Model model){
		
	
		model.addAttribute("entity", crudService.edit(id));
		
	return "rename";
	
		
	}

}
