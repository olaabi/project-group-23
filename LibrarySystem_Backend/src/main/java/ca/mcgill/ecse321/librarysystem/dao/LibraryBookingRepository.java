package ca.mcgill.ecse321.librarysystem.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.librarysystem.model.LibraryBooking;
import ca.mcgill.ecse321.librarysystem.model.Customer;

public interface LibraryBookingRepository extends CrudRepository<LibraryBooking, Integer> {

    LibraryBooking findLibraryBookingById(int id);

    List<LibraryBooking> findByUser(Customer user);

    
}
