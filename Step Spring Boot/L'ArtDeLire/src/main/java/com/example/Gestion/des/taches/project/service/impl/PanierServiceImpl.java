package com.example.Gestion.des.taches.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.Gestion.des.taches.project.model.Livre;
import com.example.Gestion.des.taches.project.model.Panier;
import com.example.Gestion.des.taches.project.repository.PanierRepository;
import com.example.Gestion.des.taches.project.service.PanierService;

@Service
public class PanierServiceImpl implements PanierService {
	@Autowired
	PanierRepository repository ;
	
	@Override
	public Optional<Panier> findOne(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Iterable<Panier> findAll() {
		// TODO Auto-generated method stub
		return  repository.findAll();
	}

	@Override
	public void update(Panier Panier) {
		// TODO Auto-generated method stub
		repository.save(Panier);
		
	}

	@Override
	public void save(Panier Panier) {
		// TODO Auto-generated method stub
		repository.save(Panier);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}


	@Override
	public void delete(Panier panier) {
		// TODO Auto-generated method stub
		repository.delete(panier);
	}
	
	@Override
	public void addLivre(Panier panier) {
		
		repository.insertUser(panier.getId_panier(),panier.getQuantite_ajouter(), panier.getSomme_ajoute(), panier.getLivre().getId());
	}
	

}
