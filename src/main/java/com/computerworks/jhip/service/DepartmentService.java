package com.computerworks.jhip.service;

import com.computerworks.jhip.service.dto.DepartmentDTO;
import java.util.List;

/**
 * Service Interface for managing Department.
 */
public interface DepartmentService {

    /**
     * Save a department.
     *
     * @param departmentDTO the entity to save
     * @return the persisted entity
     */
    DepartmentDTO save(DepartmentDTO departmentDTO);

    /**
     *  Get all the departments.
     *
     *  @return the list of entities
     */
    List<DepartmentDTO> findAll();

    /**
     *  Get the "id" department.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    DepartmentDTO findOne(String id);

    /**
     *  Delete the "id" department.
     *
     *  @param id the id of the entity
     */
    void delete(String id);
}
