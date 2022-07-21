package ru.wain.authservice.repo;

import org.springframework.data.repository.CrudRepository;
import ru.wain.authservice.entity.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, String> {
}
