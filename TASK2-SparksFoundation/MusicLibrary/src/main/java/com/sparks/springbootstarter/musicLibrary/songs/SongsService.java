package com.sparks.springbootstarter.musicLibrary.songs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SongsService {

	
	@Autowired
	private HinSongsRepository songsRepository1;
	@Autowired
	private EngSongsRepository songsRepository2;
	@Autowired
	private KanSongsRepository songsRepository3;
	@Autowired
	private TeluguSongsRepository songsRepository4;
	
	public List<HinSongs> getAllHindiSongs(){
		List<HinSongs> Hindisongs=new ArrayList<>();
		songsRepository1.findAll()
		.forEach(Hindisongs::add);
		return Hindisongs;
	}
	
	public HinSongs getHinSong(String id)
	{
		
		HinSongs h=songsRepository1.findById(id).get();
		return h;
	}
	
	public void addHinSong(HinSongs Hsong) {
		songsRepository1.save(Hsong);
	}

	
	public void updateHinSong(String id, HinSongs Hsong) {
		
			songsRepository1.save(Hsong);
		
	}
	
	public void deleteHinSong(String id) {
		
		songsRepository1.deleteById(id);
		
		}
    
	public List<EngSongs> getAllEnglishSongs(){
		List<EngSongs> Engsongs=new ArrayList<>();
		songsRepository2.findAll()
		.forEach(Engsongs::add);
		return Engsongs;
	}
	
	
	public void addEngSong(EngSongs Esong) {
		// TODO Auto-generated method stub
		songsRepository2.save(Esong);
	}

	
	public EngSongs getEngSong(String id)
	{
		
		EngSongs e=songsRepository2.findById(id).get();
		return e;
	}
	
	public void updateEngSong(String id, EngSongs Esong) {
		
		songsRepository2.save(Esong);
	
}
public void deleteEngSong(String id) {
		
		songsRepository2.deleteById(id);
		
		}
    

public List<KanSongs> getAllKanSongs(){
	List<KanSongs> Kansongs=new ArrayList<>();
	songsRepository3.findAll()
	.forEach(Kansongs::add);
	return Kansongs;
}


public void addKanSong(KanSongs Ksong) {
	// TODO Auto-generated method stub
	songsRepository3.save(Ksong);
}


public KanSongs getKanSong(String id)
{
	
	KanSongs k=songsRepository3.findById(id).get();
	return k;
}

public void updateKanSong(String id, KanSongs Ksong) {
	
	songsRepository3.save(Ksong);

}
public void deleteKanSong(String id) {
	
	songsRepository3.deleteById(id);
	
	}

public List<TeluguSongs> getAllTelSongs(){
	List<TeluguSongs> Telsongs=new ArrayList<>();
	songsRepository4.findAll()
	.forEach(Telsongs::add);
	return Telsongs;
}

public void addTelSong(TeluguSongs Tsong) {
	// TODO Auto-generated method stub
	songsRepository4.save(Tsong);
}

public TeluguSongs getTelSong(String id)
{
	
	TeluguSongs t=songsRepository4.findById(id).get();
	return t;
}

public void updateTelSong(String id, TeluguSongs Tsong) {
	
	songsRepository4.save(Tsong);

}

public void deleteTelSong(String id) {
	
	songsRepository4.deleteById(id);
	
	}

	
}
