/*
 * Date : 7/16/2021
 * File Name: EmployeeRepository.Java
 *Author : Hamed
 *
 */

package repository;

import com.example.employeemanagerwithangular.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Class Description :
 *
 * @author Hamed
 * @version 1.0 16 Jul 2021
 * @contact:
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    void deleteEmployeeById(Long id);

    Optional findEmployeeById(Long id);
}
