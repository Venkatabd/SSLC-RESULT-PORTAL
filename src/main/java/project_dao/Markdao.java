package project_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import project_dto.Markdto;

public class Markdao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Markdto markdto) {
		entityTransaction.begin();
		entityManager.persist(markdto);
		entityTransaction.commit();
	}

	public Markdto login(int Register_number) {
		Markdto dto = entityManager.find(Markdto.class, Register_number);
		return dto;
	}

	public void update(int Registernumber, String Student_name, String Father_name, String Mother_name,
			String Date_of_birth, int Tamil, int English, int Maths, int Science, int Social_science) {

		Markdto dto = entityManager.find(Markdto.class, Registernumber);
		dto.setRegister_number(Registernumber);
		dto.setStudent_name(Student_name);
		dto.setDate_of_birth(Date_of_birth);
		dto.setFather_name(Father_name);
		dto.setMother_name(Mother_name);
		dto.setTamil(Tamil);
		dto.setEnglish(English);
		dto.setMaths(Maths);
		dto.setScience(Social_science);
		dto.setScience(Social_science);

		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}

	public String delete(int Registernumber) {
		Markdto dto = entityManager.find(Markdto.class, Registernumber);
		if (dto != null) {
			entityTransaction.begin();
			entityManager.remove(dto);
			entityTransaction.commit();
			return "deleted";
		} else {
			return "no data found";
		}

	}

	public List<Markdto> fetchall() {

		Query q = entityManager.createQuery("select abd from Markscard abd");

		List<Markdto> l = q.getResultList();
		return l;

	}

}
