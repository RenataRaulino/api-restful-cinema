package br.com.residencia.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.cinema.entity.Filme;
import br.com.residencia.cinema.repository.FilmeRepository;

@Service
public class FilmeService {
		@Autowired
		FilmeRepository filmeRepository;

		public List<Filme> getAllFilmes(){
			return filmeRepository.findAll();	
		}
		
		public Filme getFilmeById(Integer id) {
			return filmeRepository.findById(id).orElse(null);
		
		}
		
		public Filme saveFilme(Filme filme) {
			return filmeRepository.save(filme);
		}
		
		public Filme updateFilme(Filme filme,Integer id) {
		
			Filme filmeExistenteNoBanco = getFilmeById(id);
			
			filmeExistenteNoBanco.setNome_Br(filme.getNome_Br());
			filmeExistenteNoBanco.setNome_En(filme.getNome_En());
			filmeExistenteNoBanco.setAno_Lancamento(filme.getAno_Lancamento());
			filmeExistenteNoBanco.setSinopse(filme.getSinopse());
			filmeExistenteNoBanco.setDiretor(filme.getDiretor());
			filmeExistenteNoBanco.setGenero(filme.getGenero());
			
		
			return filmeRepository.save(filmeExistenteNoBanco);
			
		}
		
		public Filme deleteFilme(Integer id) {
			filmeRepository.deleteById(id);
			return getFilmeById(id);
		}
		
}	

