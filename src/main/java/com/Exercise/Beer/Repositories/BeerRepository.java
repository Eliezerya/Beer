package com.Exercise.Beer.Repositories;

import com.Exercise.Beer.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;
@Repository
@Transactional
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
