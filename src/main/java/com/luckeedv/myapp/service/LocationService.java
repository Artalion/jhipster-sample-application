package com.luckeedv.myapp.service;

import com.luckeedv.myapp.domain.Location;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Location}.
 */
public interface LocationService {

    /**
     * Save a location.
     *
     * @param location the entity to save.
     * @return the persisted entity.
     */
    Location save(Location location);

    /**
     * Get all the locations.
     *
     * @return the list of entities.
     */
    List<Location> findAll();


    /**
     * Get the "id" location.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Location> findOne(Long id);

    /**
     * Delete the "id" location.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
