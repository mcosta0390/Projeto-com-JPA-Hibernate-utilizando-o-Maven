package br.com.fiap.smartcities.test;

import br.com.fiap.smartcities.domain.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPATesteAltCliente {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();


			Cliente cliente =
					em.find(Cliente.class, 1);
			
			cliente.setNome("Marcela Batista");
			cliente.getStatusCliente();
			
			em.getTransaction().begin();
			
			em.getTransaction().commit();
			
			
					
			
		} catch (Exception e) {
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
				}
			e.printStackTrace();
			}
		if (em != null) {
			em.close();
			}
		System.exit(0);
		}
	}
