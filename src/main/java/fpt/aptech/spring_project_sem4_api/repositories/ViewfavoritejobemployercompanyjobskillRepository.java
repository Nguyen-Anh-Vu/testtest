/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package fpt.aptech.spring_project_sem4_api.repositories;

import fpt.aptech.spring_project_sem4_api.entities.Viewfavoritejobemployercompanyjobskill;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vuna
 */
public interface ViewfavoritejobemployercompanyjobskillRepository extends JpaRepository<Viewfavoritejobemployercompanyjobskill, Integer> {
    List<Viewfavoritejobemployercompanyjobskill> findByIdcandidate(int idcandidate);

}
