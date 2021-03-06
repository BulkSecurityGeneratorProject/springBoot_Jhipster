package com.computerworks.jhip.service.impl;

import com.computerworks.jhip.service.LocationService;
import com.computerworks.jhip.domain.Location;
import com.computerworks.jhip.repository.LocationRepository;
import com.computerworks.jhip.service.dto.LocationDTO;
import com.computerworks.jhip.service.mapper.LocationMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing Location.
 */
@Service
public class LocationServiceImpl implements LocationService{

    private final Logger log = LoggerFactory.getLogger(LocationServiceImpl.class);

    private final LocationRepository locationRepository;

    private final LocationMapper locationMapper;

    public LocationServiceImpl(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    /**
     * Save a location.
     *
     * @param locationDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public LocationDTO save(LocationDTO locationDTO) {
        log.debug("Request to save Location : {}", locationDTO);
        Location location = locationMapper.toEntity(locationDTO);
        location = locationRepository.save(location);
        return locationMapper.toDto(location);
    }

    /**
     *  Get all the locations.
     *
     *  @return the list of entities
     */
    @Override
    public List<LocationDTO> findAll() {
        log.debug("Request to get all Locations");
        return locationRepository.findAll().stream()
            .map(locationMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     *  Get one location by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    public LocationDTO findOne(String id) {
        log.debug("Request to get Location : {}", id);
        Location location = locationRepository.findOne(id);
        return locationMapper.toDto(location);
    }

    /**
     *  Delete the  location by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Location : {}", id);
        locationRepository.delete(id);
    }
}
