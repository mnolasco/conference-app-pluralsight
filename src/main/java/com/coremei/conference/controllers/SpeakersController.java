package com.coremei.conference.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.coremei.conference.models.Session;
import com.coremei.conference.models.Speaker;
import com.coremei.conference.repositories.SessionRepository;
import com.coremei.conference.repositories.SpeakerRepository;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakersController {

	@Autowired
	private SpeakerRepository speakerRepository;

	@GetMapping
	public List<Speaker> list() {
		return speakerRepository.findAll();
	}

	@GetMapping("{id}")
	public Speaker get(@PathVariable Long id) {
		return speakerRepository.findById(id).orElseGet(null);
	}

	@PostMapping
	public Speaker create(@RequestBody final Speaker speaker) {
		return speakerRepository.saveAndFlush(speaker);
	}

	@PutMapping
	public Speaker update(@RequestBody final Speaker speaker) {
		Speaker foundSpeaker = speakerRepository.findById(speaker.getId()).orElseGet(null);
		BeanUtils.copyProperties(speaker, foundSpeaker, "speaker_id");
		return speakerRepository.saveAndFlush(foundSpeaker);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		speakerRepository.deleteById(id);
	}
}
