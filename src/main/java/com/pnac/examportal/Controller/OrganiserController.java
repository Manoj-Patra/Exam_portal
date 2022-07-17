package com.pnac.examportal.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class OrganiserController {/*

	@Autowired
	OrganiserRepository repo;

	@Autowired
	ExamRepository examRepository;

	public static String LOGIN_ROUTE="redirect:/organiser/login";

	@GetMapping("organiser/register")
	public String register(Model model) {
		model.addAttribute("organiser",new Organiser());
		return "organiser/register";
	}
	
	@PostMapping("organiser/register")
	public String registerPost(Organiser org) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword=encoder.encode(org.getPassword());
		org.setPassword(encodedPassword);
		repo.save(org);
		return "redirect:/organiser/dashboard";
	}
	
	@GetMapping("organiser/login")
	public String login() {
		Object user= SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(user instanceof OrganiserDetails){
			return "redirect:/organiser/dashboard";
		}
		return "organiser/login";
	}
	
	@GetMapping("organiser/dashboard")
	public String dashboard(Model model) {
		int examcount=0;
		Object user=SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(user instanceof OrganiserDetails){
			Organiser org = ((OrganiserDetails) user).getOrg();
			examcount = examRepository.findByOrganiserId(org.getId()).size();
		}
		model.addAttribute("examcount",examcount);
		return "organiser/dashboard";
	}*/
}
