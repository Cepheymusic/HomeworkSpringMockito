package Service;

import Dto.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findMaxSalaryByDepartment(int department);
    Employee findMinSalaryByDepartment(int department);
    Collection<Employee> getAllEmployeeByDepartment(int department);
    Map<Integer, List<Employee>> getEmployeeByDepartment();
}
