package br.com.fiap.smartcities.test;

import br.com.fiap.smartcities.domain.Estabelecimento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPATesteAltEstabelecimento {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();

			
			Estabelecimento estabelecimento =
					em.find(Estabelecimento.class, 1);
			
			estabelecimento.setNome("Mercado Gergike");
			
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
