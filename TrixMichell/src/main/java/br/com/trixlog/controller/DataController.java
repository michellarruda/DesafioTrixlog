package br.com.trixlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.trixlog.model.Location;
import br.com.trixlog.service.DataService;

@Controller
public class DataController {
    @Autowired
    DataService dataService;

    @RequestMapping("home")
    public ModelAndView getLocations() {
	List<Location> locationList = dataService.getList();
	return new ModelAndView("home", "locationList", locationList);
    }

    @RequestMapping("new")
    public ModelAndView getNewLocation(@ModelAttribute Location location) {
	return new ModelAndView("novo");
    }

    @RequestMapping("save")
    public ModelAndView registerLocation(@ModelAttribute Location location) {
	dataService.insertRow(location);
	return new ModelAndView("redirect:home");
    }

    @RequestMapping("delete")
    public ModelAndView deleteLocation(@RequestParam int id) {
	dataService.deleteRow(id);
	return new ModelAndView("redirect:home");
    }

    @RequestMapping("edit")
    public ModelAndView editLocation(@RequestParam int id, @ModelAttribute Location location) {
	Location locationObject = dataService.getRowById(id);
	return new ModelAndView("editar", "locationObject", locationObject);
    }

    @RequestMapping("update")
    public ModelAndView updateLocation(@ModelAttribute Location location) {
	dataService.updateRow(location);
	return new ModelAndView("redirect:home");
    }
}
