package com.sparks.springbootstarter.musicLibrary.songs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SongsController {

	
	@Autowired
	private SongsService songsService1;
	@Autowired
	private SongsService songsService2;
	@Autowired
	private SongsService songsService3;
	@Autowired
	private SongsService songsService4;
	
	
	@RequestMapping("/songs/Hindi")
	public List<HinSongs> getAllHindiSongs()
	{
		return (List<HinSongs>) songsService1.getAllHindiSongs();
	}
	
	
	@RequestMapping("/songs/Hindi/{id}")
	public HinSongs getHinSong(@PathVariable String id)
	{
		return (HinSongs) songsService1.getHinSong(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/songs/Hindi")
	public void addHinSong(@RequestBody HinSongs Hsong) {
		songsService1.addHinSong(Hsong);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/songs/Hindi/{id}")
	public void updateHinSong(@RequestBody HinSongs Hsong, @PathVariable String id) {
		songsService1.updateHinSong(id, Hsong);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/songs/Hindi/{id}")
	public void deleteHinSong(@RequestBody HinSongs Hsong, @PathVariable String id) {
		songsService1.deleteHinSong(id);
	}
	
	@RequestMapping("/songs/English")
	public List<EngSongs> getAllEnglishSongs()
	{
		return songsService2.getAllEnglishSongs();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/songs/English")
	public void addEngSong(@RequestBody EngSongs Esong) {
		songsService2.addEngSong(Esong);
		
		
	}
	@RequestMapping("/songs/English/{id}")
	public EngSongs getEngSong(@PathVariable String id)
	{
		return (EngSongs) songsService2.getEngSong(id);
	}
	
	

	@RequestMapping(method=RequestMethod.PUT,value="/songs/English/{id}")
	public void updateEngSong(@RequestBody EngSongs Esong, @PathVariable String id) {
		songsService2.updateEngSong(id, Esong);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/songs/English/{id}")
	public void deleteEngSong(@RequestBody EngSongs Esong, @PathVariable String id) {
		songsService2.deleteEngSong(id);
	}
	
	@RequestMapping("/songs/Kannada")
	public List<KanSongs> getAllKanSongs()
	{
		return songsService3.getAllKanSongs();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/songs/Kannada")
	public void addKanSong(@RequestBody KanSongs Ksong) {
		songsService3.addKanSong(Ksong);
		
		
	}
	
	@RequestMapping("/songs/Kannada/{id}")
	public KanSongs getKanSong(@PathVariable String id)
	{
		return (KanSongs) songsService3.getKanSong(id);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/songs/Kannada/{id}")
	public void updateKanSong(@RequestBody KanSongs Ksong, @PathVariable String id) {
		songsService3.updateKanSong(id, Ksong);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/songs/Kannada/{id}")
	public void deleteKanSong(@RequestBody KanSongs Esong, @PathVariable String id) {
		songsService3.deleteKanSong(id);
	}
	
	@RequestMapping("/songs/Telugu")
	public List<TeluguSongs> getAllTelSongs()
	{
		return songsService4.getAllTelSongs();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/songs/Telugu")
	public void addTelSong(@RequestBody TeluguSongs Tsong) {
		songsService4.addTelSong(Tsong);
		
		
	}
	
	@RequestMapping("/songs/Telugu/{id}")
	public TeluguSongs getTelSong(@PathVariable String id)
	{
		return (TeluguSongs) songsService4.getTelSong(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/songs/Telugu/{id}")
	public void updateTelSong(@RequestBody TeluguSongs Tsong, @PathVariable String id) {
		songsService4.updateTelSong(id, Tsong);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/songs/Telugu/{id}")
	public void deleteTelSong(@RequestBody TeluguSongs Esong, @PathVariable String id) {
		songsService4.deleteTelSong(id);
	}
	
	
	
	
	
	
	
	
}
