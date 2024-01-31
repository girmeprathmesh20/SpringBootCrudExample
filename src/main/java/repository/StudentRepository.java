package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model1.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}