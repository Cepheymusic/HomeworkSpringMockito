package Controller;

import Service.DepartmentService;
import Dto.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    public DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(path = "/max-salary")
    public Employee findMaxSalaryByDepartment(@RequestParam int department) {
        return departmentService.findMaxSalaryByDepartment(department);
    }

    @GetMapping(path = "/min-salary")
    public Employee findMinSalaryByDepartment(@RequestParam int department) {
        return departmentService.findMinSalaryByDepartment(department);
    }

    @GetMapping(path = "/all")
    public Collection<Employee> getAllEmployeeByDepartment(@RequestParam int department) {
        return departmentService.getAllEmployeeByDepartment(department);
    }

    @GetMapping(path = "/all")
    public Map<Integer, List<Employee>> getEmployeeByDepartment() {
        return departmentService.getEmployeeByDepartment();
    }
}
