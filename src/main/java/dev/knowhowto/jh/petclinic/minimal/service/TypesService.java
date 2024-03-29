package dev.knowhowto.jh.petclinic.minimal.service;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import dev.knowhowto.jh.petclinic.minimal.service.dto.TypesDTO;

/**
 * Service Interface for managing {@link dev.knowhowto.jh.petclinic.minimal.domain.Types}.
 */
public interface TypesService {
    /**
     * Save a types.
     *
     * @param typesDTO the entity to save.
     * @return the persisted entity.
     */
    TypesDTO save(TypesDTO typesDTO);

    /**
     * Updates a types.
     *
     * @param typesDTO the entity to update.
     * @return the persisted entity.
     */
    TypesDTO update(TypesDTO typesDTO);

    /**
     * Partially updates a types.
     *
     * @param typesDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<TypesDTO> partialUpdate(TypesDTO typesDTO);

    /**
     * Get all the types.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<TypesDTO> findAll(Pageable pageable);

    /**
     * Get the "id" types.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TypesDTO> findOne(Long id);

    /**
     * Delete the "id" types.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
