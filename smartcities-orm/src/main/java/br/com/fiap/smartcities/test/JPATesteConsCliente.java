package br.com.fiap.smartcities.test;

import br.com.fiap.smartcities.domain.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPATesteConsCliente {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();

			
			@SuppressWarnings("unused")
			Cliente cliente = 
					em.find(Cliente.class, 1);
			
					
			
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