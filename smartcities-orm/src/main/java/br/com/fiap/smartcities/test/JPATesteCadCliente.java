package br.com.fiap.smartcities.test;

import br.com.fiap.smartcities.domain.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPATesteCadCliente {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
			
			
			em.getTransaction().begin();
			
			Cliente novo = new Cliente();
			novo.setNome("Aparecido de Jesus");
			novo.getStatusCliente();
			
			em.persist(novo);
			
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
