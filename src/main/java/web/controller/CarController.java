package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.UserService;

import java.util.List;

@Controller
public class CarController {

    @GetMapping (value = "/cars")
    public String carTable(@RequestParam(value = "count",
                                required = false, defaultValue = "5")
                                int count, ModelMap model) {
        UserService userService = new UserService();
        List<Car> cars = userService.getCarList(count);
        model.addAttribute("carTable", cars);
        return "cars";
    }
}
