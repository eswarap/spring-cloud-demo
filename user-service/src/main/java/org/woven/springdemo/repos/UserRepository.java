package org.woven.springdemo.repos;

import org.bson.types.*;
import org.springframework.data.mongodb.repository.*;
import org.springframework.stereotype.*;
import org.woven.springdemo.entities.*;


@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
}
