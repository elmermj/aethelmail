package com.aethel_enterprise.aethelmail.repos;

import com.aethel_enterprise.aethelmail.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    @Query(value = "SELECT * FROM user_model WHERE email = :email", nativeQuery = true)
    UserModel findByEmail(@Param("email") String email);

}
