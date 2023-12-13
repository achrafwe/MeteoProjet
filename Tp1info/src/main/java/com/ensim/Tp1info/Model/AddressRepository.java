package com.ensim.Tp1info.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public  interface AddressRepository  extends CrudRepository<Address, Long> {



}
