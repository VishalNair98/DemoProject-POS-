package com.cg.pos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.dto.StoreDetails;

@Repository
@Transactional
public class PizzaDaoImpl implements PizzaDao {
	@PersistenceContext
	private EntityManager manager;

	public PizzaDetails searchPizza(PizzaDetails details) {
		TypedQuery<PizzaDetails> query = manager.createQuery("select p from PizzaDetails p where p.itemName=:name",
				PizzaDetails.class);
		query.setParameter("name", details.getItemName());
		return query.getSingleResult();
	}

	public List<StoreDetails> searchStore(PizzaDetails pizzaDetails) {
		TypedQuery<StoreDetails> query = manager.createQuery(
				"select  s from StoreDetails s where s.storeId in (select p.storeId from PizzaDetails p where p.itemName=:name) ",
				StoreDetails.class);
		query.setParameter("name", pizzaDetails.getItemName());
		return query.getResultList();
//		TypedQuery<StoreDetails> que = manager.createQuery("select s from StoreDetails s where s.storeId=:id",
//				StoreDetails.class);
//		que.setParameter("id", id);
//		return que.getResultList() ;

	}

}
